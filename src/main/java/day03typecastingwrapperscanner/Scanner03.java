package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan bir diktorgenin en ve boyunu alip alan ve cevresini hesaplayan kodu giriniz

        Scanner input = new Scanner(System.in);

        System.out.println("Diktortgenin enini giriniz");
        int en = input.nextInt();

        System.out.println("Diktortgenin boyunu giriniz");
        int boy = input.nextInt();

        System.out.println("Alan " + en*boy);
        System.out.println("Cevre " + 2*(en+boy));



    }
}
