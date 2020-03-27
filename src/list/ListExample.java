package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
//        double[] doubles =new double[3];
//        doubles[0] = 2.5;
//        doubles[1] = 3.5;
//        doubles[2] = 4.5;
//        System.out.println(Arrays.toString(doubles));
//        double[] doubles1 = Arrays.copyOf(doubles, 10);
//        System.out.println(Arrays.toString(doubles1));

//
//        ArrayList<Double> ListDoubles = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            ListDoubles.add(Double.valueOf(i));
//
//        }


//        ListDoubles.add(2.5);
//        ListDoubles.add(3.5);
//        ListDoubles.add(4.5);
//        System.out.println(ListDoubles.size());
//        System.out.println(ListDoubles);
//        System.out.println(ListDoubles.get(50));
//        ListDoubles.remove(2);
//        System.out.println(ListDoubles);
//        System.out.println(ListDoubles.size());
//        System.out.println(ListDoubles.get(50));
        ArrayList<Double> list1 = new ArrayList<>();
        LinkedList<Double> list2 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list1.add((double) i);
            list2.add((double) i);
        }

        printList(list1);
        printList(list2);
    }

    private static void printList(List<Double> list) {
            for (Double aDouble : list) {
                System.out.println(aDouble);

            }

        }
    }


