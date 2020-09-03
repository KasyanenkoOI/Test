package ru.sandbox;

public class Point {
    public int p1;
    public int p2;

    public Point(int p1, int p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public double distance(Point pTwo) {
        return Math.sqrt((this.p1 - pTwo.p1) * (this.p1 - pTwo.p1) + (this.p2 - pTwo.p2) * (this.p2 - pTwo.p2));

    }
}
