package operationToTable;

import java.util.Arrays;

public class TableExample {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
        int[] numbers2 = new int[numbers.length];
        System.arraycopy(numbers,0,numbers2,1,numbers.length-2);
        System.out.println(Arrays.toString(numbers2));
    }
}
