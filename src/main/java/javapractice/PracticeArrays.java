package javapractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrays {
    public static void main(String[] args) {

        //Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
        int[] brr = {12, 23, 0, 1, 4, -20};
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));

        int first = brr[0];
        int last = brr[brr.length - 1];
        System.out.print((first + last));



        System.out.println();
        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int w : arr ) {
            sum = sum + w;
            w++;
        }
        System.out.println(sum);

        //Example 3: String bir array olusturunuz
        //Bu Array'e 5 tane isim yerlestiriniz
        //Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

        String[] str1 = new String[5];
        str1[0] = "Altug";
        str1[1] = "Karolina";
        str1[2] = "Pinki";
        str1[3] = "Gomez";
        str1[4] = "Ali";
        int sum1 = 0;

        for (String s : str1) {
            sum1 = sum1 + s.length();
        }
        System.out.println(sum1);

        //Example 4: Char bir array olusturunuz
        //Bu array'e 5 eleman ekleyiniz
        //Bu array;deki sadece buyk harfleri ekrana yazdiriniz

        char[] str2 = new char[5];
        str2[0] = 'a';
        str2[1] = 'b';
        str2[2] = 'c';
        str2[3] = 'D';
        str2[4] = 'E';

        for (char w : str2) {
            if (w>='A' && w<='Z') {
                System.out.print(w + " ");
            }

        }

        System.out.println();

        //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz

        String str3[] = {"Altug", "Karolina", "Gomez", "Tom", "Ali", "Veli"};

        for (String w : str3) {
            System.out.print(w + " ");
            if (w.equals("Tom")) {
                break;
            }
        }
        System.out.println();


        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        String crr[] = {"Altug", "Karolina", "Jane", "Gomez", "Pinki", "Tom"};

        for (String w : crr) {
            if (w.equals("Jane") || w.equals("Tom")){
                continue;
            }
            System.out.print(w + " ");
        }

        System.out.println();

        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //Kullanicidan kac kisi girecegini sor
        //Arrayi olustur
        //
        Scanner input = new Scanner(System.in);
        System.out.println("Gireceginiz ogrenci sayisini belirtiniz: ");
        int numOfStd = input.nextInt();
        String drr[] = new String[numOfStd];

        System.out.println("Process'i durdurmak icin 'Q'ya basiniz");

        for (int i=1; i<=numOfStd; i++ ) {
            System.out.println(i + ". ogrencinin ismini giriniz");
            String stdName = input.next();


            if (stdName.equalsIgnoreCase("Q")) {
                break;
            }

            drr[i-1] = stdName;
        }

        System.out.print("Sisteme girdiginiz ogrenciler: " + Arrays.toString(drr));










    }
}
