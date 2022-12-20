package javapractice;

import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {

        /*     5) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A
        A A A A A
        A A A A A          */



        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }

        System.out.println();

         /*   6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A
        A A
        A A A
        A A A A            */

        for (int i = 1; i < 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("A ");
            }
            System.out.println();
        }

        System.out.println();

        /*
        Example 3: Asagidaki sekili cizen kodu yaziniz
        * * * *
        * * *
        * *
        *
         */
        for (int i = 1; i < 5; i++) {
            for (int k = 4; k >=i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}
