import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FactorialApplet extends JFrame {
    private JTextField inputField, resultField;
    public FactorialApplet() {
        setTitle("Factorial Calculator");
        setSize(330, 170);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel inputLabel = new JLabel("Enter an integer: ");
        inputField = new JTextField(10);
        topPanel.add(inputLabel);
        topPanel.add(inputField);
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 8));
        JLabel resultLabel = new JLabel("Factorial: ");
        resultField = new JTextField(10);
        resultField.setEditable(false);
        middlePanel.add(resultLabel);
        middlePanel.add(resultField);
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton calculateButton = new JButton("Compute");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });
        bottomPanel.add(calculateButton);
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(middlePanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);
        add(panel);
    }
    private void calculateFactorial() {
        String inputText = inputField.getText();
        try {
            int num = Integer.parseInt(inputText);
            if (num < 0) {
                resultField.setText("Invalid input");
            } else {
                long factorial = 1;
                for (int i = 1; i <= num; i++) {
                    factorial *= i;
                }
                resultField.setText(String.valueOf(factorial));
            }
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FactorialApplet app = new FactorialApplet();
                app.setVisible(true);
            }
        });
    }
}