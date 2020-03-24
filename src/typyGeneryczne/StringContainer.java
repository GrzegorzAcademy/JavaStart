package typyGeneryczne;

public class StringContainer {
    private String[] tabString;

    public String[] getTabString() {
        return tabString;
    }

    public void setTabString(String[] tabString) {
        this.tabString = tabString;
    }
    public void printArray(){
        for (String s : tabString) {
            System.out.println(s);
        }
    }
}
