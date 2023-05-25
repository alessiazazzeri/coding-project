package it.consulting.coding;

import javax.swing.*;
import java.awt.*;

public class StringUtilities {

    public static int getRow(String text, int rows) {
        String[] values = splitString(text);
        int r = Integer.parseInt(values[0].trim());
        if (r > rows) {
            JOptionPane.showMessageDialog(null,
                    "Inserire un numero di riga valido",
                    "Errore",
                    JOptionPane.WARNING_MESSAGE);
        }
        return r;
    }

    public static int getPixelsToColor(String text, int cols) {
        String[] values = splitString(text);
        int p = Integer.parseInt(values[1].trim());
        if (p > cols) {
            JOptionPane.showMessageDialog(null,
                    "Inserire un numero di celle valido",
                    "Errore",
                    JOptionPane.WARNING_MESSAGE);
        }
        return p;
    }

    public static Color getColor(String text) {
        String[] values = splitString(text);
        String inputColor = values[2].trim();
        Color chosenColor = null;
        for (ColorEnum c : ColorEnum.values()) {
            if ((c.getName()).equalsIgnoreCase(inputColor)) {
                chosenColor = c.getColor();
            }
        }
        if (chosenColor == null) {
            JOptionPane.showMessageDialog(null,
                    "Inserire un colore corretto",
                    "Errore",
                    JOptionPane.WARNING_MESSAGE);
        }
        return chosenColor;
    }

    public static String[] splitString(String text) {
        return text.split(",\\s*");
    }
}
