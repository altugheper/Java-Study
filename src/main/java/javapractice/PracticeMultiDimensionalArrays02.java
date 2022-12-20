package javapractice;

import java.util.Arrays;

public class PracticeMultiDimensionalArrays02 {
    public static void main(String[] args) {

        //Bir multidimensional arrayi normal arraye ceviren kodu yaziniz
        //{ {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}

        int arr[][] = { {2, 5, 1}, {32, 75} };
        int sum = 0;

        for (int[] w : arr){
            sum += w.length;
        }
        System.out.println(sum);

        int brr[] = new int[sum];
        System.out.println(Arrays.toString(brr));
        int idx = 0;

        for (int[] w : arr){
            for (int k : w){
                brr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));

        //Bir multidimensional Arraydeki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz
        int crr[][] = new int[2][2];
        crr[0][0] = -20;
        crr[0][1] = 60;

        crr[1][0] = 520;
        crr[1][1] = 5;

        int maxElement = crr[0][0];
        int minElement = crr[0][0];

        for (int[] w : crr){
            for (int k : w){
                maxElement = Math.max(maxElement,k);
                minElement = Math.min(minElement,k);
            }
        }
        int sum3 = maxElement+minElement;
        System.out.println(sum3);

    }
}
