package JavaGUI.SwingProblem;

import JavaGUI.SystemFrame;

import javax.swing.*;
import java.awt.*;

public class SimpleForm {
    public static void main(String[] args) {

        RegistrationForm systemFrame = new RegistrationForm();
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);

        formPanel.setBounds(20, 20, 800, 400);
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 20, 100, 25);
        formPanel.add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(100, 20, 200, 25);
        formPanel.add(nameTextField);

        JLabel mobileLabel = new JLabel("Mobile");
        mobileLabel.setBounds(20, 50, 100, 25);
        formPanel.add(mobileLabel);

        JTextField mobileTextField = new JTextField();
        mobileTextField.setBounds(100, 50, 200, 25);
        formPanel.add(mobileTextField);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(20, 80, 100, 25);
        formPanel.add(genderLabel);
        ButtonGroup genderGroup = new ButtonGroup();

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(100, 80, 100, 25);
        formPanel.add(maleButton);

        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(200, 80, 100, 25);
        formPanel.add(femaleButton);

        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(20, 110, 100, 25);
        formPanel.add(dobLabel);

        String [] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }

        JComboBox<String> dayComboBox = new JComboBox<>(days);

        dayComboBox.setBounds(100, 110, 100, 25);

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        monthComboBox.setBounds(200, 110, 100, 25);

        String[] years = new String[100];
        int currentYear = java.time.Year.now().getValue();
        for (int i = 0; i < 100; i++) {
            years[i] = String.valueOf(currentYear - i);
        }
        JComboBox<String> yearComboBox = new JComboBox<>(years);
        yearComboBox.setBounds(300, 110, 100, 25);


        formPanel.add(dayComboBox);
        formPanel.add(monthComboBox);
        formPanel.add(yearComboBox);






        systemFrame.add(formPanel);
        systemFrame.showFrame();

    }
}
