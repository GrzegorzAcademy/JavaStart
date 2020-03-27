package list;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListExampleContinue {
    public static void main(String[] args) {
        Integer[] list = {5,10,15,20,25};
        List<Integer> integers = Arrays.asList(list);
        List<Integer> list1 = List.of(list);
        System.out.println(list1);
        System.out.println(integers);

    }
}
