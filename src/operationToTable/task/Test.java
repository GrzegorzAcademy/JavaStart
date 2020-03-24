package operationToTable.task;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.add(new Person("Anna","Nagórska","1234567890"));
        database.add(new Person("Kasia","Okrasa","0232525487"));
        database.add(new Person("Karol","Rosat","3265895874"));
        database.add(new Person("Gosia","Stonoga","02314785469"));
        database.add(new Person("Roman","Kot","0235896475"));
        database.add(new Person("Kasia","Zabawa","9632154785"));
        System.out.println(database);
        database.remove(new Person ("Karol","Rosat","3265895874"));
        System.out.println(database.size());
        System.out.println(database);


    }
}
