package operationToTable.task;

import java.util.Arrays;

public class PersonDatabase {

    private static final Integer INITIAL_PLACE = 1;
    Person[] people = new Person[INITIAL_PLACE];
    private int emptyPlace = 0;

    void add(Person person) {
        if (person == null)
            throw new NullPointerException("Impossible empty");
        if (emptyPlace == people.length) {
            people = Arrays.copyOf(people, people.length*2);
        }
        people[emptyPlace] = person;
        emptyPlace++;
    }
   void remove(Person person){
       if (person == null)
           throw new NullPointerException("Impossible empty");
      final int notFound = -1;
       int found = notFound;
       for (int i = 0; i < emptyPlace && found==notFound ; i++) {
           if(person.equals(people[i])){
               found = i;

           }


       }if(found!=notFound) {
           System.arraycopy(people, found + 1, people, found, people.length - found - 1);
           emptyPlace--;
           people[emptyPlace] = null;
       }
   }

    Person get(int index){
        if(index>=people.length | index<0){
            throw new ArrayIndexOutOfBoundsException("Podałeś zły paramertr");
        }
        return people[index];
    }
    int size(){
        return emptyPlace;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" PersonDataBase " + emptyPlace);
        stringBuilder.append("\n");
        for (int i = 0; i < emptyPlace; i++) {
            stringBuilder.append(" > ");
            stringBuilder.append(people[i].toString());
            stringBuilder.append("\n ");
        }
        return stringBuilder.toString();
    }
}