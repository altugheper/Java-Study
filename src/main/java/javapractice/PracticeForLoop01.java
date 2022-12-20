package javapractice;

public class PracticeForLoop01 {
    public static void main(String[] args) {

        //Example 2: Ekrana 5 kere "Hi" yazdiriniz.

        for (int i = 1; i<6 ; i++) {
            System.out.print("Hi ");
        }

        System.out.println();

        //Example 3: 4 den 7ye kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=3; i<8; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 4: 14den 5e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=14; i>4; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 5: 14den 5e kadar tum cift tam sayilari ekrana yazdiran kodu yaziniz

        for (int i=14; i>4; i--) {
         if (i%2==0) {
             System.out.print(i + " ");
         }
        }

        System.out.println();

        //Example 6: 28den 157 e kadar tum tek sayilari ekrana yazdiran kodu yaziniz
        for (int i=28; i<158; i++) {
            if (i%2==1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 7: "Java" String'ini J*a*v*a Stringine ceviren kodu yaziniz
        String str = "Java";
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + "*");
        }

        System.out.println();

        //Example 8: Size verilen Stringde tekrarsiz karakterleri ekrana yazdiriniz
        //"Hellooo Ali" ==> HeAi
        String str2 = "Hellooo Ali";
        for (int i=0; i<str2.length(); i++) {
            char c = str2.charAt(i);
            if (str2.indexOf(c)==str2.lastIndexOf(c)) {
                System.out.print(c);
            }
            }

        System.out.println();

        //Example 9: Size verilen bir Stringi ters ceviren kodu yaziniz
        String str3 = "Karo";
        String reverse = "";
        for (int i=str3.length()-1; i>=0; i--) {
            char s = str3.charAt(i);
            reverse = reverse + s;
            System.out.print(s);
        }

        System.out.println();

        //Example 3: Size verilen bir Stringdeki 'm'den onceki karakterleri yazdiriniz
        // Luxemburg ==> Luxe
        String str4 = "Luxemburg";
        for (int i=0; i<=3; i++) {
            char c = str4.charAt(i);
            System.out.println(c);
            }
        }




        }








