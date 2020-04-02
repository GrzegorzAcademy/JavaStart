package optional;

public class PersonTest {
    public static void main(String[] args) {


        PersonDataBase personDataBase = new PersonDataBase();
        personDataBase.addPerson(new Person(1, "Anna", "Nowak"));
        personDataBase.addPerson(new Person(2, "Kasia", "Kowalska"));
        personDataBase.addPerson(new Person(3, "Zosia", "Kapuścińska"));
        personDataBase.addPerson(new Person(4, "Roman", "Kokosz"));
        personDataBase.addPerson(new Person(5, "Matylda", "Zdzich"));
        personDataBase.addPerson(new Person(6, "Karol", "People"));
        Person result1 = personDataBase.findID(2);
        Person result2 = personDataBase.findID(55);
        System.out.println("oboekt o id " + result1.getId() + "and first name "
                + result1.getFirstName() + " and last name "
                + result1.getLastName());
        if (result2 != null)
            System.out.println("oboekt o id " + result2.getId() + " and first name "
                    + result2.getFirstName() + " and last name "
                    + result2.getLastName());
        else
            System.out.println("nie ma takiego numeru");
    }

}


