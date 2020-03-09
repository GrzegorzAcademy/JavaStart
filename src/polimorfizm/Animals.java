package polimorfizm;

public class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        public void givesound() {
            System.out.println("Czesc jestem zwierzakiem  : " + name);
        }
}
