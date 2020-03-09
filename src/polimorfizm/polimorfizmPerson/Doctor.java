package polimorfizm.polimorfizmPerson;

public class Doctor extends Person {
    private Integer bonus;

    public Doctor(String firstName, String lastName, Integer payment, Integer bonus) {
        super(firstName, lastName, payment);
        this.bonus = bonus;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    @Override
    String getInfo() {
        return super.getInfo()+" bonus "+ bonus;
    }
}
