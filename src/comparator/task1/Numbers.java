package comparator.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Numbers {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 3, 5, 7, 9, 8, 6, 4, 2, 10, 12, 11, 14, 13, 16, 15, 18, 17};

//        Arrays.sort(numbers);
//        for (int number : numbers) {
//            System.out.println(number);
       // }
Arrays.sort(numbers, new Comparator<Integer>() {
    @Override
    public int compare(Integer integer, Integer t1) {
        return -Integer.compare(integer,t1);
    }
});
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

}
