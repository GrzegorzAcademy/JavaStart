package abstractInterface;

interface Shape {
    double PI = 3.14;
    double calculateArea();
    double calculatePerimeter();
    default String getDate(){
        return "obwód "+calculateArea()+ " pole " +calculatePerimeter();
    }
}


