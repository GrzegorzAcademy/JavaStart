package table;

public class Tables {
    public static void main(String[] args) {

            int[] tab1 = new int[]{1, 2, 3};
            int[] tab2 = new int[]{3, 4, 5};
            ArrayUtils arrayUtils = new ArrayUtils();
            int sum = arrayUtils.tables(tab1,tab2);
            System.out.println(sum);
        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i]);
        }
        }
    }

