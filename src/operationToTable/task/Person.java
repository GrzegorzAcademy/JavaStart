package operationToTable.task;

import java.util.Objects;

public class Person {
    String name;
    String lastName;
    String pessel;

    public Person(String name, String lastName, String pessel) {
        this.name = name;
        this.lastName = lastName;
        this.pessel = pessel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPessel() {
        return pessel;
    }

    public void setPessel(String pessel) {
        this.pessel = pessel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = " + name + '\'' +
                ", lastName = " + lastName + '\'' +
                ", pessel = " + pessel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(pessel, person.pessel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, pessel);
    }
}
