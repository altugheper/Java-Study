package day07ternarystringmanipulations;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*
        String Class Methodlari
        1)equals(): i) Iki tane String'in ayni olup olmadigini anlamamiza yarar
                    ii) equals () methodu "boolean" return eder
        2)equalsIgnoreCase(): i)Iki tane String'in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar
                              ii)"boolean" return eder
        3)toLowerCase(): i) Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir
                         ii)"String" return eder
        4)toUpperCase(): i) Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir
                        ii)"String" return eder
        5)chartAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir
                     ii) "Char" return eder
        6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                    ii) "int" return eder
        7)contains() i)Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
                     ii) "boolean" return eder
        8)split(): i) Bir String'i istediginiz character'den parcalamaya yarar
                   ii) "Array" return eder
        9)substring(): i) Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.

         */


        /*
        Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz:
        i) En az 8 karakter icermeli
        ii) Space karakteri icermemeli
        iii) Ilk harfi "M" veya "m" olmali
        iv) Son karakteri "?" olmali
         */

        String pwd = "Manisa12?";

        //En az 8 karakter icermeli
        boolean first = pwd.length()>7;

        //Space karakteri icermemeli
        boolean second = !pwd.contains(" ");

        //Ilk harfi "M" veya "m" olmali
        boolean third = pwd.charAt(0) == 'M' || pwd.charAt(0) == 'm';

        //Son karakteri "?" olmali
        boolean fourth = pwd.charAt(pwd.length()-1) == '?';

        System.out.println(first && second && third && fourth);

    }
}
