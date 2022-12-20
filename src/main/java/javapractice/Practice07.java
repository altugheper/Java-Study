package javapractice;

import java.util.Scanner;

public class Practice07 {

    public static void main(String[] args) {

      /*  1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        ardışık tam sayı arasında boşluk bırakarak yazınız.*/

        for (int i = 120; i >= 11; i--) {
            if (i%4==0 && i%6==0) {
                System.out.print(i + "\t");
            }
        }

        System.out.println();

        /* 2) Bir String' de tekrarlanan karakterleri yazdırmak için kod yazınız.
                Örneğin; accessories ´ ces    */

        String str = "accessories";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                System.out.print(c);
            }
        }

        System.out.println();

        /*   3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        aynıysa, buna palindrom denir. Örneğin; "anna", "123321" palindromlardır.  */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        String space = "";
        for (int i = word.length()-1; i >= 0; i--) {
            char s = word.charAt(i);
            space = space + s;

        }
        if (word.equals(space)) {
            System.out.print("Palindrom sentence");
        }else System.out.print("Not palindrom sentence");

        System.out.println();

         /*  4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        Örnek; 223878,37   */

        String str1 = "223878,37";

        for (int i = 0; i < str1.length()-1; i++) {
            char c = str1.charAt(i);
            if (str1.indexOf(c)!=str1.lastIndexOf(c)) {
                System.out.print(c);
            }
        }







    }
}
