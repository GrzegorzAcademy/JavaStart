package operationToTable;

import java.sql.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] names = new String[]{" Zosia ", " Ania", " Kasia", " Franek"};
        Integer[] numbers = new Integer[]{1, 3, 5, 7, 9, 8, 6, 4, 2};

//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(numbers));


        System.out.println();
        String[] namesCopy = Arrays.copyOf(names, names.length);
        System.out.println(Arrays.toString(namesCopy));
        //   Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        Integer[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbersCopy));
        // Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println();
        System.out.println(Arrays.equals(names, namesCopy));
        System.out.println(Arrays.equals(numbers, numbersCopy));
        System.out.println();

        String[] names1 = new String[5];
        Arrays.fill(names1,"Ania");
        printArray(names1);

//
//        printArray(names);
//        printArray(numbers);
    }

    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();

    }
}

