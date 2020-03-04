package loops.loopsTask;

public class Patient {
  private  String firstName;
   private String lastName;

    public Patient() {
    }

    private  String PESEEL;

    public Patient(String firstName, String lastName, String PESEEL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PESEEL = PESEEL;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPESEEL() {
        return PESEEL;
    }

    public void setPESEEL(String PESEEL) {
        this.PESEEL = PESEEL;
    }
}
