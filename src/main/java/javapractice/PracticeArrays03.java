package javapractice;

import java.util.Arrays;
import java.util.Comparator;

public class PracticeArrays03 {
    public static void main(String[] args) {

        /*  1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
                Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10*/

        int arr[] = {12, 5, 8};
        Arrays.sort(arr);

        int max = arr[arr.length-1];
        int min = arr[0];

        for (int w : arr) {
            if (w<max && w>min) {
                System.out.println(w);
            }
        }

        /*  2) String' lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli  */

        String brr[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        Arrays.sort(brr, Comparator.comparingInt(String::length));//[Mark, Veli, Kemal, Angie, Jonathan]

        String min1 = brr[0];
        String min2 = brr[1];
        System.out.println(min1 + " " + min2);


        /*   3) Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        bulunuz.
                Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2  */

        int crr[] = {-12, 18, -5, 23, -2};
        Arrays.sort(crr);
        int minPositive = crr[crr.length-1];
        int maxNegative = crr[0];

        for (int w : crr) {
            if (w<0) {
                maxNegative = Math.max(maxNegative, w);
            }
            if (w>0) {
                minPositive = Math.min(minPositive, w);
            }
        }
        System.out.println(maxNegative + " " + minPositive);//-2, 18
















    }
}
