import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JTextField textField = new JTextField(10);
    private String input = "";

    public Calculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttonLabels = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+" };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(e -> buttonClick(label));
            buttonPanel.add(button);
        }
        add(textField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void buttonClick(String label) {
        if (label.equals("=")) {
            try {
                textField.setText(Double.toString(calculateResult()));
            } catch (Exception e) {
                textField.setText("Error");
            }
        } else if (label.equals("C")) {
            textField.setText("");
            input = "";
        } else {
            input += label;
            textField.setText(input);
        }
    }
    
    private double calculateResult() {
        String[] parts = input.split("[-+*/]");
        if (parts.length != 2)
            throw new IllegalArgumentException("Invalid expression");
        double num1 = Double.parseDouble(parts[0]);
        double num2 = Double.parseDouble(parts[1]);
        if (input.contains("+"))
            return num1 + num2;
        else if (input.contains("-"))
            return num1 - num2;
        else if (input.contains("*"))
            return num1 * num2;
        else if (input.contains("/")) {
            if (num2 == 0)
                throw new ArithmeticException("Division by zero");
            return num1 / num2;
        } else
            throw new IllegalArgumentException("Invalid operator");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}