/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Alexc
 */
public class eventsFrame extends javax.swing.JFrame {

    /**
     * Creates new form eventsFrame
     */
    public eventsFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        eventsPane = new javax.swing.JScrollPane();
        eventsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        eventsTable.setBackground(new java.awt.Color(13, 59, 128));
        eventsTable.setForeground(new java.awt.Color(255, 255, 255));
        eventsTable.setModel(new javax.swing.table.DefaultTableModel(
                new String [][] {
                        {"2022 Abu Dhabi GP, Yas Marina", "Charles Leclerc", "4-Dec-22"},
                        {"2022 Saudi Arabian GP, Jeddah", "Charles Leclerc", "27-Nov-22"},
                        {"2022 Australian GP, Melbourne", "Charles Leclerc", "20-Nov-22"},
                        {"2022 São Paulo GP, São Paulo", "Charles Leclerc", "6-Nov-22"},
                        {"2022 Mexican GP, Mexico City", "Charles Leclerc", "30-Oct-22"},
                        {"2022 United States GP, Austin", "Charles Leclerc", "23-Oct-22"},
                        {"2022 Japanese GP, Suzuka", "Valtteri Bottas", "9-Oct-22"},
                        {"2022 Singapore GP, Marina Bay", "Charles Leclerc", "2-Oct-22"},
                        {"2022 Russian GP, Sochi", "Carlos Sainz Jr.", "25-Sep-22"},
                        {"2022 Italian GP, Monza", "Daniel Ricciardo", "11-Sep-22"},
                        {"2022 Dutch GP, Zandvoort", "Lewis Hamilton", "4-Sep-22"},
                        {"2022 Belgian GP, Spa-Francorchamps", "Lewis Hamilton", "28-Aug-22"},
                        {"2022 Hungarian GP, Budapest", "Lewis Hamilton", "24-Jul-22"},
                        {"2022 British GP, Silverstone", "Lewis Hamilton", "10-Jul-22"},
                        {"2022 Austrian GP, Spielberg", "Max Verstappen", "3-Jul-22"},
                        {"2022 French GP, Le Castellet", "Charles Leclerc", "26-Jun-22"},
                        {"2022 British GP, Silverstone", "Charles Leclerc", "19-Jun-22"},
                        {"2022 Canadian GP, Montreal", "Charles Leclerc", "12-Jun-22"},
                        {"2022 Azerbaijan GP, Baku", "Charles Leclerc", "5-Jun-22"},
                        {"2022 Monaco GP, Monte Carlo", "Charles Leclerc", "22-May-22"},
                        {"2022 Spanish GP, Barcelona", "Charles Leclerc", "8-May-22"},
                        {"2022 Vietnamese GP, Hanoi", "Charles Leclerc", "24-Apr-22"},
                        {"2022 Australian GP, Melbourne", "Charles Leclerc", "10-Apr-22"},
                        {"2022 Saudi Arabian GP, Jeddah", "Charles Leclerc", "27-Mar-22"},
                        {"2022 Bahrain GP, Sakhir", "Charles Leclerc", "20-Mar-22"},
                        {"2021 Abu Dhabi GP, Yas Marina", "Max Verstappen", "12-Dec-21"},
                        {"2021 Saudi Arabian GP, Jeddah", "Max Verstappen", "5-Dec-21"},
                        {"2021 Qatar GP, Lusail", "Max Verstappen", "21-Nov-21"},
                        {"2021 São Paulo GP, São Paulo", "Lewis Hamilton", "14-Nov-21"},
                        {"2021 Mexican GP, Mexico City", "Max Verstappen", "7-Nov-21"},
                        {"2021 United States GP, Austin", "Charles Leclerc", "24-Oct-21"},
                        {"2021 Turkish GP, Istanbul", "Valtteri Bottas", "10-Oct-21"},
                        {"2021 Russian GP, Sochi", "Lewis Hamilton", "26-Sep-21"},
                        {"2021 Italian GP, Monza", "Daniel Ricciardo", "12-Sep-21"},
                        {"2021 Dutch GP, Zandvoort", "Max Verstappen", "5-Sep-21"},
                        {"2021 Belgian GP, Spa-Francorchamps", "Max Verstappen", "29-Aug-21"},
                        {"2021 Hungarian GP, Budapest", "Esteban Ocon", "1-Aug-21"},
                        {"2021 British GP, Silverstone", "Lewis Hamilton", "18-Jul-21"},
                        {"2021 Austrian GP, Spielberg", "Max Verstappen", "4-Jul-21"},
                        {"2021 Styrian GP, Spielberg", "Max Verstappen", "27-Jun-21"},
                        {"2021 French GP, Le Castellet", "Max Verstappen", "20-Jun-21"},
                        {"2021 Azerbaijan GP, Baku", "Sergio Perez", "6-Jun-21"},
                        {"2021 Monaco GP, Monte Carlo", "Max Verstappen", "23-May-21"},
                        {"2021 Spanish GP, Barcelona", "Lewis Hamilton", "9-May-21"},
                        {"2021 Portuguese GP, Portimão", "Lewis Hamilton", "2-May-21"},
                        {"2021 Emilia Romagna GP, Imola", "Max Verstappen", "18-Apr-21"},
                        {"2021 Bahrain GP, Sakhir", "Lewis Hamilton", "28-Mar-21"},
                        {"2020 Abu Dhabi GP, Yas Marina", "Max Verstappen", "13-Dec-20"},
                        {"2020 Sakhir GP, Sakhir", "Sergio Perez", "6-Dec-20"},
                        {"2020 Bahrain GP, Sakhir", "Lewis Hamilton", "29-Nov-20"},
                        {"2020 Turkish GP, Istanbul", "Lewis Hamilton", "15-Nov-20"},
                        {"2020 Emilia Romagna GP, Imola", "Lewis Hamilton", "1-Nov-20"},
                        {"2020 Portuguese GP, Portimão", "Lewis Hamilton", "25-Oct-20"},
                        {"2020 Eifel GP, Nürburg", "Lewis Hamilton", "11-Oct-20"},
                        {"2020 Tuscan GP, Mugello", "Lewis Hamilton", "13-Sep-20"},
                        {"2020 Italian GP, Monza", "Pierre Gasly", "6-Sep-20"},
                        {"2020 Belgian GP, Spa-Francorchamps", "Lewis Hamilton", "30-Aug-20"},
                        {"2020 Spanish GP, Barcelona", "Lewis Hamilton", "16-Aug-20"},
                        {"2020 British GP, Silverstone", "Lewis Hamilton", "2-Aug-20"},
                        {"2020 Hungarian GP, Budapest", "Lewis Hamilton", "19-Jul-20"},
                        {"2020 Styrian GP, Spielberg", "Lewis Hamilton", "12-Jul-20"},
                        {"2020 Austrian GP, Spielberg", "Valtteri Bottas", "5-Jul-20"},
                        {"2019 Abu Dhabi GP, Yas Marina", "Lewis Hamilton", "1-Dec-19"},
                        {"2019 Brazilian GP, São Paulo", "Max Verstappen", "17-Nov-19"},
                        {"2019 United States GP, Austin", "Valtteri Bottas", "3-Nov-19"},
                        {"2019 Mexican GP, Mexico City", "Lewis Hamilton", "27-Oct-19"},
                        {"2019 Japanese GP, Suzuka", "Valtteri Bottas", "13-Oct-19"},
                        {"2019 Russian GP, Sochi", "Lewis Hamilton", "29-Sep-19"},
                        {"2019 Singapore GP, Marina Bay", "Sebastian Vettel", "22-Sep-19"},
                        {"2019 Italian GP, Monza", "Charles Leclerc", "8-Sep-19"},
                        {"2019 Belgian GP, Spa-Francorchamps", "Charles Leclerc", "1-Sep-19"},
                        {"2019 Hungarian GP, Budapest", "Lewis Hamilton", "4-Aug-19"},
                        {"2019 German GP, Hockenheim", "Max Verstappen", "28-Jul-19"},
                        {"2019 British GP, Silverstone", "Lewis Hamilton", "14-Jul-19"},
                        {"2019 Austrian GP, Spielberg", "Max Verstappen", "30-Jun-19"},
                        {"2019 French GP, Le Castellet", "Lewis Hamilton", "23-Jun-19"},
                        {"2019 Canadian GP, Montreal", "Lewis Hamilton", "9-Jun-19"},
                        {"2019 Monaco GP, Monte Carlo", "Lewis Hamilton", "26-May-19"},
                        {"2019 Spanish GP, Barcelona", "Lewis Hamilton", "12-May-19"},
                        {"2019 Azerbaijan GP, Baku", "Valtteri Bottas", "28-Apr-19"},
                        {"2019 Chinese GP, Shanghai", "Lewis Hamilton", "14-Apr-19"},
                        {"2019 Bahrain GP, Sakhir", "Lewis Hamilton", "31-Mar-19"},
                        {"2019 Australian GP, Melbourne", "Valtteri Bottas", "17-Mar-19"},
                        {"2018 Abu Dhabi GP, Yas Marina", "Lewis Hamilton", "25-Nov-18"},
                        {"2018 Brazilian GP, São Paulo", "Lewis Hamilton", "11-Nov-18"},
                        {"2018 Mexican GP, Mexico City", "Max Verstappen", "28-Oct-18"},
                        {"2018 United States GP, Austin", "Kim Alfa", "21-Oct-18"},
                        {"2018 Japanese GP, Suzuka", "Lewis Hamilton", "7-Oct-18"},
                        {"2018 Russian GP, Sochi", "Lewis Hamilton", "30-Sep-18"},
                        {"2018 Singapore GP, Marina Bay", "Lewis Hamilton", "16-Sep-18"},
                        {"2018 Italian GP, Monza", "Lewis Hamilton", "2-Sep-18"},
                        {"2018 Belgian GP, Spa-Francorchamps", "Sebastian Vettel", "26-Aug-18"},
                        {"2018 Hungarian GP, Budapest", "Lewis Hamilton", "29-Jul-18"},
                        {"2018 German GP, Hockenheim", "Lewis Hamilton", "22-Jul-18"},
                        {"2018 British GP, Silverstone", "Sebastian Vettel", "8-Jul-18"},
                        {"2018 Austrian GP, Spielberg", "Max Verstappen", "1-Jul-18"},
                        {"2018 French GP, Le Castellet", "Lewis Hamilton", "24-Jun-18"},
                        {"2018 Canadian GP, Montreal", "Sebastian Vettel", "10-Jun-18"},
                        {"2018 Monaco GP, Monte Carlo", "Daniel Ricciardo", "27-May-18"},
                        {"2018 Spanish GP, Barcelona", "Lewis Hamilton", "13-May-18"},
                        {"2018 Azerbaijan GP, Baku", "Lewis Hamilton", "29-Apr-18"},
                        {"2018 Chinese GP, Shanghai", "Daniel Ricciardo", "15-Apr-18"},
                        {"2018 Bahrain GP, Sakhir", "Sebastian Vettel", "8-Apr-18"},
                        {"2018 Australian GP, Melbourne", "Sebastian Vettel", "25-Mar-18"},
                        {"2017 Abu Dhabi GP, Yas Marina", "Valtteri Bottas", "26-Nov-17"},
                        {"2017 Brazilian GP, São Paulo", "Sebastian Vettel", "12-Nov-17"},
                        {"2017 Mexican GP, Mexico City", "Max Verstappen", "29-Oct-17"},
                        {"2017 United States GP, Austin", "Lewis Hamilton", "22-Oct-17"},
                        {"2017 Japanese GP, Suzuka", "Lewis Hamilton", "8-Oct-17"},
                        {"2017 Malaysian GP, Sepang", "Max Verstappen", "1-Oct-17"},
                        {"2017 Singapore GP, Marina Bay", "Lewis Hamilton", "17-Sep-17"},
                        {"2017 Italian GP, Monza", "Lewis Hamilton", "3-Sep-17"},
                        {"2017 Belgian GP, Spa-Francorchamps", "Lewis Hamilton", "27-Aug-17"},
                        {"2017 Hungarian GP, Budapest", "Sebastian Vettel", "30-Jul-17"},
                        {"2017 British GP, Silverstone", "Lewis Hamilton", "16-Jul-17"},
                        {"2017 Austrian GP, Spielberg", "Valtteri Bottas", "9-Jul-17"},
                        {"2017 Azerbaijan GP, Baku", "Daniel Ricciardo", "25-Jun-17"},
                        {"2017 Canadian GP, Montreal", "Lewis Hamilton", "11-Jun-17"},
                        {"2017 Monaco GP, Monte Carlo", "Sebastian Vettel", "28-May-17"},
                        {"2017 Spanish GP, Barcelona", "Lewis Hamilton", "14-May-17"},
                        {"2017 Russian GP, Sochi", "Valtteri Bottas", "30-Apr-17"},
                        {"2017 Bahrain GP, Sakhir", "Sebastian Vettel", "16-Apr-17"},
                        {"2017 Chinese GP, Shanghai", "Lewis Hamilton", "9-Apr-17"},
                        {"2017 Australian GP, Melbourne", "Sebastian Vettel", "26-Mar-17"},
                        {"2016 Abu Dhabi GP, Yas Marina", "Lewis Hamilton", "27-Nov-16"},
                        {"2016 Brazilian GP, São Paulo", "Lewis Hamilton", "13-Nov-16"},
                        {"2016 Mexican GP, Mexico City", "Lewis Hamilton", "30-Oct-16"},
                        {"2016 United States GP, Austin", "Lewis Hamilton", "23-Oct-16"},
                        {"2016 Japanese GP, Suzuka", "Nico Rosberg", "9-Oct-16"},
                        {"2016 Malaysian GP, Sepang", "Daniel Ricciardo", "2-Oct-16"},
                        {"2016 Singapore GP, Marina Bay", "Nico Rosberg", "18-Sep-16"},
                        {"2016 Italian GP, Monza", "Nico Rosberg", "4-Sep-16"},
                        {"2016 Belgian GP, Spa-Francorchamps", "Nico Rosberg", "28-Aug-16"},
                        {"2016 German GP, Hockenheim", "Lewis Hamilton", "31-Jul-16"},
                        {"2016 Hungarian GP, Budapest", "Lewis Hamilton", "24-Jul-16"},
                        {"2016 British GP, Silverstone", "Lewis Hamilton", "10-Jul-16"},
                        {"2016 Austrian GP, Spielberg", "Lewis Hamilton", "3-Jul-16"},
                        {"2016 European GP, Baku", "Nico Rosberg", "19-Jun-16"},
                        {"2016 Canadian GP, Montreal", "Lewis Hamilton", "12-Jun-16"},
                        {"2016 Monaco GP, Monte Carlo", "Lewis Hamilton", "29-May-16"},
                        {"2016 Spanish GP, Barcelona", "Max Verstappen", "15-May-16"},
                        {"2016 Russian GP, Sochi", "Nico Rosberg", "1-May-16"},
                        {"2016 Chinese GP, Shanghai", "Nico Rosberg", "17-Apr-16"},
                        {"2016 Bahrain GP, Sakhir", "Nico Rosberg", "3-Apr-16"},
                        {"2016 Australian GP, Melbourne", "Nico Rosberg", "20-Mar-16"},
                        {"2015 Abu Dhabi GP, Yas Marina", "Nico Rosberg", "29-Nov-15"},
                        {"2015 Brazilian GP, São Paulo", "Nico Rosberg", "15-Nov-15"},
                        {"2015 Mexican GP, Mexico City", "Nico Rosberg", "1-Nov-15"},
                        {"2015 United States GP, Austin", "Lewis Hamilton", "25-Oct-15"},
                        {"2015 Russian GP, Sochi", "Lewis Hamilton", "11-Oct-15"},
                        {"2015 Japanese GP, Suzuka", "Lewis Hamilton", "27-Sep-15"},
                        {"2015 Singapore GP, Marina Bay", "Sebastian Vettel", "20-Sep-15"},
                        {"2015 Italian GP, Monza", "Lewis Hamilton", "6-Sep-15"},
                        {"2015 Belgian GP, Spa-Francorchamps", "Lewis Hamilton", "23-Aug-15"},
                        {"2015 Hungarian GP, Budapest", "Sebastian Vettel", "26-Jul-15"},
                        {"2015 British GP, Silverstone", "Lewis Hamilton", "5-Jul-15"},
                        {"2015 Austrian GP, Spielberg", "Nico Rosberg", "21-Jun-15"},
                        {"2015 Canadian GP, Montreal", "Lewis Hamilton", "7-Jun-15"},
                        {"2015 Monaco GP, Monte Carlo", "Nico Rosberg", "24-May-15"},
                        {"2015 Spanish GP, Barcelona", "Nico Rosberg", "10-May-15"},
                        {"2015 Bahrain GP, Sakhir", "Lewis Hamilton", "19-Apr-15"},
                        {"2015 Chinese GP, Shanghai", "Lewis Hamilton", "12-Apr-15"},
                        {"2015 Malaysian GP, Sepang", "Sebastian Vettel", "29-Mar-15"},
                        {"2015 Australian GP, Melbourne", "Lewis Hamilton", "15-Mar-15"},
                        {"2014 Abu Dhabi GP, Yas Marina", "Lewis Hamilton", "23-Nov-14"},
                        {"2014 Brazilian GP, São Paulo", "Nico Rosberg", "9-Nov-14"},
                        {"2014 United States GP, Austin", "Lewis Hamilton", "2-Nov-14"},
                        {"2014 Russian GP, Sochi", "Lewis Hamilton", "12-Oct-14"},
                        {"2014 Japanese GP, Suzuka", "Lewis Hamilton", "5-Oct-14"},
                        {"2014 Singapore GP, Marina Bay", "Lewis Hamilton", "21-Sep-14"},
                        {"2014 Italian GP, Monza", "Lewis Hamilton", "7-Sep-14"},
                        {"2014 Belgian GP, Spa-Francorchamps", "Daniel Ricciardo", "24-Aug-14"},
                        {"2014 Hungarian GP, Budapest", "Daniel Ricciardo", "27-Jul-14"},
                        {"2014 German GP, Hockenheim", "Lewis Hamilton", "20-Jul-14"},
                        {"2014 British GP, Silverstone", "Lewis Hamilton", "6-Jul-14"},
                        {"2014 Austrian GP, Spielberg", "Nico Rosberg", "22-Jun-14"},
                        {"2014 Canadian GP, Montreal", "Daniel Ricciardo", "8-Jun-14"},
                        {"2014 Monaco GP, Monte Carlo", "Nico Rosberg", "25-May-14"},
                        {"2014 Spanish GP, Barcelona", "Lewis Hamilton", "11-May-14"},
                        {"2014 Chinese GP, Shanghai", "Lewis Hamilton", "20-Apr-14"},
                        {"2014 Bahrain GP, Sakhir", "Lewis Hamilton", "6-Apr-14"},
                        {"2014 Malaysian GP, Sepang", "Lewis Hamilton", "30-Mar-14"},
                        {"2014 Australian GP, Melbourne", "Nico Rosberg", "16-Mar-14"},
                        {"2013 Brazilian GP, São Paulo", "Sebastian Vettel", "24-Nov-13"},
                        {"2013 United States GP, Austin", "Sebastian Vettel", "17-Nov-13"},
                        {"2013 Abu Dhabi GP, Yas Marina", "Sebastian Vettel", "3-Nov-13"},
                        {"2013 Indian GP, Greater Noida", "Sebastian Vettel", "27-Oct-13"},
                        {"2013 Japanese GP, Suzuka", "Sebastian Vettel", "13-Oct-13"},
                        {"2013 Korean GP, Yeongam", "Sebastian Vettel", "6-Oct-13"},
                        {"2013 Singapore GP, Marina Bay", "Sebastian Vettel", "22-Sep-13"},
                        {"2013 Italian GP, Monza", "Sebastian Vettel", "8-Sep-13"},
                        {"2013 Belgian GP, Spa-Francorchamps", "Sebastian Vettel", "25-Aug-13"},
                        {"2013 Hungarian GP, Budapest", "Lewis Hamilton", "28-Jul-13"},
                        {"2013 German GP, Nürburg", "Sebastian Vettel", "7-Jul-13"},
                        {"2013 British GP, Silverstone", "Nico Rosberg", "30-Jun-13"},
                        {"2013 Canadian GP, Montreal", "Sebastian Vettel", "9-Jun-13"},
                        {"2013 Monaco GP, Monte Carlo", "Nico Rosberg", "26-May-13"},
                        {"2013 Spanish GP, Barcelona", "Fernando Alonso", "12-May-13"},
                        {"2013 Bahrain GP, Sakhir", "Sebastian Vettel", "21-Apr-13"},
                        {"2013 Chinese GP, Shanghai", "Fernando Alonso", "14-Apr-13"},
                        {"2013 Malaysian GP, Sepang", "Sebastian Vettel", "24-Mar-13"},
                        {"2013 Australian GP, Melbourne", "Kimi Räikkönen", "17-Mar-13"},
                        {"2012 Brazilian GP, São Paulo", "Jenson Button", "25-Nov-12"},
                        {"2012 United States GP, Austin", "Lewis Hamilton", "18-Nov-12"},
                        {"2012 Abu Dhabi GP, Yas Marina", "Kimi Räikkönen", "4-Nov-12"},
                        {"2012 Indian GP, Greater Noida", "Sebastian Vettel", "28-Oct-12"},
                        {"2012 Korean GP, Yeongam", "Sebastian Vettel", "14-Oct-12"},
                        {"2012 Japanese GP, Suzuka", "Sebastian Vettel", "7-Oct-12"},
                        {"2012 Singapore GP, Marina Bay", "Sebastian Vettel", "23-Sep-12"},
                        {"2012 Italian GP, Monza", "Lewis Hamilton", "9-Sep-12"},
                        {"2012 Belgian GP, Spa-Francorchamps", "Jenson Button", "2-Sep-12"},
                        {"2012 Hungarian GP, Budapest", "Lewis Hamilton", "29-Jul-12"},
                        {"2012 German GP, Hockenheim", "Fernando Alonso", "22-Jul-12"},
                        {"2012 British GP, Silverstone", "Mark Webber", "8-Jul-12"},
                        {"2012 European GP, Valencia", "Fernando Alonso", "24-Jun-12"},
                        {"2012 Canadian GP, Montreal", "Lewis Hamilton", "10-Jun-12"},
                        {"2012 Monaco GP, Monte Carlo", "Mark Webber", "27-May-12"},
                        {"2012 Spanish GP, Barcelona", "Pastor Maldonado", "13-May-12"},
                        {"2012 Bahrain GP, Sakhir", "Sebastian Vettel", "22-Apr-12"},
                        {"2012 Chinese GP, Shanghai", "Nico Rosberg", "15-Apr-12"},
                        {"2012 Malaysian GP, Sepang", "Fernando Alonso", "25-Mar-12"},
                        {"2012 Australian GP, Melbourne", "Jenson Button", "18-Mar-12"},
                        {"2011 Brazilian GP, São Paulo", "Mark Webber", "27-Nov-11"},
                        {"2011 Abu Dhabi GP, Yas Marina", "Lewis Hamilton", "13-Nov-11"},
                        {"2011 Indian GP, Greater Noida", "Sebastian Vettel", "30-Oct-11"},
                        {"2011 Korean GP, Yeongam", "Sebastian Vettel", "16-Oct-11"},
                        {"2011 Japanese GP, Suzuka", "Jenson Button", "9-Oct-11"},
                        {"2011 Singapore GP, Marina Bay", "Sebastian Vettel", "25-Sep-11"},
                        {"2011 Italian GP, Monza", "Sebastian Vettel", "11-Sep-11"},
                        {"2011 Belgian GP, Spa-Francorchamps", "Sebastian Vettel", "28-Aug-11"},
                        {"2011 Hungarian GP, Budapest", "Jenson Button", "31-Jul-11"},
                        {"2011 German GP, Nürburg", "Lewis Hamilton", "24-Jul-11"},
                        {"2011 British GP, Silverstone", "Fernando Alonso", "10-Jul-11"},
                        {"2011 European GP, Valencia", "Sebastian Vettel", "26-Jun-11"},
                        {"2011 Canadian GP, Montreal", "Jenson Button", "12-Jun-11"},
                        {"2011 Monaco GP, Monte Carlo", "Sebastian Vettel", "29-May-11"},
                        {"2011 Spanish GP, Barcelona", "Sebastian Vettel", "22-May-11"},
                        {"2011 Turkish GP, Istanbul", "Sebastian Vettel", "8-May-11"},
                        {"2011 Chinese GP, Shanghai", "Lewis Hamilton", "17-Apr-11"},
                        {"2011 Malaysian GP, Sepang", "Sebastian Vettel", "10-Apr-11"},
                        {"2011 Australian GP, Melbourne", "Sebastian Vettel", "27-Mar-11"},
                        {"2010 Abu Dhabi GP, Yas Marina", "Sebastian Vettel", "14-Nov-10"},
                        {"2010 Brazilian GP, São Paulo", "Sebastian Vettel", "7-Nov-10"},
                        {"2010 Korean GP, Yeongam", "Fernando Alonso", "24-Oct-10"},
                        {"2010 Japanese GP, Suzuka", "Sebastian Vettel", "10-Oct-10"},
                        {"2010 Singapore GP, Marina Bay", "Lewis Hamilton", "26-Sep-10"},
                        {"2010 Italian GP, Monza", "Fernando Alonso", "12-Sep-10"},
                        {"2010 Belgian GP, Spa-Francorchamps", "Lewis Hamilton", "29-Aug-10"},
                        {"2010 Hungarian GP, Budapest", "Mark Webber", "1-Aug-10"},
                        {"2010 German GP, Hockenheim", "Fernando Alonso", "25-Jul-10"},
                        {"2010 British GP, Silverstone", "Lewis Hamilton", "11-Jul-10"},
                        {"2010 European GP, Valencia", "Sebastian Vettel", "27-Jun-10"},
                        {"2010 Canadian GP, Montreal", "Lewis Hamilton", "13-Jun-10"},
                        {"2010 Turkish GP, Istanbul", "Lewis Hamilton", "30-May-10"},
                        {"2010 Monaco GP, Monte Carlo", "Mark Webber", "16-May-10"},
                        {"2010 Spanish GP, Barcelona", "Mark Webber", "9-May-10"},
                        {"2010 Chinese GP, Shanghai", "Jenson Button", "18-Apr-10"},
                        {"2010 Malaysian GP, Sepang", "Sebastian Vettel", "4-Apr-10"},
                        {"2010 Australian GP, Melbourne", "Jenson Button", "28-Mar-10"},
                        {"2010 Bahrain GP, Sakhir", "Fernando Alonso", "14-Mar-10"},
                },
                new String [] {
                        "Event Name and Location", "Winner", "Date"
                }
        ));
        eventsPane.setViewportView(eventsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eventsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eventsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    /*
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(eventsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eventsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eventsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eventsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eventsFrame().setVisible(true);
            }
        });
    } */

    public static void run() {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(eventsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(eventsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(eventsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(eventsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eventsFrame().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify
    private javax.swing.JScrollPane eventsPane;
    private javax.swing.JTable eventsTable;
    // End of variables declaration
}