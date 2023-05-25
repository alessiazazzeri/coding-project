package it.consulting.coding;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PixelArtHome extends JFrame{
    private int rows;
    private int cols;
    private int height;
    private int length;

    private JPanel homePanel;
    private JTextField numRows;
    private JTextField numCols;
    private JTextField pxHeight;
    private JTextField pxLength;
    private JLabel dimLabel;
    private JLabel rowLabel;
    private JLabel colLabel;
    private JLabel pixDimLabel;
    private JLabel pixelHeightLabel;
    private JLabel pixelLengthLabel;
    private JButton cancelButton;
    private JButton OKButton;

    public PixelArtHome() {
    setContentPane(homePanel);
    setSize(500,300);
    setTitle("Pixel Art Layout");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);

    OKButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            rows = Integer.parseInt(numRows.getText());
            cols = Integer.parseInt(numCols.getText());
            height = Integer.parseInt(pxHeight.getText());
            length = Integer.parseInt(pxLength.getText());

            PixelArtGrid grid = new PixelArtGrid(cols, rows, height, length);
            grid.setVisible(true);
            setVisible(false);
        }
    });

    cancelButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            numRows.setText("");
            numCols.setText("");
            pxHeight.setText("");
            pxLength.setText("");
        }
    });
}
    public static void main(String[] args) {
        new PixelArtHome();
    }

}
