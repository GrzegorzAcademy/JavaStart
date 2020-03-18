package abstractInterface;

public class Triangle extends Rectangle implements Shape {
    private double h;

    public Triangle(double a, double b, double h ) {
        super(a, b);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double calculateArea(){
        return 0.5 * getA() *h;
    }
    public double calculatePremiter(){
        return 2*getB()+getA();
    }
}
