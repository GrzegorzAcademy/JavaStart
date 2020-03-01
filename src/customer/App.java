package customer;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        Client client1 = new Client("Anna ", "Roman", true);
        double price = 1100;
        Client client2 = new Client("Grzegorz", "Kowalski" ,false);
        double price2 = 1100;
        DiscountService discountService = new DiscountService();
     double discountPrice =  discountService.calculateDiscountPrice(client1,price);
     double discountPrice2 =  discountService.calculateDiscountPrice(client2,price);
     PrintService printService = new PrintService();
     printService.printSumary(client1,price,discountPrice);
     printService.printSumary(client2,price2,discountPrice2);

    }
 }

