package customer;

public class PrintService {
    public void printSumary(Client client, double orginalPrice, double discoutPrice){
        if(client.getName() != null && client.getLastName() == null){
            System.out.println("Witaj " + client.getName());
        }
        else if (client.getName() !=null && client.getName() != null){
            System.out.println("Witaj " + client.getName() + " "+ client.getLastName());
        }
        else  if (client.getName() == null && client.getLastName() != null){
            System.out.println("Dzień dobry Panie " + client.getLastName());
        }
        else {
            System.out.println("Witaj nieznajomy");
        }
        System.out.println("Kkota przed rabatem " + orginalPrice);
        System.out.println("Kkota po rabacie  "+ discoutPrice );

    }
}
