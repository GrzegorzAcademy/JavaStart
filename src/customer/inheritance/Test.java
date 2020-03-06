package customer.inheritance;

public class Test {
    public static void main(String[] args) {
      Tire tire = new Tire(551,"Continental","Winter",2,"91H",225);
      tire.printInfo();
      ExhoustParts exhoustParts = new ExhoustParts(12,"Boost", "Niose",1,true);
        exhoustParts.printInfo();
    }
}
