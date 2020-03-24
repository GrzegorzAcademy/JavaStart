package typyGeneryczne.task;

public class Test {
    public static void main(String[] args) {
        Pair<String,Integer> person1 = new Pair<>("Anna",37);
        Pair<Integer,Integer> person2 = new Pair<>(133,123);
        Pair<String,Integer> person3 = new Pair<>("Robert",36);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person2.getName()+person2.getLastname());
        System.out.println();
        printPair(person1);
        printPair(person2);
        printPair(person3);

    }
    static <T,V> void printPair(Pair<T,V> pair){
        System.out.println(pair.toString());

    }
}
