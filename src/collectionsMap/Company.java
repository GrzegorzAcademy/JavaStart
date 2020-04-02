package collectionsMap;

import collectionsMap.Employee;

import java.util.HashMap;
import java.util.Map;


public class Company {

  private Map<String, Employee> employess = new HashMap<>();

    boolean addEmployee(Employee employee) {
        String key = employee.getFirstName() + " : " + employee.getLastName();
        if (employess.containsKey(key)) {
            return false;
        }
        employess.put(key, employee);
        return true;
    }

    Employee getEmployee(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        return employess.get(key);
    }
}
