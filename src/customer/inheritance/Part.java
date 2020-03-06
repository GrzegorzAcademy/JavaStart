package customer.inheritance;

public class Part {
    private int serialNumber;
    private String producer;
    private String model;
    private int series;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Part(int serialNumber, String producer, String model, int series) {
        this.serialNumber = serialNumber;
        this.producer = producer;
        this.model = model;
        this.series = series;

    }
}
