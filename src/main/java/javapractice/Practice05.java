package javapractice;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        //Isim ilk harf - Soyisim son harf
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name and surname");
        String name = input.nextLine();

        //1. Yol:
        //Finding string length
        int n = name.length();
        // First character of a string (with substring)
        String ilk = name.substring(0,1);
        // Last character of a string (with char)
        char son = name.charAt(n - 1);
        System.out.println(ilk + son);


    }
}
