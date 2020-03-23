package files.filesSterilize;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    private static final String FILE_NAME = "employees.info";
    private static final int ADD_EMPLOYEES = 1;
    private static final int READ_EMPLOYESS = 2;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dodanie pracownika " + ADD_EMPLOYEES);
        System.out.println("Wyswietlenie pracowników  " + READ_EMPLOYESS);


        int option = sc.nextInt();
        sc.nextLine();
        if (option == ADD_EMPLOYEES) {
            Company company = createCompany();
            writeFile(company);
        } else if (option == READ_EMPLOYESS) {
            try {
                Company company = readFiles();
                System.out.println(company);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println(" bład odczytu danych ");
            }
        }
        sc.close();
    }

    private static Company readFiles() throws IOException, ClassNotFoundException {
        try (
                FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ) {
            return (Company) objectInputStream.readObject();


        }
    }

    private static void writeFile(Company company) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(company);
            System.out.println("zapisoano dane");

        } catch (IOException e) {
            System.err.println(" Błąd zapisu pliku ");
        }
    }

    private static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < Company.MAX_EMPLYESS; i++) {
            System.out.println(" podaj imie pracownika ");
            String firstname = sc.nextLine();
            System.out.println(" podaj nazwisko pracownika ");
            String lastName = sc.nextLine();
            System.out.println(" podaj zarobki pracownika ");
            double salary = sc.nextDouble();
            sc.nextLine();
            company.add(new Employee(firstname, lastName, salary));


        }
        return company;
    }
}
