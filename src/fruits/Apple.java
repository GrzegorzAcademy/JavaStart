package fruits;

public class Apple extends Fruit {
   String variety;
   public static String TYPE = "JABŁKOWATY";

    public Apple( double waight, String variety) {
        super(TYPE, waight);
        this.variety = variety;
    }

    @Override
    String getInfo() {
        return  super.getInfo() + " odmiana: " + variety;
    }
}

