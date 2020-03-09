package polimorfizm.polimorfizmPerson;

public class Person {
    private String firstName;
    private String lastName;
    private Integer payment;

    public Person(String firstName, String lastName, Integer payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payment = payment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }
    String getInfo(){
        return "Imie "+ firstName + " Nazwisko "+ lastName +" Wypłata " + payment;
    }
}
