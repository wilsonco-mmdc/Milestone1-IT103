package second;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	LoginGUI window = new LoginGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public LoginGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600); // Set the size of the app
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Motor Ph");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(350, 50, 100, 30);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(200, 150, 100, 30);
        frame.getContentPane().add(lblUsername);

        usernameField = new JTextField();
        usernameField.setBounds(300, 150, 200, 30);
        frame.getContentPane().add(usernameField);
        usernameField.setColumns(10);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(200, 200, 100, 30);
        frame.getContentPane().add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(300, 200, 200, 30);
        frame.getContentPane().add(passwordField);

        JButton btnSignIn = new JButton("Sign-in");
        btnSignIn.setBounds(300, 250, 100, 30);
        frame.getContentPane().add(btnSignIn);

        // ActionListener for the Sign-in button
        btnSignIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Here you would implement OTP generation and verification logic
                // For simplicity, let's show a dialog prompting for OTP
                String otp = JOptionPane.showInputDialog(frame, "Enter OTP sent to your email:");

                // You can add OTP verification logic here
                if (otp != null && !otp.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Sign-in successful!");
                    // Add code to proceed after successful sign-in
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid OTP. Sign-in failed.");
                }
            }
        });
    }
}

