package taskInterface;

public class Rectangle implements Shape {
   private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        String result =  "Rectangle";
        result += " Bok A " + a;
        result += " Bok B " + b;
        result += " Pole " + calculateArea();
        result += " Obwód " + calculatePerimeter();
        return result;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(a*b);
    }
}
