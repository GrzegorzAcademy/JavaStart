package collection.Set;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        System.out.println(set);

        HashSet<String> strings = new HashSet<>();
        strings.add("CC");
        strings.add("CC");
        strings.add("AA");
        strings.add("AA");
        strings.add("BB");
        strings.add("BB");
        strings.add("AA");
        strings.add("AA");
        strings.add("CC");
        strings.add("CC");
        System.out.println(strings);
    }
}
