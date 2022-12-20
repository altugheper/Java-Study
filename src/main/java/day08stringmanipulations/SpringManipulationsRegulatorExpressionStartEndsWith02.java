package day08stringmanipulations;

public class SpringManipulationsRegulatorExpressionStartEndsWith02 {
    public static void main(String[] args) {

        //Example 1: Bir Stringdeki space haric kac tane karakter kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti."

        String str = "Ali okula gitti.";

        //replace() method'u bir Stringdeki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir
        int num = str.replace(" ", "").length();
        System.out.println(num);

        //Example 2: Bir Stringdeki tum 'a' harflerini 'A'ya ceviriniz.
        String s = "Ankara'nin tasina gozlerimin yasina bak.";
        String buyukA = s.replace("a", "A");
        System.out.println(buyukA);

        //Example 3: Bir Stringdeki tum "kara" kelimesinin yerine "*" koyunuz
        String t = "Kara kara dusunme Ankara";
        String kara = t.replace("kara", "*");
        System.out.println(kara);//Kara * dusunme An*

        //Example 4: Bir Stringdeki tum sayilari "*"a ceviriniz
        //           "AC202117004 ==> AC*******

        String stdId = "AC202117004";

        String yenistdID = stdId.replaceAll("[0-9]", "*");

        System.out.println(yenistdID);

        /*
        Bir grup data'yi ifade eden kod'lara "Regex" denir.
        "Regex" Regular Expression'in kisaltilmis halidir.

        1)Tum rakamlar: [0-9]
        2)Tum kucuk harfler: [a-z]
        3)Tum buyuk harfler: [A-Z]
        4)Tum harfler: [a-zA-Z]
        5)Sesli harfler: [aeiouAEIOU]
        6)Space: [ ]
        7)Tum rakamlar ve tum harfler: [0-9a-zA-Z]
        8)Tum noktalama isaretleri: \\p{Punct}

        1)Rakamlar haric tum karakterler: [^0-9]
        2)Kucuk harfler haric tum karakterler: [^a-z]
        3)Buyuk harfler haric tum karakterler: [^A-Z]
        4)Tum harfler haric tum karakter: [^a-zA-Z]
        5)Space haric [^ ]
        6)Noktalama isaretleri haric: [^\\p{Punct}]
         */

        //Example 5: Verilen bir Stringde kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        //           tum karakterlerin sayisini bulan kodu yaziniz

        String u = "Ali 13 yasinda, dersem inanma!...";

        int sonuc = u.
                replaceAll("[0-9]","").
                replace(" ","").
                replaceAll("\\p{Punct}","").
                length();
        System.out.println(sonuc);

        //Example 6: Bir password'un gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az bir buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        String pwd = "B78cd? K!m";

        //i)Space haric en az sekiz karakter
        boolean first = pwd.replace(" ", "").length()>7;

        //ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;

        //iv)En az bir buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        //v)En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if (pwdGecerli) {
            System.out.println("Password'unuz gecerli");
        }else {
            System.out.println("Password'unuz gecerli degildir");
        }

        //Example 7: Bir Stringdeki noktalama isaretleri haric karakter sayisini gosteren kodu yaziniz

        String cumle = "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";

        int number = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);

        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //           aksi halde "Normal" yazdirin

        String v = "Kalex";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        Object result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);

    }
}
