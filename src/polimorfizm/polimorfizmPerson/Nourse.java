package polimorfizm.polimorfizmPerson;

public class Nourse extends Person{
    private Integer overtTme;

    public Nourse(String firstName, String lastName, Integer payment, Integer overtTme) {
        super(firstName, lastName, payment);
        this.overtTme = overtTme;
    }

    public Integer getOvertTme() {
        return overtTme;
    }

    public void setOvertTme(Integer overtTme) {
        this.overtTme = overtTme;
    }

    @Override
    String getInfo() {
       return super.getInfo()+" Nadgodziny "+overtTme;
    }
}
