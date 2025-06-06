package JavaGUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {
    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Column Names
        String[] columnNames = {"ID", "Name", "Age"};

        // Table Data
        String[][] data = {
                {"1", "Santosh", "22"},
                {"2", "Ram", "23"},
                {"3", "Sita", "21"},
                {"4", "Hari", "24"}
        };

        // JTable
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        // Add to frame
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
