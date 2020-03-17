package abstractInterface;

public class ShapeCalculate {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        Shape circle = new Circle(5);
        System.out.println("pole koła " +rectangle.calculateArea());
        System.out.println("obwód koła "+rectangle.calculatePerimeter());
        System.out.println("pole prostokąta "+circle.calculateArea());
        System.out.println("obwód prostokąta "+circle.calculatePerimeter());
        System.out.println(circle.getDate());
        System.out.println(rectangle.getDate());
        System.out.println();
        System.out.println(StringUtils.reversString("adonis"));
    }
}
