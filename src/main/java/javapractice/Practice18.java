package javapractice;

import java.util.Scanner;

public class Practice18 {

    public static void main(String[] args) {

        /*
    Kullanicidan bir kelime isteyiniz
    alinan kelimenin karakter dizisinin her harfi ve bu harfin karakter dizisi icindeki indexini birer satira yazdirin
     */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Bir kelime giriniz");
//        String kelime = input.nextLine();
//        System.out.println("Kelime\t\t" + "Index");
//
//        for (int i = 0; i<kelime.length();i++) {
//            System.out.println("  " + kelime.charAt(i) + "\t\t\t" + "  " + i);
//
//        }

        /*
    Kullanicidan alinan bir Stringin ilk ve son harfini yine kullanicidan alinan sayi kadar tekrarlayan kodu yaziniz
    ornek: elma 2 ==> eaea
     */
        Scanner input2 = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String word = input2.nextLine();
        System.out.println("Kelime kac kere tekrarlansin?");
        int num = input2.nextInt();

        String ilkSonHarf = word.substring(0,1)+word.substring(word.length()-1);
        System.out.println(ilkSonHarf);

        String cikti = "";

        for (int i = 1;i<num;i++){
            cikti+=ilkSonHarf;
        }
        System.out.println(cikti);

        //https://lms.techproeducation.com/mod/book/view.php?id=2091&chapterid=6734 = burdan devam





    }

}
