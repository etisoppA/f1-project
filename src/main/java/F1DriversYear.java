import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class F1DriversYear {
    public static String getDriverChampion(String y) {
        int year = Integer.valueOf(y); // Specify the desired year
        String rawData = "";

        try {
            // Create the URL for the API endpoint with the specified year
            String apiUrl = "http://ergast.com/api/f1/" + year + "/driverStandings.json";
            URL url = new URL(apiUrl);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the HTTP request method to GET
            connection.setRequestMethod("GET");

            // Read the API response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Check if the response code is 200 (OK)
            if (connection.getResponseCode() == 200) {
                System.out.println("API Response:");
                System.out.println(response.toString());
                rawData = response.toString();
            } else {
                System.out.println("Error: " + connection.getResponseCode());
            }

            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        String id = "";
        String wdc = "";
        int i = 0;
        while (!(id.equals("/wiki\\/"))) {
            id = rawData.substring(i, i + 7);
            i++;
        }
        //System.out.println(id);
        //System.out.println("found");
        int j = i + 6;
        while (rawData.charAt(j) != '\"') {
            wdc = wdc + rawData.substring(j, j + 1);
            j++;
            //System.out.println(wdc);
        }
        wdc = wdc.replace("_", " ");
        wdc = wdc.substring(0, 1).toUpperCase() + wdc.substring(1, wdc.length());
        for (int k = 0; k < wdc.length(); k++) {
            if (wdc.substring(k, k + 1).equals(" ")) {
                wdc = wdc.substring(0, k + 1) + wdc.substring(k + 1, k + 2).toUpperCase() + wdc.substring(k + 2, wdc.length());
            }
        }
        return wdc;
    }
}