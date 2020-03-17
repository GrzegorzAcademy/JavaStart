package pizza;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        printPizza();
        getPizza();
    }

    private static void getPizza() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prosze podaj pizze, którą chcesz zamówic");
        Pizza pizza =  Pizza.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Gratuluje zamówiłeś " + pizza.name());
    }

    private static void printPizza() {
        System.out.println("Dostepne pizze");
        Pizza[] values = Pizza.values();
        for (Pizza value : values) {
            System.out.println(value);
        }
    }


}
