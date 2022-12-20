package day07ternarystringmanipulations;

public class NestedTernary01 {
    public static void main(String[] args) {


        /*
        Verilen yilin "Leap Year" (Artik Yil) olup olmadigini kontrol ediniz.
        i) Yil 100e bolunurse 400'e de bolunmelidir ==> 1600+ 1800-
        ii) Yil 100'e bolunmezse 4'e bolunmelidir == 1996+ 2001-
         */
        int year = 1600;

        String leap = year%100==0 ? (year%400==0 ? "Leap Year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degildir");

        System.out.println(leap);

        /*
        Asagidaki kurallara gore password'un gecerli olup olmadigini kontrol eden kodu yaziniz
        i) Sekiz karakterden fazla ya da 8 karakter karakter varsa ilk harfi 'i' olmalidir
        ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir
         */
        String pwd = "i2a3ed54";

        String gecerli = pwd.length()<8 ? (pwd.charAt(0)=='K' ? "Gecerli" : "Gecersiz") : (pwd.charAt(0)=='i' ? "Gecerli" : "Gecersiz");


    }
}
