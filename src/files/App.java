package files;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        String newFile = "pliktest.txt";

        try (
                FileWriter fileWriter = new FileWriter(newFile, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            bufferedWriter.write("Asia");
            bufferedWriter.newLine();
            bufferedWriter.write("Roman");
            bufferedWriter.newLine();
            bufferedWriter.write("Kolaska");
            bufferedWriter.newLine();
            bufferedWriter.write("Zdzichu");
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}