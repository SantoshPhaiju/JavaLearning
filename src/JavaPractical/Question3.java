package JavaPractical;

import javax.swing.*;

public class Question3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JavaPractical");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);


        JLabel number1Label = new JLabel("Number 1");
        number1Label.setBounds(25, 20, 100, 25);

        JTextField number1TextField = new JTextField();
        number1TextField.setBounds(100, 20, 150, 25);

        JLabel number2Label = new JLabel("Number 2");
        number2Label.setBounds(25, 60, 100, 25);
        JTextField number2TextField = new JTextField();
        number2TextField.setBounds(100, 60, 150, 25);

        JButton submitButton = new JButton("Multiply");
        submitButton.setBounds(100, 100, 150, 25);

        JLabel resultLabel = new JLabel("Result");
        resultLabel.setBounds(25, 180, 100, 25);
        JTextField resultTextField = new JTextField();
        resultTextField.setBounds(100, 180, 150, 25);



        frame.add(number1Label);
        frame.add(number1TextField);
        frame.add(number2Label);
        frame.add(number2TextField);
        frame.add(submitButton);
        frame.add(resultLabel);
        frame.add(resultTextField);


        submitButton.addActionListener(e -> {
            int number1 = Integer.parseInt(number1TextField.getText());
            int number2 = Integer.parseInt(number2TextField.getText());
            resultTextField.setText(String.valueOf(number1 * number2));
        });


        frame.setVisible(true);
    }
}
