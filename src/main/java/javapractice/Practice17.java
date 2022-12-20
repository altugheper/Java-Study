package javapractice;

import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {

        //Kullanicidan baslangic, bitis ve artis miktarini alarak
        //aradaki tum sayilari aralarina virgul koyarak yazin

//        Scanner input = new Scanner(System.in);
//        System.out.println("Baslangic degeri giriniz");
//        int first = input.nextInt();
//        System.out.println("Bitis degeri giriniz");
//        int last = input.nextInt();
//        System.out.println("Artis miktarini giriniz");
//        int artis = input.nextInt();
//
//        for (int i = first; i<last;i+=artis){
//            System.out.print(i+",");
//        }

        /*
        Interview Question
        Kullanicidan 100'den kucuk bir tamsayi isteyin
        1'den baslayarak girilen sayiya kadar tum sayilari yazdirin
        Ancak;
        - Sayi 3'un kati ise sayi yerine "Java" yazdirin
        - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin
        - Sayi hem 3un hem 5in kati ise sayi yerine "** Java Guzeldir **" yazdirin
         */

        Scanner input2 = new Scanner(System.in);
        System.out.println("100'den kucuk bir sayi giriniz");
        int num = input2.nextInt();

        for (int k = 1; k<=num; k++){
            if (k%3==0 && k%5==0){
                System.out.print(" ** Java Guzeldir ** ");
            }else if (k%3==0){
                System.out.print(" Java ");
            }else if (k%5==0){
                System.out.print(" Guzeldir ");
            }else System.out.print(k + " ");
        }

        System.out.println();

        /*
        Kullanicidan bir cumle ve bir harf alin,
        Cumlede verilen harfin kac kere kullanildigini bulup, yaziniz
        ORNEK:
        INPUT : Cumle: Java ogrenmek cok guzel. ==>Harf : e
        OUTPUT: Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String sentence = input.nextLine();
        System.out.println("Bir harf giriniz");
        char ch = input.next().toLowerCase().charAt(0);
        int counter = 0;

        for (int i = 0; i<sentence.length();i++){
            if (sentence.charAt(i)==ch){
                counter++;
            }
        }
        System.out.println(counter);



    }
}
