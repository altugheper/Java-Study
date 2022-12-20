package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Arrays'lerin icine sadece "primitive data type"lari yerlestirilebilir.
        //Stringler Heap memoryde stocklanir. Arraylerin icine String koyarken Java Stringlerin tamamini degil, onlarin
        //Referencelarini Arraylerin icine koyar. Yani Arraylerin icinde String referencelari var, kendileri yok.
        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";

        System.out.println(Arrays.toString(str));//[Java, did, surprise you]

        //String bir Array olusturunuz ve "Tom" ve "Tom"dan onceki tum elemanlari ekrana yazdiriniz
        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w : arr) {
            System.out.print(w + " ");
            if (w.equals("Tom")) {
                break;
            }
        }

        System.out.println();

        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        for (String w : arr) {
            if (w.equals("Jane") || w.equals("Tom")) {
                continue;
            }
            System.out.print(w + " ");
        }

        System.out.println();

        String brr[] = {"tom", "jane", "ali", "veli"};
        for (String w : brr) {
            if (!w.equals("tom") && !w.equals("jane")) {
                System.out.print(w + " ");
            }
        }

        System.out.println();

        //Example 3: Kullanici ile beraber bir Array olusturunuz
        //           Bir ogretmenin sinifindaki ogrencilerin isimlerini application'a yuklenmesini saglayan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numStudent = input.nextInt();

        String names [] = new String[numStudent];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz, devam etmek icin herhangi bir tusa basiniz");

        for (int i = 1; i<=numStudent; i++) {

            System.out.println("Lutfen " + i + ". ogrenci ismini giriniz");


            String stdName = input.next();

            if (stdName.equalsIgnoreCase("Q")){
                break;
            }

            names[i-1] = stdName;

        }

        System.out.println("Girdiginiz ogrenci isimleri: " + Arrays.toString(names));

        }





    }
