package ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final CardLayout cards = new CardLayout();
    private final JPanel root = new JPanel(cards);

    // Screen names
    public static final String SCREEN_LOGIN = "login";
    public static final String SCREEN_DASHBOARD = "dashboard";

    public MainFrame() {
        super("IPOS-CA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);

        ScreenRouter router = new ScreenRouter(cards, root);

        LoginPanel login = new LoginPanel(router);
        DashboardPanel dashboard = new DashboardPanel(router);

        root.add(login, SCREEN_LOGIN);
        root.add(dashboard, SCREEN_DASHBOARD);

        setContentPane(root);

        router.goTo(SCREEN_LOGIN);
    }
}
