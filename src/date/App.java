package date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
//      Instant instant = Instant.now();
//        for (int i = 0; i <100000000 ; i++) {
//
//        }

//        Instant i2 = Instant.now();
//        Duration duration = Duration.between(instant, i2);
//        System.out.println("Pętla wykonała się  w " + duration.getUnits());
        // pętla wysiwetlajaca date co sekunde 10 razy
//        LocalDateTime localDateTime = LocalDateTime.now();
//        for (int i = 0; i <5 ; i++) {
//            localDateTime = localDateTime.plusSeconds(1);
//            Thread.sleep(1000);
//            System.out.println(localDateTime);

//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate.getDayOfWeek());
        // sprawdzanie czy wpisana data jest przed lokalną
//        LocalDate now = LocalDate.now();
//        LocalDate start = LocalDate.of(2014,1,1);
//        boolean check = now.isAfter(start);
//        System.out.println("czy 14,1,1 jest przed dzisiejszą datą " +check);
//program ustawia lokalną date i godzine na podaną w metodzie of
//        LocalDateTime localDateTime = LocalDateTime.now();
//      LocalDateTime local =  localDateTime.of(2018,10,04,10,22);
//        System.out.println(local);
        System.out.println("Tworze nowe wydarzenie ");
        System.out.println("podaj date w formacie dd-MM-yy");
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        String dateImput = sc.nextLine();
            LocalDate dateCreate = LocalDate.parse(dateImput, dateTimeFormatter);
        System.out.println(dateCreate);
    }
}

