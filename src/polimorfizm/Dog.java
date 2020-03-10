package polimorfizm;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void givesound() {
        System.out.println("Czesc jestem psem i robie hau hau " + getName());
    }
}
