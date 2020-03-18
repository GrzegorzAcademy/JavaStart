package taskInterface;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalculateShape {
    Scanner sc = new Scanner(System.in);

    private Triangle readTriangle() {
        System.out.println(" Twój wybór to trójkąt");
        System.out.println(" Podaj długość boku A ");
        double a = sc.nextDouble();
        System.out.println(" podaj długość boku B ");
        double b = sc.nextDouble();
        System.out.println(" Podaj długośc podstawy C ");
        double c = sc.nextDouble();
        System.out.println(" Podaj wysokośc H ");
        double height = sc.nextDouble();
        return new Triangle(a, b, c, height);
    }

    private Circle readCircle() {
        System.out.println(" Twój wybór to koło ");
        System.out.println(" Podaj promień ");
        double r = sc.nextDouble();
        return new Circle(r);
    }

    private Rectangle readRectangle() {
        System.out.println(" Twój wybór to prostokat ");
        System.out.println(" Podaj długość boku A ");
        double a = sc.nextDouble();
        System.out.println(" Podaj długość boku B ");
        double b = sc.nextDouble();
        return new Rectangle(a, b);
    }
   public  Shape createShape() {
        try{
        int shapetyp = sc.nextInt();
        switch (shapetyp) {
            case Shape.TRIANGLE:
                return readTriangle();
            case Shape.CIRCLE:
                return readCircle();
            case Shape.RECTANGLE:
                return readRectangle();
            default:
                throw new NoSuchElementException();
        }
    } catch (InputMismatchException e ){
        sc.nextLine();
        throw e;
        }
    }
}
