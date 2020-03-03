package customer.calculator;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        Double x = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("podaj działanie jakie chcesz wykonac +,- ,*,/");
        String operator = scanner.nextLine();
        System.out.println("Podaj druga liczbe");
       Double y = scanner.nextDouble();
        CalcServis cal = new CalcServis();
       Double result= cal.calculate(x,y,operator);
        System.out.println(x + operator + y + " wynik "+ result);



    }
}

