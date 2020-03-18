package sort;

public class ArraySorter {
    public static void main(String[] args) {


        Sortable sorter = new Sortable() {
            @Override
            public void sort(int[] tab1) {
                int temp;
                for (int i = 0; i < tab1.length; i++) {
                    for (int j = 1; j < tab1.length - i; j++) {
                        if (tab1[j - 1] > tab1[j]) {
                            temp = tab1[j];
                            tab1[j] = tab1[j - 1];
                            tab1[j - 1] = temp;

                        }
                    }
                }
            }
        };
        int[] tab = {10, 8, 6, 4, 2, 1, 3, 5, 7, 9};
       printArray(tab);
       sorter.sort(tab);
       printArray(tab);

    }

    static void printArray(int[] tab1) {
        for (int value : tab1) {
            System.out.print(value + "  ");
        }
        System.out.println();
    }
}

interface Sortable {
    void sort(int[] tab);
}

