package taskInterface;

import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) {

        CalculateShape calculateShape = new CalculateShape();
        boolean readcomplete = false;
        Shape shape = null;

        while (!readcomplete){
          try {
              printOptions();
              shape = calculateShape.createShape();
              readcomplete = true;
          }catch (IndexOutOfBoundsException e){
              System.out.println("zła numer opcji");
          }catch (NoSuchElementException e){
              System.out.println("brak elementu");
          }
        }
        System.out.println(shape);

    }

    private static void printOptions() {
        System.out.println("Podaj numer figury do obliczeń ");
        System.out.println(Shape.TRIANGLE + " Trójkąt ");
        System.out.println(Shape.CIRCLE + " Koło ");
        System.out.println(Shape.RECTANGLE+ " Prostokąt ");
    }
}
