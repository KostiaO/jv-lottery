package model;

import enums.Colors;

public class Ball {
    private final Colors color;
    private final int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public Colors getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='"
                + this.getColor()
                + '\''
                + ", number="
                + this.getNumber()
                + '}';
    }
}
