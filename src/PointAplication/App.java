package PointAplication;

import Point.Point;
import org.w3c.dom.ls.LSOutput;
import pointmethod.PointControler;

public class App {
    public static void main(String[] args) {

    Point point1 = new Point(10, 20);
    PointControler pointControler = new PointControler();
        System.out.println(point1.getX()+" "+ point1.getY());
        pointControler.addX(point1);
        pointControler.addY(point1);
        System.out.println(point1.getX()+" "+ point1.getY());
        pointControler.minusX(point1);
        pointControler.minusY(point1);
        System.out.println(point1.getX()+" "+ point1.getY());

    }
}
