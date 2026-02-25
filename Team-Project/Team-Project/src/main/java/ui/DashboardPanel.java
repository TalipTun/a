package ui;

import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JPanel {

    public DashboardPanel(ScreenRouter router) {
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Dashboard", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 28));
        add(title, BorderLayout.NORTH);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 12, 12));

        JButton stockBtn = new JButton("Stock");
        JButton salesBtn = new JButton("Sales");
        JButton customerBtn = new JButton("Customers");
        JButton ordersBtn = new JButton("Orders");
        JButton logoutBtn = new JButton("Logout");

        buttons.add(stockBtn);
        buttons.add(salesBtn);
        buttons.add(customerBtn);
        buttons.add(ordersBtn);
        buttons.add(logoutBtn);

        add(buttons, BorderLayout.CENTER);

        logoutBtn.addActionListener(e -> router.goTo(MainFrame.SCREEN_LOGIN));

        stockBtn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Stock screen not implemented yet"));
        salesBtn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Sales screen not implemented yet"));
        customerBtn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Customers screen not implemented yet"));
        ordersBtn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Orders screen not implemented yet"));
    }
}
