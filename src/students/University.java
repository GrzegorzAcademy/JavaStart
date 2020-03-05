package students;

import java.util.Scanner;

public class University {

    public static void main(String[] args) {
        System.out.println("ilość studentóe przed zapisami " + Student.getStudentsNumber());
     Student student1 = new Student("Adam", "nowak", 1234);
     Student student2 = new Student("Roman", "Polański", 2345);
        System.out.println(" ilość studentów po zapisach "+ Student.getStudentsNumber());
    }
}