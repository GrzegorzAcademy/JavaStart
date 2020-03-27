package list.task.task1;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    private static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> listNumbers = new LinkedList<>();
        sumNumbers(listNumbers);
        printNumbers(listNumbers);
    }
    private static void printNumbers(List<Double> listNumbers) {
        if (!listNumbers.isEmpty()) {
            double sum = 0;
            StringBuilder sb = new StringBuilder();
            for (Double d : listNumbers) {
                sb.append(d);
                sb.append(" + ");
                sum += d;
            }
            sb.replace(sb.length() - 1, sb.length(), " = ");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }
    private static void sumNumbers(List<Double> listNumbers) {
        System.out.println("podaj liczbę lub wpisz exit");
        String input = sc.nextLine();
        if (input.equals(EXIT)) {
            return;
        }
        try {
            Double num = Double.valueOf(input);
            listNumbers.add(num);
        } catch (NumberFormatException e) {
            System.err.println("Nieprawidłowy format danych ");
        }
        sumNumbers(listNumbers);
    }
}