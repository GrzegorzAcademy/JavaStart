package table.tablesTask;

import java.util.Arrays;

public class Tables {
    public static void main(String[] args) {

        double[][] tab = new double[3][3];
        tab[0][0] = 1;
        tab[0][1] = 1.5;
        tab[0][2] = 2.0;
        tab[1][0] = 1.5;
        tab[1][1] = 2.0;
        tab[1][2] = 2.5;
        tab[2][0] = 2.0;
        tab[2][1] = 2.5;
        tab[2][2] = 3.0;
        double sum = (tab[0][0]*tab[1][1]*tab[2][2]);
        double sum2 = tab[0][2]*tab[1][1]*tab[2][0];
        System.out.println(sum+sum2);
        double sum3 = tab[1][0]+tab[1][1] +tab[1][2];
        double sum4 = tab[0][1] +tab[1][1] +tab[2][1];
        System.out.println(sum3*sum4);
        double sum5 = tab[0][0]+tab[0][1]+tab[0][2]+tab[1][1]+tab[2][2]+tab[2][1]+tab[2][0]+ tab[1][0];
        System.out.println(sum5);

        double[][] tab2 = {{1.0,1.5,2.0},
                            {1.5,2.0,2.5},
                            {2.0,2.5,3.0}
        };
        for (int i = 0; i < tab.length; i++) {
            System.out.println(Arrays.toString(tab2[i]));
        }
    }
}