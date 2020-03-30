package collection.Set.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class App {
    private static final String File_Name  = "namespl.txt";
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                return -t1.compareTo(t2);
            }
        });

        try (Scanner sc = new Scanner(new File(File_Name))) {
            while (sc.hasNextLine()) {
                names.add(sc.nextLine());
            }
            System.out.println(names.size());
            System.out.println(names.first());
            System.out.println(names.last());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}