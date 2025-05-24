package JavaGUI.SwingProblem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


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

        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }

        JComboBox<String> dayComboBox = new JComboBox<>(days);

        dayComboBox.setBounds(100, 110, 100, 25);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
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

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(20, 140, 100, 25);
        formPanel.add(addressLabel);

        JTextField addressTextArea = new JTextField();
        addressTextArea.setBounds(100, 140, 200, 25);
        formPanel.add(addressTextArea);

        JCheckBox conditionsCheckBox = new JCheckBox("Please accept the conditions");
        conditionsCheckBox.setBounds(20, 180, 400, 25);
        formPanel.add(conditionsCheckBox);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(20, 220, 100, 25);
        formPanel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isConditionsAccepted = conditionsCheckBox.isSelected();
                String name = nameTextField.getText();
                String mobile = mobileTextField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";
                String dob = dayComboBox.getSelectedItem() + "-" + monthComboBox.getSelectedItem() + "-" + yearComboBox.getSelectedItem();
                String address = addressTextArea.getText();
                System.out.println(name + " " + mobile + " " + gender + " " + dob + " " + address);

                if (isConditionsAccepted) {
                    try {
                        FileWriter fileWriter = new FileWriter("exams.txt", true);
                        fileWriter.write("\n" + name + " " + mobile + " " + gender + " " + dob + " " + address);
                        fileWriter.close();

                        nameTextField.setText("");
                        mobileTextField.setText("");
                        addressTextArea.setText("");
                        dayComboBox.setSelectedIndex(0);
                        monthComboBox.setSelectedIndex(0);
                        yearComboBox.setSelectedIndex(0);
                        conditionsCheckBox.setSelected(false);
                        formPanel.updateUI();
                        formPanel.repaint();
                        formPanel.revalidate();


                    } catch (IOException err) {
                        System.out.println(err.getMessage());
                    }
                    JOptionPane.showMessageDialog(null, "Registration successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Please accept the conditions", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        systemFrame.add(formPanel);
        systemFrame.showFrame();

    }
}
