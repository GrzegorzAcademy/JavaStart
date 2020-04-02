package optional;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class PersonDataBase {

    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        if (person == null)
            throw new NullPointerException("Cannot null of operation");
        if (findID(person.getId()) != null)
            throw new IllegalArgumentException("illegal argument");
        people.add(person);
    }

   Optional<Person> findID(int id) {
        for (Person person : people) {
            if (person.getId() == id)
                return Optional.of(person);
        }
        return Optional.empty();
    }
}

