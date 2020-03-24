package typyGeneryczne;

public class Conatiner<T> {
    T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
    public void printArray(){
        for (T t : array) {
            System.out.println(t);
        }
    }
}
