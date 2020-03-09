package polimorfizm.polimorfizmPerson;

public class Hospital {
    private static final int MAX_EMPLOYES = 3;
    private Integer employesNumber = 0;

        Person[] employes = new Person[MAX_EMPLOYES];
    void add(Person person){
        if (employesNumber<MAX_EMPLOYES){
            employes[employesNumber]=person;
            employesNumber++;
        }
    }
        String getInfo(){
        String result =" ";
            for (int i = 0; i < employesNumber; i++) {
                result += employes[i].getInfo()+" \n";
            }
            return result;
        }
}