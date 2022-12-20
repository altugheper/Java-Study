package day20stringbuilderstringbuffer;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    //Example 8: Tom, Ali'den 3 yil 8 ay 13 gun sonra dogdu. Ali ise Veli'den 1 yil 15 gun once dogdu
    //           Tom'un dogum tarihi 18 kasim 2011 ise Veli ve Ali'nin dogum tarihlerini bulunuz

    public static void main(String[] args) {

        LocalDate dobTom = LocalDate.of(2011, Month.NOVEMBER, 18);
        LocalDate dobAli = dobTom.minusYears(3).minusMonths(8).minusDays(13);
        LocalDate dobVeli = dobAli.plusYears(1).plusDays(15);

        System.out.println("Tom DOB: " + dobTom+ "\n" + "Ali DOB: " + dobAli + "\n" +"Veli DOB: " + dobVeli);
    }

}
