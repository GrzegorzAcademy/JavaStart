package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ProductCatalog {
    public static void main(String[] args) {

//        Product p1 = new Product("Amino","Racuchy",7.20);
//        Product p2 = new Product("Amino","Zupa Ogórkowa",17.20);
//        System.out.println(p1.compareTo(p2));


        Product[] product = new Product[7];
        product[0] = new Product("Amino", "Zupa Pomidorowa", 3.90);
        product[1] = new Product("Amino", "Zupa Ogórskowa", 3.90);
        product[2] = new Product("Winiary", "Zupa Pomidorowa", 4.20);
        product[3] = new Product("Winiary", "Zupa Pieczarkowa", 4.10);
        product[4] = new Product("Winiary", "Zupa Rosół", 3.60);
        product[5] = new Product("Knorr", "Placki Ziemiaczane", 6.40);
        product[6] = new Product("Knorr", "Racuchy", 7.20);

        System.out.println("Tablica nie po sortowana ");
        for (Product product1 : product) {
            System.out.println(product1);

        }
//sotrowanie za pomocą osobnej klasy implementującej komparator
//        Product.ProductNameComparator productNameComparator = new Product.ProductNameComparator();
//        System.out.println("tablica po sortowaniu ");
//        Arrays.sort(product,productNameComparator);
//        for (Product productSort : product) {
//            System.out.println(productSort);
        System.out.println("Tablica po sortowaniu w klasie zagnieżdzonej");
        Arrays.sort(product, new Comparator<Product>() {
            @Override
            public int compare(Product t1, Product t2) {
                return t1.getProducer().compareTo(t2.getProducer());
            }
        });
        for (Product product3 : product) {
            System.out.println(product3);
        }
    }
}

