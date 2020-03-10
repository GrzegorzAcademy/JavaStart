package equals;

public class DataStore {
    private final int MAX_COMPUTERS = 100;

    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computerNumber;

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computerNumber];
        for (int i = 0; i < computerNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    void add(Computer computer) {
        if (computerNumber < MAX_COMPUTERS && computer != null) {
            computers[computerNumber] = computer;
            computerNumber++;
        }
    }

    int checkAvalibility(Computer find) {
        if (find == null)
            return 0;

            int count = 0;

            for (int i = 0; i < computerNumber; i++)
                if (find.equals(computers[i])) {
                    count++;

                }
            return count;
        }
    }


