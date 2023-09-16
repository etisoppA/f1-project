import com.example.f1project.F1ProjectApplication;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F1Window extends JFrame {
    private final F1ProjectApplication application = new F1ProjectApplication();

    private final String[] year = {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959",
            "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973",
            "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987",
            "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001",
            "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
            "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
    private final String[] functionList = {"Rankings", "Predicted Rankings for Next Year", "Points"};
    private final JLabel yearLabel = new JLabel("Select a Year", SwingConstants.CENTER);
    private final JLabel funcLabel = new JLabel("Select a Function", SwingConstants.CENTER);
    private final JComboBox yearOptions = new JComboBox(year);
    private final JComboBox functionOptions = new JComboBox(functionList);
    private final JButton execute = new JButton("Execute");


    public F1Window() throws IOException {
        yearOptions.setSelectedIndex(20);
        functionOptions.setSelectedIndex(00);
        JPanel panel = new JPanel(new GridLayout(3, 2, 12, 16));
        panel.setPreferredSize(new Dimension(500, 400));
        panel.add(yearLabel);
        panel.add(funcLabel);
        panel.add(yearOptions);
        panel.add(functionOptions);
        panel.setOpaque(true);
        panel.setBackground(Color.DARK_GRAY);
        yearLabel.setForeground(Color.WHITE);
        yearLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        funcLabel.setForeground(Color.WHITE);
        funcLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(execute);
        Container container = getContentPane();
        container.add(panel, BorderLayout.CENTER);
        container.add(buttonPanel, BorderLayout.SOUTH);
        execute.addActionListener(new executeListener());
    }

    public class executeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String selectedYear = yearOptions.getSelectedItem().toString();
                String selectedFunction = functionOptions.getSelectedItem().toString();
            } catch (Exception ex){

            }
        }
    }
}
