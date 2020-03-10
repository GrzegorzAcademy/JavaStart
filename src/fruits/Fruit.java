package fruits;

public class Fruit {
    private String tape;
    private double weight;

    public Fruit(String tape, double weight) {
        this.tape = tape;
        this.weight = weight;
    }

    public String getTape() {
        return tape;
    }

    public void setTape(String tape) {
        this.tape = tape;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }
        String getInfo(){
        return "typ: "+ tape+ " waight: " + weight;
        }
}