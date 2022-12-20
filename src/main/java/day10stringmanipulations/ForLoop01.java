package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {

       //Example 1: Ekrana 5000 kere "Hi" yazdiriniz
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Tekrarli isler icin "loop" kullaniniz
        //Dort cesit "loop vardir; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //Example 2: Ekrana 5 kere "Hi" yazdiriniz.

        //      Baslangic degeri    Loop hangi sart altinda calisacak     Increment (arttirma) veya Decrement (Azaltma)
        for (  int i = 1                 ;      i<6                                 ;               i=i+1                            ) {
            System.out.print("Hi");
        }

        //Example 3: 4 den 7ye kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=4; i<8; i=i+1) {
            System.out.print(i);
        }

        //Example 4: 14den 5e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=14; i>4; i--) {
            System.out.print(i);
        }

        //Example 5: 14den 5e kadar ytum cift tam sayilari ekrana yazdiran kodu yaziniz

        //1.Yol:
        for (int i=14; i>4; i-=2) {
            System.out.print(i);
        }

        //2.Yol:
        for (int i=14; i>4; i-=2) {
            if (i%2==0) {
                System.out.print(i);
            }
        }

        //Example 6: 28den 157 e kadar tum tek sayilari ekrana yazdiran kodu yaziniz
        for (int i=28; i<158; i++) {
            if (i%2==1){
                System.out.print(i);
            }
        }

        //Example 7: "Java" String'ini J*a*v*a Stringine ceviren
        String str = "Java";
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + "*");
        }

        //Example 8: Size verilen Stringde tekrarsiz karakterleri ekrana yazdiriniz
        //"Hellooo Ali" ==> HeAi
        String str2 = "Hellooo Ali";
        for (int i=0; i< str2.length(); i++) {

            char c = str2.charAt(i);
            if (str2.indexOf(c)==str2.lastIndexOf(c)) {
                System.out.println(c);
            }

        }


    }
}
