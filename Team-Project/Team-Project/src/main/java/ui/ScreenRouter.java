package ui;

import javax.swing.*;
import java.awt.*;

public class ScreenRouter {
    private final CardLayout cardLayout;
    private final JPanel container;

    public ScreenRouter(CardLayout cardLayout, JPanel container) {
        this.cardLayout = cardLayout;
        this.container = container;
    }

    public void goTo(String screenName) {
        cardLayout.show(container, screenName);
    }
}
