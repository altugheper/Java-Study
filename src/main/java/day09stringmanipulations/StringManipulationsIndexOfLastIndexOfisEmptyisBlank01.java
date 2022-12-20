package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulationsIndexOfLastIndexOfisEmptyisBlank01 {
    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";

        //indexOf() methodu verilen character veya character'lerin "ilk gorunumunun" indexini verir.
        //Eger indexOf() ile cumle aratirsaniz, ilk cumlenin ilk indexini verir.
        int idxA = str.indexOf("kara");

        System.out.println(idxA);

        //LastIndexOf() methodu verilen character veya characterlerin "son gorunumunun" index'ini verir.
        //Eger lastIndexOf() ile cumle aratirsaniz, son cumlenin ilk indexini verir.
        int lastIdxA = str.lastIndexOf("a");
        System.out.println(lastIdxA);

        String s = "Missisipi";
        int idxI = s.indexOf('i');//indexOf() hem String hem de char ile kullanilabilir
        System.out.println(idxI);//1

        int idxIss1 = s.indexOf("iss");//ilk gorunumun ilk characterin indexini verir
        System.out.println(idxIss1);

        int idxIss2 = s.lastIndexOf("iss");//son gorunumun ilk characterinin indexinin verir
        System.out.println(idxIss2);

        //Example 1: Bir String'deki tekrarsiz bir characterin tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz
        //           "Helloooo" ==> H-Tekrarsiz     e-Tekrarsiz     l-Tekrarli      e-Tekrarli

        String yeni = "Helloooo";
        int newidx1 = yeni.indexOf("H");
        int newidx11 = yeni.lastIndexOf("H");
        int newidx2 = yeni.indexOf("e");
        int newidx22 = yeni.indexOf("e");
        int newidx3 = yeni.indexOf("l");
        int newidx33 = yeni.lastIndexOf("l");
        int newidx4 = yeni.indexOf("o");
        int newidx44 = yeni.lastIndexOf("o");

        String sonuc = newidx1==newidx11 ? "Tekrarsiz" : "Tekrarli";
        String sonuc2 = newidx2==newidx22 ? "Tekrarsiz" : "Tekrarli";
        String sonuc3 = newidx3==newidx33 ? "Tekrarsiz" : "Tekrarli";
        String sonuc4 = newidx4==newidx44 ? "Tekrarsiz" : "Tekrarli";

        System.out.println("H: " + sonuc +
                "\n" + "e: " + sonuc2 +
                "\n" + "l: " + sonuc3 +
                "\n" + "o: " + sonuc4);

        //2.Yol
        String t = "Helloooo";
        char c = 'e';

        if (t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else {
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";

        //index() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra
        //istenen characterin ilk gorunumunun indexini return eder
        int sonucc = u.indexOf("a" , 5);
        System.out.println(sonucc);//14


        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi en bastan
        //bu indexe kadar olan characterleri bir kutu icine aliniz ve lastIndexOf methodunu sadece bu kutu
        //icindeki String icin kullaniniz
        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 5);
        System.out.println(e);

        String v = "";
        //isEmpty() method'u bir String'in bos olup elendigini kontrol eder
        //Eger Stringde hic character yoksa isEmpty() "true" return eder. Her hangi bir character varsa "false" return eder
        //length()==0 demek isTempty() true verir demektir
        //Bir String'in bos olup olmadigini anlamak icin "lentgh()==0" kullanmayin, "isEmpty()" kullanin
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        String x = "";
        //isBlank() hem bos String icin hem de sadece space iceren String'ler icin true return eder.
        boolean blankMi = x.isBlank();

        System.out.println(blankMi);//true

        //Example 2: Kullanicidan alinan isim mutlaka spaceten farkli en az 1 karakter icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String ilk = input.nextLine();

        if (ilk.isBlank()){
            System.out.println("Sana ismini gir");
        }else {
            System.out.println(ilk);
        }

    }

}
