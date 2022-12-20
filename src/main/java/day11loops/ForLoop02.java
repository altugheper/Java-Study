package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        //Example 1: Bir Stringdeki "m" karakteri haric tum karakterleri yazdiriniz
        String str = "madam";
        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if (c!='m') {
                System.out.print(c);
        }

        }

        //2.Yol:
        for (int i=0; i<str.length();i++) {
            char c = str.charAt(i);
            if (c=='m') {
                continue;//Bosveeer!! ==> Loop'un icinde bazi degerler icin Loopun calismamasini isterseniz "continue" kullanin
            }
            System.out.println(c);
        }
        //Example 2: 1'den 100e kadar tum tam sayilari ekrana yazdiriniz. 6 ile bolunenler haric
        for (int i=1; i<101; i++) {
            if (i%6==0) {
                continue;
            }
            System.out.print(" " + i);
        }
        System.out.println();
        //Example 3: Size verilen bir Stringdeki 'm'den onceki karakterleri yazdiriniz
        // Luxemburg ==> Luxe

        String s = "Luxemburg";

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c=='m') {
                break;//eger if condition true olursa, kod yazmayi birakir
            }
            System.out.print(c);
        }

    }
}
