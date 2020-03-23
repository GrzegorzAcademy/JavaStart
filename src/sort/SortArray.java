package sort;
public class SortArray {
    public static void main(String[] args) {
        int[] input = {9, 7, 6, 4, 3, 1, 0, 2, 4, 6, 8};
        Sorter sorter = new Sorter() {
            @Override
            public void sorte(int[] tempArray) {
                int temp;
                for (int i = 0; i < tempArray.length; i++) {
                    for (int k = 1; k < tempArray.length; k++) {
                        if (tempArray[k - 1] > tempArray[k]) {
                            temp = tempArray[k];
                            tempArray[k] = tempArray[k - 1];
                            tempArray[k - 1] = temp;
                        }
                    }
                }
            }
        };
        printSort(input);
        sorter.sorte(input);
        printSort(input);
    }

    static void printSort(int[] output) {
        for (int value : output) {
            System.out.print(value+ " ");
        }
        System.out.println();

    }

    interface Sorter {
        public void sorte(int[] input);
    }
}
