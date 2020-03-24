package bigNumber;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class App {
    public static void main(String[] args) {

        final String FILE_NAME ="numbers.txt";

        try(
                FileReader fileReader =  new FileReader(FILE_NAME);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                ) {
            Integer a = Integer.valueOf(bufferedReader.readLine());
            Integer b = Integer.valueOf(bufferedReader.readLine());
            Integer c = Integer.valueOf(bufferedReader.readLine());
            BigInteger d = new BigInteger(bufferedReader.readLine());
            BigInteger e = new BigInteger(bufferedReader.readLine());
            System.out.println("liczba a  = " + a + " liczba b = " + b + " liczba c = " + c+ " ");
            System.out.println("liczba b = " + d + " liczba e = " + e);
            System.out.println();
            System.out.println("a + b + c " + " result  = " +(a+b+c));
            System.out.println(" c + d " + " result = " +d.add(e));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
