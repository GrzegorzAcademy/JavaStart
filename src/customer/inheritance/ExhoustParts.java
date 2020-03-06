package customer.inheritance;

public class ExhoustParts extends Part {
    private Boolean europeanStandard;

    public ExhoustParts(int idNumber, String manufacturer, String model, int serie,Boolean europeanStandard) {
        super(idNumber, manufacturer, model, serie);
    }

    void printInfo() {
        System.out.println(getSerialNumber() + ", " + getProducer() + ", " + getModel() + ", " + getSeries()
                + ", " + europeanStandard);
    }

    public Boolean getEuropeanStandard() {
        return europeanStandard;
    }

    public void setEuropeanStandard(Boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
    }
}
