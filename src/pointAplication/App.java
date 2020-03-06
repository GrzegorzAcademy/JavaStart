package pointAplication;

import point.Point;
import pointmethod.PointControler;

public class App {
    public static void main(String[] args) {
       final int opp = 3;
       final int addX = 0;
       final int minusX = 1;
       final int addY = 2;
       final int minusY = 3;

    Point point1 = new Point(10, 20);
    PointControler pointControler = new PointControler();
    switch (opp) {
        case addX: {
            pointControler.addX(point1);
            break;
        }
        case minusX: {
            pointControler.minusX(point1);
            break;
        }
        case addY: {
            pointControler.addY(point1);
            break;
        }
        case minusY: {
            pointControler.minusY(point1);
            break;
        }
        default: {
            System.out.println("podano złą wartość");
        }
    } System.out.println(point1.getX()+ " "+ point1.getY());
//
//        System.out.println(point1.getX()+" "+ point1.getY());
//        pointControler.addX(point1);
//        pointControler.addY(point1);
//        System.out.println(point1.getX()+" "+ point1.getY());
//        pointControler.minusX(point1);
//        pointControler.minusY(point1);
//        System.out.println(point1.getX()+" "+ point1.getY());

    }

}
