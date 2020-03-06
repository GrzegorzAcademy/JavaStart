package customer.logic;

import java.util.Scanner;

public class LogicApp {
    public static void main(String[] args) {
int licz = 0;
        int sum = getSum();
        lux(sum);
    }

    private static void lux(int sum) {
        int mod = sum %  2;
        if(mod == 0){
            System.out.println(sum + " " + "parzysta");
        } else {
            System.out.println( sum +""+ " nieparzysta");
        }
    }

    private static int getSum() {
        int licz;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while ((licz = scanner.nextInt() )<=100){
            sum+=licz;
        }
        return sum;
    }
}
