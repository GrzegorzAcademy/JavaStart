package abstractInterface.other;

public interface Boat {
    public default void name(){
        System.out.println("Boat");
    }

}
