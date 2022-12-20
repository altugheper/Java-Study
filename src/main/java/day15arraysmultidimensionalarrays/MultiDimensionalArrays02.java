package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {

        //MultidimensionalArray kisa yoldan nasil olusturulur?
        char arr[][] = {{'a', 'b'}, {'C', 'D', 'E'}, {'?'}};

        System.out.println(Arrays.deepToString(arr));

        //Bir String multidimensional Arrayde icinde "a" olan elemanlari console a yazdiriniz


        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w: brr) {
            for (String k : w){
                if (k.contains("a")) {
                    System.out.println(k + " ");
                }

            }
        }

    }
}
