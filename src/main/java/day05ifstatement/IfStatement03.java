package day05ifstatement;


import java.util.Scanner;

public class IfStatement03 {

    /*
        Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
        Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
            i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
            ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.
    */

    public static void main(String[] args) {

        //Example 1: Kullanicidan gun isimlerini aliniz, o gunu hafta sonu mu hafta ici mi oldugunu kullaniciya soyleyiniz
        //           Pazartesi==>Hafta ici        Pazar==>Hafta sonu
        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz...");
        String day = input.next();

        if (day.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu");
        } else if (day.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta ici");
        }else if (day.equalsIgnoreCase("Sali")) {
            System.out.println("Hafta ici");
        }else if (day.equalsIgnoreCase("Carsamba")) {
            System.out.println("Hafta ici");
        }else if (day.equalsIgnoreCase("Persembe")) {
            System.out.println("Hafta ici");
        }else if (day.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");
        }else if (day.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        //2.Yol
       if (day.equalsIgnoreCase("Pazar") || day.equalsIgnoreCase("Cumartesi")) {
           System.out.println("Hafta sonu");
       }else if (day.equalsIgnoreCase("Pazartesi")
               || day.equalsIgnoreCase("Sali")
               || day.equalsIgnoreCase("Carsamba")
               || day.equalsIgnoreCase("Persembe")
               || day.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");
        }else System.out.println("Gecerli bir gun ismi giriniz");

        //3.Yol: (EN IYI YOL)
        Scanner input1 = new Scanner(System.in);
        System.out.println("Bir gun giriniz...");
        String day1 = input.next();

        boolean haftaSonu = day1.equalsIgnoreCase("Pazar") ||
                day1.equalsIgnoreCase("Cumartesi");

        boolean haftaIci = day1.equalsIgnoreCase("Pazartesi") ||
                day1.equalsIgnoreCase("Sali") ||
                day1.equalsIgnoreCase("Carsamba") ||
                day1.equalsIgnoreCase("Persembe") ||
                day1.equalsIgnoreCase("Cuma");

        if (haftaSonu) {
            System.out.println("Hafta sonu...");
        }else if (haftaIci) {
            System.out.println("Hafta ici...");
        }else {
            System.out.println("Gecerli bir gun giriniz");
        }



    }

}


