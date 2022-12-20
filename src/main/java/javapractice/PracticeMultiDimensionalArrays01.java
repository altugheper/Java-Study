package javapractice;

import java.util.Arrays;

public class PracticeMultiDimensionalArrays01 {
    public static void main(String[] args) {

        //Example 1: String bir Multidimensional Array olusturunuz.
        //           Elemanlari ekleyiniz
        //           Toplam eleman sayisini ekrana yazdiran kodu yaziniz

        String arr[][] = new String[2][2];
        arr[0][0] = "Altug";
        arr[0][1] = "Karolina";

        arr[1][0] = "Gomez";
        arr[1][1] = "Pinki";

        System.out.println(Arrays.deepToString(arr));

        int sum = 0;
        for (String[] w : arr) {
           sum += w.length;
        }
        System.out.println(sum);

        //Bir String multidimensional Arrayde icinde "a" olan elemanlari console a yazdiriniz
        String brr[][] = new String[2][2];
        brr[0][0] = "Altug";
        brr[0][1] = "Karolina";

        brr[1][0] = "Gomez";
        brr[1][1] = "Pinki";

        for (String[] s : brr) {
            for (String k : s) {
                if (k.contains("a") || k.contains("A")) {
                    System.out.println(k);
                }
            }
        }

        //Bir tane integer multidimensional array olusturunuz
        //Bu arraydeki tum sayilarin toplamini veren kodu yaziniz
        int crr[][] = new int[2][2];
        crr[0][0] = 5;
        crr[0][1] = 6;
        crr[1][0] = 7;
        crr[1][1] = 8;
        System.out.println(Arrays.deepToString(crr));
        int sum1 = 0;


        for (int[] k : crr){
            for (int a : k){
            sum1 += a;
            }
        }
        System.out.println(sum1);





    }
}
