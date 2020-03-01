package customer;

public class Client {
    public boolean premium;
    private String name;
    private String lastName;


    public Client(String name, String lastName, Boolean premium) {
        this.name = name;
        this.lastName = lastName;
        this.premium = premium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }
}
