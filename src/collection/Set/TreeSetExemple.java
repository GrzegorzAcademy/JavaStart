package collection.Set;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExemple {
    public static void main(String[] args) {

//        TreeSet<Integer>setInteger = new TreeSet<>();
//        setInteger.add(9);
//        setInteger.add(1);
//        setInteger.add(3);
//        setInteger.add(5);
//        setInteger.add(4);
//        setInteger.add(7);
//        setInteger.add(5);
//        setInteger.add(8);
//        System.out.println(setInteger);
//        System.out.println("size " + setInteger.size());
//        System.out.println("first "+setInteger.first());
//        System.out.println("last "+  setInteger.last());
//        System.out.println("contains 0 " + setInteger.contains(0));
//        System.out.println("contains 5 " + setInteger.contains(5));
        TreeSet<Person>setPerson = new TreeSet<>();
        setPerson.add(new Person("Adam", "Smyk"));
        setPerson.add(new Person("Jan", "Kowalski"));
        setPerson.add(new Person("Anna", "Nowak"));
        setPerson.add(new Person("Jan", "Kowalski"));
        setPerson.add(new Person("Roman", "Polański"));
        setPerson.add(new Person("Jan", "Kowalski"));
        System.out.println(setPerson.toString());
        System.out.println("size " + setPerson.size());
        System.out.println("contains Jan Kowalski " + setPerson.contains(new Person("Jan", "Kowalski")));

    }
}
