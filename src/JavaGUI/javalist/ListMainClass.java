package JavaGUI.javalist;

import JavaGUI.SystemFrame;

import javax.swing.*;

public class ListMainClass {
    public static void main(String[] args) {
        SystemFrame systemFrame = new SystemFrame();
        systemFrame.setTitle("Course List");
        systemFrame.setLocationRelativeTo(null);

        systemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] courses = {"Java", "Python", "C++", "C"};

        JList<String> courseList = new JList<>(courses);

        JLabel courseLabel = new JLabel("Courses");
        courseLabel.setBounds(20, 10, 100, 25);
        systemFrame.add(courseLabel);
        courseList.setBounds(20, 45, 200, 200);
        JComboBox<String> comboBox = new JComboBox<>(courses);
        comboBox.setBounds(20, 250, 200, 25);

         JScrollPane scrollPane = new JScrollPane(courseList);
        scrollPane.setBounds(20, 40, 200, 200);

        systemFrame.add(scrollPane);


        systemFrame.add(comboBox);
        systemFrame.setLayout(null);
        systemFrame.setVisible(true);
    }
}
