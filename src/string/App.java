package string;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        System.out.println("Podaj prosze ilość wyrazów");
        int number = cs.nextInt();
        cs.nextLine();
       String[] words = new String[number];

        for (int i = 0; i < words.length; i++) {
            System.out.println("podaj kolejne słowo");

            words[i] = cs.nextLine();

        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <number ; i++) {

            stringBuilder.append(words[i].charAt(words[i].length()-1));

        }
        System.out.println("Nowe słowo w słownku  "+stringBuilder.toString());
    }
}
