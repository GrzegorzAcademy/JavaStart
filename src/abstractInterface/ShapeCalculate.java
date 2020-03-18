package abstractInterface;

public class ShapeCalculate {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        Shape circle = new Circle(5);
        Triangle triangle =  new Triangle(2,5,5);
        System.out.println("pole koła " +rectangle.calculateArea());
        System.out.println("obwód koła "+rectangle.calculatePerimeter());
        System.out.println("pole prostokąta "+circle.calculateArea());
        System.out.println("obwód prostokąta "+circle.calculatePerimeter());
        System.out.println("Pole trójkąta : " + triangle.calculateArea());
        System.out.println("Obwód trójkąta " + triangle.calculatePremiter());
        System.out.println(circle.getDate());
        System.out.println(rectangle.getDate());
        System.out.println();
        System.out.println(StringUtils.reversString("adonis"));
    }
}
