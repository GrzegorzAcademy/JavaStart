package loops;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ilosc liczb które chcesz zsumowac");
        int i = scanner.nextInt();
        int sum = 0;
        while(i>0){
            System.out.println("podaj liczb e do dodania");
            sum = sum + scanner.nextInt();
            i--;
        }
        System.out.println("suma podanych przez ciebie liczb to " + sum);
    }

}
