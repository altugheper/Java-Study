package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {

        /*
        1) StringBuilder Java'da bir Class'dir
        2) "StringBuilder", String olusturmaya yarar
        3) "String" Class varken neden "StringBuilder"a ihtiyac duyariz?
           Cunku "String" Class "Immutable Class"dir. Ama biz bazen "Mutable" String'lere ihtiyac duyariz
           "String Builder" bize "Mutable String" verir.
        4) "Immutable Class"larde varolan deger degistirilemez. Siz varolan bir degeri degistirmek istediginizde
           i) Memory'de yeni bir variable yeni degerle olusturulur
           ii) Eski variable'in pointer'i yeni variable'a dondurulur
           iii) Eger bir variable hicbir pointer gostermiyorsa o variable "Garbage Collector" tarafindan silinir

           "Mutable Class"larda var olan deger degistirilebilir. Orjinal deger korunmaz.

         5) "String Class"larin "immutable" yapisi "security" icin onemlidir
            Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni degere sahip
            String'lerin bu container'i kullanmasini temin eder. Bu memory'i korumak icin iyidir.
            Ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin etkilenmesi tehlikesi vardir
            Bu tehlikeden kurtulmak icin Java String'leri "immutable(degismez)" yapmistir.
            Fakat herhangi bir variable'in degerini degistirmek icin Java bir yol bulmustur.
            - Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
            yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur
         */

        String str = "Java";
        str = "Super Java";


        //StringBuilder nasil olusturulur?
        //1. Yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1); //Java

        //2.Yol:
        StringBuilder strb2 = new StringBuilder();
        //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2); //Java is easy!!!

        //Yol b:
        strb2.append(" Learn").append(" Java earn").append(" money.");//Method Chain
        System.out.println(strb2);

        //StringBuilder'larda character sayisi nasil bulunur? ==> length() method'u ile bulunur
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numofChar = strb3.length();
        System.out.println(numofChar); //3

        //Capacity asimlarinda capacity var olanin iki katinin iki fazlasina cikar
        int capacity = strb3.capacity();
        System.out.println(capacity); //34 ==> 16*2 + 2

        strb3.append("mmmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2); //70 ==> 34*2 + 2

        //setCharAt(2, 'r'); ==> Index 2'deki character'i "r" ye cevirir
        strb3.setCharAt(2, 'r');
        System.out.println(strb3); //Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmm

        //delete(3, 18) ==> Index 3(dahil) den index 18(haric) e kadar tum characterleri siler
        strb3.delete(3, 18);
        System.out.println(strb3); //Carmmmmmmmmmmmmmmmmmmmmm

        //reverse() methodu StringBuilderi ters cevirir. Ali ==> ilA
        //"mutable"larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir
        strb3.reverse();
        System.out.println(strb3); //mmmmmmmmmmmmmmmmmmmmmraC

        //"Immutable"larda orjinal degeri degistirmek icin methodu kullanmak yeterli olmaz bir de "atama islemi" yapmalisiniz
        String abc = "Java";
        abc = abc.replace("a","i");
        System.out.println(abc); //Java

        //toString() methodu StringBuilderlari Stringe cevirir
        String stringstrb3 = strb3.toString();
        System.out.println(stringstrb3); //mmmmmmmmmmmmmmmmmmmmmraC

        //Stringden de StringBuildera asagidaki gibi donebilirsiniz
        StringBuilder strb4 = new StringBuilder(stringstrb3);
        System.out.println(strb4); //mmmmmmmmmmmmmmmmmmmmmraC

        //insert(3, "XXXX"); 3. characterden sonra "XXXX" leri koyar
        strb4.insert(3, "XXXX");
        System.out.println(strb4); //mmmXXXXmmmmmmmmmmmmmmmmmmraC

        //insert(3, "KLMOPQRSTU", 5, 8) ==> character'den sonra, "KLMOPQRSTU" Stringinin index 5, 6, 7deki characterlerini yerlestirir
        strb4.insert(3, "KLMOPQRSTU", 5, 8);
        System.out.println(strb4); //mmmQRSXXXXmmmmmmmmmmmmmmmmmmraC

        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");

        // a.compareTo(b); methodu i) StringBuilderlar tamamiyla ayni ise 0 verir
        //                         ii)a alfabetik sirada bden sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                         iii) a alfabetik sirada b'den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
        int sonuc = a.compareTo(b);
        System.out.println(sonuc); //0

    }
}
