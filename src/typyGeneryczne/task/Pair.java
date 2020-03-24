package typyGeneryczne.task;

public class Pair<T,V> {
  private   T name;
   private V lastname;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getLastname() {
        return lastname;
    }

    public void setLastname(V lastname) {
        this.lastname = lastname;
    }

    public Pair(T name, V lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return
                " name = " + name +
                ", lastName = " + lastname ;
    }
}

