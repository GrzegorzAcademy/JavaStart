package files.filesSterilize;

import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable {
    public static final int MAX_EMPLYESS = 3;
    int index = 0;
    Employee[] employees = new  Employee[MAX_EMPLYESS];
    public void add(Employee employee){
        employees[index] = employee;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : employees) {
         stringBuilder.append(employee.toString());
         stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
