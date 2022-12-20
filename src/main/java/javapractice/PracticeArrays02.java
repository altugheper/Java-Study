package javapractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PracticeArrays02 {
    public static void main(String[] args) {

        //Example 4: Kullanicidan aldigin isimlerle bir market alisverisi aplikasyonu olustur ve sepete ekle
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the shopping list!");
        System.out.println("If you would like to exit, please enter 'F'");
        System.out.println("Please enter how many items you would like to add to your shopping list: ");
        int numItems = input.nextInt();

        String arr[] = new String[numItems];


        for (int i = 1; i<=numItems; i++) {
            System.out.println("Please enter number " + i + " item into the list");
            String nameOfitem = input.next();

            if (nameOfitem.equalsIgnoreCase("F")) {
                break;
            }

            arr[i-1] = nameOfitem;
        }
        System.out.println("Your Shopping list: " + Arrays.toString(arr));

        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]

        int brr[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[brr.length];
        int idx = 0;

        for (int i = 0; i<brr.length; i++) {
            if (brr[i]!=0) {
                yeni[idx] = brr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden
        // ve kac kere tekrarlandigini gosteren kodu yaziniz
        //           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
        //                             ==> Kullanici 6'yi sordu ==> 6 array'de yok

        int crr[] = {2, 1, 2, -3, 2};
        int eleman = 2;
        int counter = 0;


        for (int w : crr) {
            if (w==eleman) {
                counter++;
            }
        }
        if (counter>0) {
            System.out.println(eleman + " elemani " + counter + " tane var");
        }else System.out.println(eleman + " arrayde yok");

        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana." ==> calismayana
        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        sentence = sentence.replaceAll("\\p{Punct}", "");

        String words[] = sentence.split(" ");


        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);






    }
}
