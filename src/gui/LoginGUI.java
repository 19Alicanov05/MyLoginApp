package gui;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    public LoginGUI() {
        super(CommonConstants.APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(CommonConstants.FRAME_SIZE[0], CommonConstants.FRAME_SIZE[1]);
        setLocationRelativeTo(null);

        addGUIComponents();

    }

    public void addGUIComponents() {
        SpringLayout springLayout = new SpringLayout();
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(springLayout);

        //Username
        JLabel userNameLabel = new JLabel("Username: ");
        userNameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JTextField userNameField = new JTextField(CommonConstants.TEXTFIELD_SIZE);
        userNameField.setFont(new Font("Dialog", Font.PLAIN, 18));


        springLayout.putConstraint(SpringLayout.WEST, userNameLabel, 35, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, userNameLabel, 85, SpringLayout.NORTH, loginPanel);
        springLayout.putConstraint(SpringLayout.WEST, userNameField, 135, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, userNameField, 85, SpringLayout.NORTH, loginPanel);
        loginPanel.add(userNameLabel);
        loginPanel.add(userNameField);

        this.getContentPane().add(loginPanel);

        //Password
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JPasswordField passwordField = new JPasswordField(CommonConstants.TEXTFIELD_SIZE);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 18));
        springLayout.putConstraint(SpringLayout.WEST, passwordLabel, 35, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordLabel, 135, SpringLayout.NORTH, loginPanel);
        springLayout.putConstraint(SpringLayout.WEST, passwordField, 135, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordField, 135, SpringLayout.NORTH, loginPanel);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        //Login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        springLayout.putConstraint(SpringLayout.WEST, loginButton, 150, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, loginButton, 250, SpringLayout.NORTH, loginPanel);
        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userNameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("ADMIN") && password.equals("ADMIN")) {
                    System.out.println("Login Successful");
                }else {
                    System.out.println("Login Failed");
                }
            }
        });
        loginPanel.add(loginButton);
        this.getContentPane().add(loginPanel);

    }
}
