package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*
        Kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz
        1 = Pazar
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Gun sayisi giriniz");
        byte dayNum = input.nextByte();

        //1. Yol: if ile cozunuz
        if (dayNum == 1) {
            System.out.println("Pazar");
        }else if (dayNum == 2) {
            System.out.println("Pazartesi");
        }else if (dayNum == 3) {
            System.out.println("Sali");
        }else if (dayNum == 4) {
            System.out.println("Carsamba");
        }else if (dayNum == 5) {
            System.out.println("Persembe");
        }else if (dayNum == 6) {
            System.out.println("Cuma");
        }else if (dayNum == 7) {
            System.out.println("Cumartesi");
        }else if (dayNum == 8) {
            System.out.println("Pazar");
        }else {
            System.out.println("Gecerli gun sayisi giriniz...");
        }

        //2.Yol: switch ile cozunuz
        switch (dayNum) {

            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("Carsamba");
                break;
            case 5:
                System.out.println("Persembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli gun sayisi giriniz...");
        }

    }
}
