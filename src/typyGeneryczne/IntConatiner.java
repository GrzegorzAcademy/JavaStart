package typyGeneryczne;

public class IntConatiner {
    private int[] tabInt;

    public int[] getTabInt() {
        return tabInt;
    }

    public void setTabInt(int[] tabInt) {
        this.tabInt = tabInt;
    }
   public void printArray(){
       for (int i : tabInt) {
           System.out.println(i);

       }

   }
}


