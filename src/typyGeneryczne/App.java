package typyGeneryczne;

public class App {
    public static void main(String[] args) {


//        StringContainer stringContainer = new StringContainer();
//        stringContainer.setTabString(new String[]{" Asia", " Kasia " , " Zosia "});
//        stringContainer.printArray();
//        System.out.println();
//
//        IntConatiner intConatiner = new IntConatiner();
//        intConatiner.setTabInt(new int[]{1,2,3,4,5});
//        intConatiner.printArray();
//        System.out.println();

        Conatiner<Integer> conatiner = new Conatiner();
        conatiner.setArray(new Integer[]{5,10,15});
        conatiner.printArray();
        System.out.println();

        Integer[] array = conatiner.getArray();
        System.out.println(array[1]+array[2]);

        Conatiner<String> stringContainer = new Conatiner<>();
        stringContainer.setArray(new String[]{"a","s","d"});
        String[] array1 = stringContainer.getArray();
        for (String s : array1) {
            System.out.println(s.toUpperCase());
        }
    }
}
