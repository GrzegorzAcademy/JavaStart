package collectionsMap;

public class Employee {
    private String firstName;
    private String lastName;
    private Double cash;

    public Employee(String firstName, String lastName, Double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
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

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lsatName='" + lastName + '\'' +
                ", cash=" + cash +
                '}';
    }
}
