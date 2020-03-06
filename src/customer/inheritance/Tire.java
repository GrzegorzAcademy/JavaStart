package customer.inheritance;

public class Tire extends Part {
    private String size;
    private int width;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Tire(int serialNumber, String producer, String model, int series, String size, int width) {
        super(serialNumber, producer, model, series);
        this.size = size;
        this.width = width;

    }

    void printInfo() {
        System.out.println(getSerialNumber() + ", " + getProducer() + ", " + getModel() + ", " + getSeries()
                + ", " + size + ", " + width);
    }
}
