package it.consulting.coding;

import javax.swing.*;

public class ColorComboBoxModel extends DefaultComboBoxModel<ColorEnum> {

    public ColorComboBoxModel(ColorEnum[] items) {
        super(items);
    }

    @Override
    public ColorEnum getSelectedItem() {
        return (ColorEnum) super.getSelectedItem();
    }
}
