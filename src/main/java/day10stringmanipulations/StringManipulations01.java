package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java kolaydir.";
        //startWith ("kola, 5) kodu ilk 5 karakter'den sonraki String'e bakar ve Stringin "kola" ile baslayip
        //baslamadigini kontrol eder. "kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
        boolean b = a.startsWith("va", 2);
        System.out.println(b);


        //replaceFirst() ("a", "*"); kod Stringdeki ilk "a" yi "*" e cevirir
        //replace("a", "*"); kod Stringdeki butun "a"lari "*"e cevirir
        String c = a.replaceFirst("a", "*");
        System.out.println(c);//J*ava kolaydir.


        //concat() methodu iki tane Stringi birbirine yapistirmaya yarar
        //"Concatenation" islemi iki turlu yapilabilir; i)+ ile ii)concat() ile
        //Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
        String d = c.concat(" Anladin mi?");
        System.out.println(d);//Java kolaydir. Anladin mi?


        String e = "    Tom Hanks   ";
        System.out.println(e);//"     Tom Hanks    "
        //trim() methodu bir String'in bas ve sonunda "space" karakterlerini siler, aradaki "space" karaklerlerine dokunmaz
        String f = e.trim();
        System.out.println(f);//"Tom Hanks"


        String h = "Java";
        String i = "Kava";
        //h.comparaTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        //Buyuk harf e duyarlidir
        //Buyuk harf kucuk harfe duyarli olmasini istemezseniz h.comparaToIgnoreCase(i); kullanabilirsiniz
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.
        int k = h.compareTo(i);
        System.out.println(k);

        //a.repeat(5); kodu "a" Stringini yan yana 5 kere yazar
        //repeat(0); empty String return eder
        //Java Document'e ulasmak icin Windows tusu + CTRL e basili tutun
        String n = a.repeat(3);
        System.out.println(n);



    }


}
