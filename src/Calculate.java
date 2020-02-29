public class Calculate {
    public static void main(String[] args) {
        Calculator add = new Calculator();
        System.out.println(add.add(2,6));
        System.out.println(add.add(2,6,18));
        Calculator sub = new Calculator();
        System.out.println(sub.subtract(6,2));
        System.out.println(sub.subtract(6,2,12));

    }
}
