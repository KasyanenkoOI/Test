package ru.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        Point p = new Point(4, 5);
        Point pTwo = new Point(6, 7);
        System.out.println("Расстояние между точками с координатами [" + p.p1 + ";" + p.p2 + "] and [" + pTwo.p1 + ";" + pTwo.p2 +
             "] = "+   distance(p, pTwo));

    }

    public static double distance(Point p, Point pTwo) {
        return Math.sqrt((p.p1 - pTwo.p1) * (p.p1 - pTwo.p1) + (p.p2 - pTwo.p2) * (p.p2 - pTwo.p2));

    }

}