package equals;

public class NotebookShop {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Apple", 12));
        dataStore.add(new Computer("MAC", 13));
        dataStore.add(new Computer("Apple", 12));
        dataStore.add(new Computer("MAC", 13));
        dataStore.add(new Computer("LENOVO", 45));
        dataStore.add(new Computer("DELL", 45));


        Computer compFind = new Computer("Apple", 12);
         int computersToFind = dataStore.checkAvalibility(compFind);
        System.out.println("Liczba komputerów "+ compFind+ " "+ computersToFind);

        System.out.println("Wszystkie dostepne komputery: ");
        for (Computer c : dataStore.getComputers()){
            System.out.println(c);
        }
    }
}
