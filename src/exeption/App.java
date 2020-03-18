package exeption;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("POdaj pierwszą liczbę");
        int firstNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj proszę drugą liczbę");
        int lastNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("podaj prosze operator działania jakie chcesz wykonać masz do wyboru /,* ,*, - ,+ ");
        String operator = sc.nextLine();
        switch (operator){
            case "/":
                try{
                   int wynik =  firstNumber/lastNumber;
                }catch (IllegalArgumentException e){
                    System.out.println("nie dzielimy przez zero");
                }
        }
    }
}
