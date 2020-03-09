package polimorfizm.polimorfizmPerson;

import org.w3c.dom.ls.LSOutput;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Roman " , "Polański", 7500,1200));
        hospital.add(new Nourse("Anna" , "Walentynowicz", 4500,11));
        hospital.add(new Nourse("Magda ", "Zodiak",4800, 15));
        System.out.println("Pracownicy szpitala: ");
        System.out.println(hospital.getInfo());
    }
}
