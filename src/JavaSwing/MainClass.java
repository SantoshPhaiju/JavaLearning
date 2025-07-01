package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing GUI Application");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name: ");
        JTextField textField = new JTextField();
        nameLabel.setBounds(20, 20, 150, 25);
        textField.setBounds(200, 20, 200, 25);

        JLabel mobileLabel = new JLabel("Mobile: ");
        JTextField mobileTextField = new JTextField();
        mobileLabel.setBounds(20, 60, 150, 25);
        mobileTextField.setBounds(200, 60, 200, 25);

        JLabel genderLabel = new JLabel("Gender: ");
        genderLabel.setBounds(20, 100, 150, 25);
        ButtonGroup group = new ButtonGroup();
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(200, 100, 150, 25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(280, 100, 150, 25);
        group.add(male);
        group.add(female);

        // date of birth section
        JLabel dobLabel = new JLabel("Date Of Birth: ");
        dobLabel.setBounds(20, 140, 150, 25);
        List<Integer> days = new ArrayList<>();
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        List<String> yearsList = new ArrayList<>();
        int year;
        for (int i = 0; i <= 55; i++) {
            year = 1970 + i;
            yearsList.add(String.valueOf(year));
        }
        for (int i = 1; i <= 30; i++) {
            days.add(i);
        }
        JComboBox daysComboBox = new JComboBox(days.toArray());
        JComboBox monthsComboBox = new JComboBox(months);
        JComboBox yearsComboBox = new JComboBox(yearsList.toArray());
        daysComboBox.setBounds(200, 140, 90, 25);
        monthsComboBox.setBounds(300, 140, 90, 25);
        yearsComboBox.setBounds(400, 140, 100, 25);

        // Address
        JLabel addressLabel = new JLabel("Address: ");
        JTextField addressTextField = new JTextField();
        addressLabel.setBounds(20, 180, 150, 25);
        addressTextField.setBounds(200, 180, 200, 25);

        // checkbox
        JCheckBox checkBox = new JCheckBox("Please accept the terms and conditions!");
        checkBox.setBounds(50, 230, 300, 25);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(200, 300, 150, 25);

        submitButton.addActionListener(e -> {
            String name = textField.getText();
            String mobile = mobileTextField.getText();
            String gender = male.isSelected() ? "Male" : "Female";
            String dob = daysComboBox.getSelectedItem().toString() + " " + monthsComboBox.getSelectedItem().toString() + " " + yearsComboBox.getSelectedItem().toString();
            String address = addressTextField.getText();
            boolean isChecked = checkBox.isSelected();

            if (!isChecked) {
                JOptionPane.showMessageDialog(frame, "Please accept the terms and conditions first!");
                return;
            }

            try (BufferedWriter bf = new BufferedWriter(new FileWriter("exams2.txt", true));) {
                bf.write("Name: " + name + "," + " Mobile: " + mobile + "," + " Gender: " + gender + "," + " Dob: " + dob + "," + " Address: " + address + "," + " Terms And Condition: " + checkBox.isSelected() + "\n");

                JOptionPane.showMessageDialog(frame, "Your data is Submitted!");
                textField.setText("");
                mobileTextField.setText("");
                group.clearSelection();
                daysComboBox.setSelectedIndex(-1);
                monthsComboBox.setSelectedIndex(-1);
                yearsComboBox.setSelectedIndex(-1);
                addressTextField.setText("");
                checkBox.setSelected(false);
            } catch (IOException err) {
                System.out.println(err.getMessage());
            }


        });


        frame.add(nameLabel);
        frame.add(textField);
        frame.add(mobileLabel);
        frame.add(mobileTextField);
        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);

        frame.add(dobLabel);
        frame.add(daysComboBox);
        frame.add(monthsComboBox);
        frame.add(yearsComboBox);

        frame.add(addressLabel);
        frame.add(addressTextField);
        frame.add(checkBox);
        frame.add(submitButton);


        frame.setVisible(true);
    }
}
