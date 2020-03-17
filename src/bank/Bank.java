package bank;

public class Bank {
    public static void main(String[] args) {
Person person1 = new Person();
person1.firstName= "Jan";
person1.lastName = "Kowalski";
person1.pessel = "90897812362";
person1.miasto = "Warszawa";
Person person2 = new Person();
person2.firstName = "Marta";
person2.lastName = "Kowalska";
person2.miasto = "Warszawa";

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.ballance = 10_000;
        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.ballance = 20_000;

        Credit ceredit1 = new Credit();
        ceredit1.borrower = person1;
        ceredit1.cashBrrowed =50000;
        ceredit1.cashReturned =0;
        ceredit1.interestRate =0.2;
        ceredit1.itermMonth =50000;

        Credit credit2 = new Credit();
        credit2.borrower = person2;
        credit2.cashBrrowed = 2000;

        System.out.println("osoba");
        System.out.println(person1.firstName+" "+person1.lastName+" "+ person1.pessel);
            System.out.println("Mieszka w : "+ person1.miasto);
        System.out.println("posiadda konto z kwota "+ account1.ballance);
        System.out.println("kredyt "+ ceredit1.cashBrrowed);
            System.out.println("Osoba 2");
            System.out.println(person2.firstName+ ""+ person2.lastName );
            System.out.println("Mieszka w :" + person2.miasto);
            System.out.println("posiada konto bankowe z kwotą "+ account2.ballance);



    }
}