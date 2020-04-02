package collectionsMap.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompamyApp {
    private static final int ADD_EMPLOYEE = 0;
    private static final int FIND_EMPLOYEE = 1;
    private static final int EXIT = 2;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int userOption = 0;
        Company company = new Company();

        do {
            System.out.println("Wybierz opcję");
            printOption();
            try {
            userOption = sc.nextInt();

            sc.nextLine();


                switch (userOption) {

                    case ADD_EMPLOYEE:
                        Employee employee = readAndCreateEmploye();
                        company.addEmployee(employee);
                        break;
                    case FIND_EMPLOYEE:
                        findEmployee(company);
                        break;
                    case EXIT:
                        System.out.println("Narazie");
                        break;

                }
            }
            catch (InputMismatchException e) {
                System.err.println("kupa");
            }break;
        }
        while (userOption != EXIT);
    }


    private static void findEmployee(Company company) {
        System.out.println("Podaj imię pracownika");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko");
        String lastname = sc.nextLine();
        Employee employee = company.findEmployee(firstName, lastname);
        if (employee == null)
            System.out.println("Brak pracownika o poodanuch danych");
        else
            System.out.println(employee);
    }

    private static Employee readAndCreateEmploye() {
        System.out.println("Podaj imię pracownika");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko");
        String lastname = sc.nextLine();
        System.out.println("Podaj zarobki");
        double salary = sc.nextDouble();
        sc.nextLine();
        return new Employee(firstName, lastname, salary);

    }

    private static void printOption() {
        System.out.println(ADD_EMPLOYEE + " Dodaj Pracownika");
        System.out.println(FIND_EMPLOYEE + " Szukaj Pracownika");
        System.out.println(EXIT + " Exit");
    }
}
