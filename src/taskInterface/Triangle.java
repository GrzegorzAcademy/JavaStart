package taskInterface;

public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;
    private double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return a*height/2;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
       String result = "triangle";
       result += " Bok A " + a;
       result += " Bok B " + b;
       result += " Bok C " + c;
       result += " Wysokość " + height;
       result += " Pole " + calculateArea();
       result += " Obwód " + calculatePerimeter();
       return result;
    }
}
