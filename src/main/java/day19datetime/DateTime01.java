package day19datetime;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); // 2022-10-21

        //Example 2: "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); // 19:41:15.789560900

        //Example 3: "Current Date" ve "Current Time" ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); // 2022-10-21T19:44:51.309050300

        //Example 4: Japonya'daki "Current Date" ve "Current Time" ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeJapan); // 2022-10-22T02:50:28.611894600

        //Example 5: Istanbul'daki "Current Date" ve "Current Time" ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeIstanbul); // 2022-10-21T20:55:16.862030600

        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz
        LocalDate bugununTarihi = LocalDate.now();
        LocalDate retireDate = bugununTarihi.plusDays(789);
        System.out.println(retireDate);

        //2. Yol:
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate2 = countDate.plusDays(789);

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff); // 2824

        //Example 8: Tom, Ali'den 3 yil 8 ay 13 gun sonra dogdu. Ali ise Veli'den 1 yil 15 gun once dogdu
        //           Tom'un dogum tarihi 18 kasim 2011 ise Veli ve Ali'nin dogum tarihlerini bulunuz
        LocalDate dobTom = LocalDate.of(2011,11, 18);
        LocalDate dobAli2 = dobTom.minusYears(3).minusMonths(8).minusDays(13);
        LocalDate dobVeli2 = dobAli2.plusYears(1).plusDays(15);

        System.out.println("Tom DOB: " + dobTom + "\n" + "Ali DOB: " + dobAli2 + "\n" + "Veli DOB: " + dobVeli2);

        //Example 8: Istanbul'un fethi ile, Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız.
        //           29 Mayıs 1453 ==> İstanbul'un fethi           29 Ekim 1923 ==> Cumhuriyetin kuruluşu

        LocalDate istanbulFetih = LocalDate.of(1453, 5, 29);
        LocalDate cumhuKurulus = LocalDate.of(1923, 10, 29);

        Long aySayisi = ChronoUnit.MONTHS.between(istanbulFetih, cumhuKurulus);
        System.out.println(aySayisi); // 5645

        //Example 9: Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989, 3, 28);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if (day>21 && month==3) {
            System.out.println("Boga");
        }else if (day<20 && month==4) {
            System.out.println("Boga");
        }


    }
}
