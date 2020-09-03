package ru.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        Point p = new Point(4, 5);
        Point pTwo = new Point(6, 7);
        System.out.println("Расстояние между точками с координатами [" + p.p1 + ";" + p.p2 + "] and [" + pTwo.p1 + ";" + pTwo.p2 +
             "] = "+   p.distance(pTwo));


    }



}