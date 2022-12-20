package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz
        LocalDateTime japanTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germanyTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        long diff = ChronoUnit.HOURS.between(germanyTime, japanTime);
        System.out.println("diff = " + diff); // diff = 6

        //Example 2: Sabit bir tarih olusturunuz
        LocalDate myDate = LocalDate.of(2011, Month.APRIL, 13);
        System.out.println(myDate); // 2011-04-13

        /*
        1) Java'da sabit datalari (Gun, ay, amerikadaki eyalet isimleri gibi) depolamak ve gerektiginde kullanmak icin
        depolar olustururuz. Bu depolara "Enum" denir. Enum'larin icine degisecek datalar konulmaz.
         */

        //Example 3: USA icin "Woow!", UK icin "Big", Canada icin "Cold", Turkiye icin "Vatan", Germany icin "Araba", Rwanda icin "Cay" yazalim
        Countries country = Countries.TURKEY;

        switch (country){
            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
            default:
                System.out.println("Tanimlanmamis ulke");

        }

    }
}
