package abstractInterface.other;

public interface Car {
    public default void name(){
        System.out.println("Car");
    }
}
