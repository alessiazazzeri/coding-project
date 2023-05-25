package it.consulting.coding;

import net.miginfocom.layout.Grid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PixelArtGrid extends JFrame {
    private JPanel gridPanel;
    private JPanel panel;
    private JPanel colorPanel;
    private JButton goButton;
    private JTextArea gridInput;
    private ColorPanel[] colorPanels;
    private int rowToColor;
    private int pixelsToColor;
    private Color selectedColor;

    public PixelArtGrid(int cols, int rows, int pxHeight, int pxWidth) {
        setContentPane(panel);
        setSize(860,1000);
        setTitle("Pixel Art");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

//        colorChoose.setModel(new ColorComboBoxModel(ColorEnum.values()));

        gridPanel.setBounds(100,100,300,300);
        gridPanel.setLayout(new GridLayout(cols, rows));

        int buttonsNumber = cols * rows;

        colorPanels = new ColorPanel[buttonsNumber];

        Dimension d = new Dimension(pxWidth, pxHeight);
        JPanel p;
        for (int i = 0; i < buttonsNumber; i++) {
            colorPanels[i] = new ColorPanel(new JPanel());
            p = colorPanels[i].getPanel();
            p.setPreferredSize(d);

            gridPanel.add(p);
        }

        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] lines = gridInput.getText().split("\\n");

                for (String line : lines) {
                    rowToColor = StringUtilities.getRow(line, rows);
                    pixelsToColor = StringUtilities.getPixelsToColor(line, cols);
                    selectedColor = StringUtilities.getColor(line);

                    int row = rowToColor - 1;
                    int pixels = pixelsToColor - 1;
                    if (row > rows || pixels > cols) {
                        JOptionPane.showMessageDialog(null, "Numero inserito non valido");
                    } else {
                        int compIndex = row * cols;
                        for (int i = compIndex; i <= compIndex + pixels; i++) {
                            try {
                                if (!colorPanels[i].isColored()) {
                                    if (selectedColor != null) {
                                        colorPanels[i].getPanel().setBackground(selectedColor);
                                    }
                                    colorPanels[i].setColored(true);
                                }
                            } catch (ArrayIndexOutOfBoundsException ex) {
                                JOptionPane.showMessageDialog(null, "Numero inserito non valido");
                                break;
                            }
                        }
                    }
                }
            }
        });
    }
}
