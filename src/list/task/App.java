package list.task;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);
    private static final String EXIT = "exit";

    public static void main(String[] args) {

        List<Double> numbers = new LinkedList<>();
        addnumbers(numbers);
        printResult(numbers);


    }

    private static void printResult(List<Double> numbers) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        if (!numbers.isEmpty()) {
            for (Double number : numbers) {
                sb.append(number);
                sb.append("+");
                num+=number;
            }
            sb.replace(sb.length() -1, sb.length(), " = ");
            sb.append(num);
            System.out.println(sb.toString());
        }
    }

    private static void addnumbers(List<Double> numbers) {
        System.out.println("podaj liczbe lub wpisz exit");
        String input = sc.nextLine();
        if (input.equals(EXIT)) {
            return;
        }
        try {
            Double aDouble = Double.valueOf(input);
            numbers.add(aDouble);

        } catch (NumberFormatException e) {
            System.err.println("Liczba w nieprawidłowym formacie ");
        }
        addnumbers(numbers);
    }
}

