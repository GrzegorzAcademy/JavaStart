package polimorfizm;

public class Cat extends Animals {
    public Cat(String name) {
        super(name);
        }

    @Override
    public void givesound() {
        System.out.println("Czesć jestem kotem i robie miał miał  "+ getName());;
    }
}
