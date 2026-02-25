package ui;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {

    public LoginPanel(ScreenRouter router) {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(8, 8, 8, 8);
        c.fill = GridBagConstraints.BOTH;

        JLabel title = new JLabel("IPOS-CA Login");
        title.setFont(new Font("SansSerif", Font.BOLD, 28));

        JTextField username = new JTextField(20);
        JPasswordField password = new JPasswordField(20);

        JButton loginBtn = new JButton("Login");
        JLabel msg = new JLabel(" ");
        msg.setForeground(Color.RED);

        c.gridx = 0; c.gridy = 0; c.gridwidth = 2;
        add(title, c);

        c.gridx = 1; c.gridwidth = 1;
        add(new JLabel("Username"), c);
        c.gridx = 1;
        add(username, c);

        c.gridx = 0; c.gridy = 2;
        add(new JLabel("Password"), c);
        c.gridx = 1;
        add(password, c);

        c.gridx = 0; c.gridy = 3; c.gridwidth = 2;
        add(loginBtn, c);

        c.gridx = 4;
        add(msg, c);

        loginBtn.addActionListener(e -> {
            String u = username.getText().trim();
            String p = new String(password.getPassword());

            if(u.equals("admin") && p.equals("admin")) {
                msg.setText(" ");
                router.goTo(MainFrame.SCREEN_DASHBOARD);
            } else {
                msg.setText("Invalid Username or Password");
            }
        });
    }
}
