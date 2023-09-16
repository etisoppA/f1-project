/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Alexc
 */
public class F1Window extends javax.swing.JFrame {

    /**
     * Creates new form F1Window
     */
    public F1Window() {
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

        jPanel1 = new javax.swing.JPanel();
        openDatabaseButton = new javax.swing.JButton();
        yearOptions = new javax.swing.JComboBox<>();
        functionOptions = new javax.swing.JComboBox<>();
        execute = new javax.swing.JButton();
        f1FocusLabel = new javax.swing.JLabel();
        functionLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        resultField = new javax.swing.JTextField();
        setResizable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 47, 54));

        openDatabaseButton.setBackground(new java.awt.Color(49, 47, 54));
        openDatabaseButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        openDatabaseButton.setForeground(new java.awt.Color(255, 255, 255));
        openDatabaseButton.setText("Open Database");
        openDatabaseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openDatabaseButtonMouseClicked(evt);
            }
        });

        yearOptions.setBackground(new java.awt.Color(49, 47, 54));
        yearOptions.setForeground(new java.awt.Color(255, 255, 255));
        yearOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959",
                "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973",
                "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987",
                "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001",
                "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                "2016", "2017", "2018", "2019", "2020", "2021", "2022"}));

        functionOptions.setBackground(new java.awt.Color(49, 47, 54));
        functionOptions.setForeground(new java.awt.Color(255, 255, 255));
        functionOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Drivers' Champion",
                "Constructors' Champion"}));

        execute.setBackground(new java.awt.Color(49, 47, 54));
        execute.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        execute.setForeground(new java.awt.Color(255, 255, 255));
        execute.setText("Execute");
        execute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                executeMouseClicked(evt);
            }
        });

        f1FocusLabel.setBackground(new java.awt.Color(49, 47, 54));
        f1FocusLabel.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        f1FocusLabel.setForeground(new java.awt.Color(255, 255, 255));
        f1FocusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f1FocusLabel.setText("F1 Focus");

        functionLabel.setBackground(new java.awt.Color(49, 47, 54));
        functionLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        functionLabel.setForeground(new java.awt.Color(255, 255, 255));
        functionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        functionLabel.setText("Function");

        yearLabel.setBackground(new java.awt.Color(49, 47, 54));
        yearLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(255, 255, 255));
        yearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearLabel.setText("Year");

        resultField.setBackground(new java.awt.Color(47, 49, 54));
        resultField.setForeground(new java.awt.Color(255, 255, 255));
        resultField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultField.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(yearOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                                .addComponent(functionOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(functionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(233, 233, 233)
                                                .addComponent(execute))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(213, 213, 213)
                                                .addComponent(f1FocusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(195, 195, 195)
                                                .addComponent(openDatabaseButton))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(201, 201, 201)
                                                .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(f1FocusLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(openDatabaseButton)
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(functionLabel)
                                        .addComponent(yearLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(yearOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(functionOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(execute)
                                .addGap(18, 18, 18)
                                .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        resultField.setEditable(false);
    }// </editor-fold>

    private void executeMouseClicked(java.awt.event.MouseEvent evt) {
        String year = yearOptions.getSelectedItem().toString();
        String function = functionOptions.getSelectedItem().toString();
        if (function.equals("Constructors' Champion")) {
            if (year.equals("1950") || year.equals("1951") ||
                    year.equals("1952") || year.equals("1953") ||
                    year.equals("1954") || year.equals("1955") ||
                    year.equals("1956") || year.equals("1957")) {
                year = "1958";
            }
            resultField.setText(F1ConstructorYear.getConstructorChampion(year));
        } else {
            resultField.setText(F1DriversYear.getDriverChampion(year));
        }
    }

    private void openDatabaseButtonMouseClicked(java.awt.event.MouseEvent evt) {
        F1Frame.run();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F1Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F1Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F1Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F1Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F1Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton execute;
    private javax.swing.JLabel f1FocusLabel;
    private javax.swing.JLabel functionLabel;
    private javax.swing.JComboBox<String> functionOptions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton openDatabaseButton;
    private javax.swing.JTextField resultField;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JComboBox<String> yearOptions;
    // End of variables declaration
}