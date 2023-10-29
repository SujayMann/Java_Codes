import javax.swing.*;

public class MessageApplet {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Message Applet");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label = new JLabel("Hello World!");
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
            frame.add(label);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true); 
        });
    }
}