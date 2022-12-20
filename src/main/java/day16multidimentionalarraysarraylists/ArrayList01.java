package day16multidimentionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        /*
        ArrayListler ayni data typeina sahip birden fazla datayi depolamak icin kullanilir
        Array ile ArrayListin farki nedir? INTERVIEW SORUSU
        1) Array olustururken Arrayin icine kac tane eleman koymamiz gerektigini soylemeliyiz, ve soyledigimiz eleman sayisindan fazla eleman koyamayiz
           Arrayler eleman sayisinda "fixed" dirler.

           ArrayListleri olustururken eleman sayisi soylemeye gerek yok. Cunku ArrayListler eleman sayisinda "flexible"dirlar

        2) Arraylerin icine "Primitive" ve "Reference"lar konabilir
           ArrayListlerin icine ise sadece "Non-Primitive"ler konulur.
        3) Arrayler super fasttir. Arrayler memoryi cok az kullanir.
        Note: Eleman sayisi kesin belli olan, coklu datalari depolamak icin Array kullanin.
              Ama eleman sayisi degisken olan coklu datalar icin Arraylist kullanin.
         */

        //ArrayList nasil olusturulur?
        //1.Yol:
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol:
        ArrayList<Integer> heights = new ArrayList<>();
        //3.Yol
        List<Integer> nums = new ArrayList<>();

        //ArrayListler nasil yazdirilir?
        System.out.println(nums);// []

        //ArrayListlere nasil eleman eklenir?
        //add() methodu her zaman elemani en sona ekler
        //(insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);// [21, 18, 20]

        nums.add(1, 50);
        System.out.println(nums);// [21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);// [21, 50, 18, 20, 23, 185]

        nums.addAll(2, prices);
        System.out.println(nums);// [21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayListlerin eleman sayisi nasil bulur?
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);//8

        //ArrayListlerde herhangi bir eleman nasil secilir?
        //get() istenen bir indexteki elemani verir
        int eleman1 = nums.get(3);
        System.out.println(eleman1);// 185

        //ArrayListin bos olup olmadigini nasil anlariz?
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);// false

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);// true

        //ArrayListde bir eleman nasil degistirilir?
        nums.set(3, 200);
        System.out.println(nums);// [21, 50, 23, 200, 18, 20, 23, 185]

        //Example 1: nums ArrayListindeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz

        for (int w : nums){
            if (w%2!=0) {
                nums.set(nums.indexOf(w), w+11);
            }
        }

        System.out.println(nums);// [32, 50, 34, 200, 18, 20, 34, 196]

        //remove()un icine tamsayi koyarsaniz java onu index olarak kabul eder

        //Example 2: ArrayListden 200 elemaninin ilk gorunumunu siliniz
        //Note: Tum tamsayilar Java icin aksi soylenmedikce Primitivedir. Yani int dir
        //Note 2: Primitiveler ArrayListlerin elemani olamaz. Cunku ArrayListler Nonprimitive depolarlar.
        //Note 3: Primitive i Wrapper class a cevirirseniz, non primitive olur ve non primitiveler ArrayListlerin elemani olur, index olamaz
        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums);// [32, 50, 18, 20, 34, 196]



    }
}
