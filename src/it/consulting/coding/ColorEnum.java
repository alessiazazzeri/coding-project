package it.consulting.coding;

import java.awt.*;

public enum ColorEnum {
    BLACK("Nero", Color.BLACK),
    BLUE("Blu", Color.BLUE),
    GREEN("Verde", Color.GREEN),
    RED("Rosso", Color.RED),
    YELLOW("Giallo", Color.YELLOW),
    WHITE("Bianco", Color.white),
    PINK("Rosa", Color.pink),
    CYAN("Celeste", Color.CYAN),
    GRAY("Grigio", Color.GRAY),
    ORANGE("Arancione", Color.ORANGE);

    private final String name;
    private final Color color;

    private ColorEnum(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getName();
    }
}

