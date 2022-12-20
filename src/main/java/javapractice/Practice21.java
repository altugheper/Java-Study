package javapractice;

import java.util.Scanner;

public class Practice21 {

    public static void main(String[] args) {

        //kullanicidan ad soyad al ilk harfleri yazdir

        Scanner input = new Scanner(System.in);
        System.out.println("Isminizi giriniz: ");
        char name = input.next().charAt(0);
        System.out.println("Soyisminizi giriniz : ");
        char surname = input.next().charAt(0);

        System.out.println("" + name + surname);




    }

}
