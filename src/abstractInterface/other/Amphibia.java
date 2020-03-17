package abstractInterface.other;

public class Amphibia implements Car,Boat {
    @Override
    public void name() {
        System.out.println("Amfibia to troche :");
        Car.super.name();
        Boat.super.name();
    }
}
