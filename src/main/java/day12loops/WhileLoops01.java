package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {

        //Example 1: 3 den 10 a kadar tamsayilari ekrana ayni satirda ekrana yazdiriniz

        //1.Yol:
        for (int i = 3; i<11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Yol:
        int i=3;
        while (i<11) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int k=17;
        while (k>3) {
            if (k%2==0) {
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();

        //Example 3: 12den 14e kadar sayilarin toplamini veren kodu yaziniz
        int sum = 0;
        int z=12;
        while (z<15) {
            sum = sum + z;
            z++;
        }
        System.out.println(sum);

        //Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen en az iki basamakli bir sayi giriniz");
        int num = input.nextInt();

        if (num>9) {
            int sonuc = 0;
            while (num>0) {
                sonuc = sonuc+num%10;
                num=num/10;
            }
            System.out.println(sonuc);
        }else System.out.println("Yanlis bir deger girdiniz");

        //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        //           3 ==> 3*1=3 3*2=6 3*3=9
        Scanner input2 = new Scanner(System.in);
        System.out.println("Carpim tablosu icin ekrana sayi giriniz");
        int num2 = input2.nextInt();

        int n = 1;
        while (n<11) {
            System.out.println(num2 + "x" + n + "=" + num2*n);

            n++;

        }
    }
}
