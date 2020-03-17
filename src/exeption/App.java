package exeption;

import java.time.chrono.IsoEra;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[2];
        boolean error = true;
        do{
             try {
                 System.out.println("podaj pirewsza liczbe");
                 number[0] = scanner.nextInt();
                System.out.println("podaj druga liczbe");
                number[1] = scanner.nextInt();
                 System.out.println("podaj która liczbe chcesz wyswietlic 1 czy 2");
                 System.out.println("liczba : " + number[scanner.nextInt()-1]);
                 error = false;
        } catch (InputMismatchException e){

            System.err.println("podana wartość nie jest liczbą całkowita");
            scanner.nextLine();

        }catch (ArrayIndexOutOfBoundsException e){
                 System.out.println("podałeś lczbe z po za zakresu 1-2");
                 scanner.nextLine();
             }
        } while (error);
}
}
