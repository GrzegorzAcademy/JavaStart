package collectionsMap.task;

import java.util.HashMap;
import java.util.Map;

public class Company {
    Map<String, Employee> employees = new HashMap<>();


    boolean addEmployee(Employee employee) {
        String key = employee.getFirstName() + " " + employee.getLastName();
        if (employees.containsKey(key)) {
            return false;
        }
        employees.put(key, employee);
        return true;

    }

    Employee findEmployee(String firstName, String lastName) {
        String key = firstName+ " " +lastName;
        return employees.get(key);
    }
}
