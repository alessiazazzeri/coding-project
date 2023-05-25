package it.consulting.coding;

import javax.swing.*;

public class ColorPanel {
    private final JPanel panel;
    private boolean colored;

    public ColorPanel(JPanel panel) {
        this.panel = panel;
        colored = false;
    }

    public JPanel getPanel() {
        return panel;
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }
}
