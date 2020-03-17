package string;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj ilość słów ");
        int anInt = input.nextInt();
       input.nextLine();
        String[] swim = new String[anInt];



        for (int i = 0; i <swim.length ; i++) {
            System.out.println("podj kolejne słowo");
            swim[i] = input.nextLine();
        }
            StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <anInt ; i++) {
            stringBuilder.append(swim[i].charAt(swim[i].length()-1));
        }

            System.out.println("Twoje słowa" + " " + stringBuilder.toString());
        }
    }

