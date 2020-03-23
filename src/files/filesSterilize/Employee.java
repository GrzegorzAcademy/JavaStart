package files.filesSterilize;

public class Employee extends Person {
    double salary;

    public Employee(String firstName, String lastname, double salary) {
        super(firstName, lastname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + salary+ " " + "zł";
    }
}
