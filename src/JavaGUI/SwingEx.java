package JavaGUI;

import javax.swing.*;

public class SwingEx {
    public static void main(String[] args) {


        JFrame systemFrame = new SystemFrame();

        JMenuBar systemMenuBar = new SystemMenuBar();
        systemFrame.setJMenuBar(systemMenuBar);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 20, 100, 25);

        JTextField nameField = new JTextField();
        nameField.setBounds(20, 45, 200, 25);

        JLabel genderLabel = new JLabel("Gender: ");
        genderLabel.setBounds(20, 80, 100, 25);
        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(20, 100, 100, 25);
        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(120, 100, 100, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);


        systemFrame.add(genderLabel);
        systemFrame.add(maleButton);
        systemFrame.add(femaleButton);
        systemFrame.add(nameLabel);
        systemFrame.add(nameField);




        systemFrame.setLayout(null);
        systemFrame.setVisible(true);

    }
}
