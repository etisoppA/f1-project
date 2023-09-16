package F1Prediction;

import org.apache.commons.math3.stat.regression.SimpleRegression;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearRegression {
    public static double regression(int[] wins) {
        SimpleRegression regression = new SimpleRegression();
        for (int i = 0; i < wins.length; i++)
        {
            regression.addData(i, wins[i]);
        }
        return round(regression.predict(wins.length), 0);
    }

    private static double round(double value, int places)
    {
        if (places < 0)
            throw new IllegalArgumentException();
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
