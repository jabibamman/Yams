package org.example;

public enum Figure {
    BRELAN(28),
    CARRE(35),
    FULL(30),
    GRANDE_SUITE(40),
    YAMS(50);

    private final int points;

    Figure(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
