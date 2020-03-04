package loops.loopsTask;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatient = 2;
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        Hospital hospital = new Hospital();

                   while (option!=exit){
                System.out.println("dostepne opcje:");
                System.out.println(exit+ " -wyjscie z programu");
                System.out.println(addPatient+ " dodanie pacjenta");
                System.out.println(printPatient+ " wyswietlanie liczby pacjentów");
                System.out.println("wybierz opcje ");
                option = scanner.nextInt();
                scanner.nextLine();

                switch(option){
                    case addPatient:
                        Patient patient = new Patient();
                        System.out.println("Imię:");
                        patient.setFirstName(scanner.nextLine());
                        System.out.println("lastName");
                        patient.setLastName(scanner.nextLine());
                        System.out.println("Pessel");
                        patient.setPESEEL(scanner.nextLine());
                        hospital.addPatients(patient);
                        break;
                    case printPatient:
                        hospital.printPatients();
                        break;
                        case exit:
                        System.out.println("żegnaj użytkowniku ");
                        break;
                    default:
                        System.out.println("nie znaleziono opcji");
                }
        }
        scanner.close();
    }
}
