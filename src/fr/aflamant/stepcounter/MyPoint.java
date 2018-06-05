package fr.aflamant.stepcounter;

import pl.luwi.series.reducer.Point;

public class MyPoint implements Point {
    double x;
    double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return this.x+";"+this.y+"\n";
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}