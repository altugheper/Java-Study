package javapractice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name of a day");
        String day = input.next();

        char b = day.charAt(1);
        char c = day.charAt(3);
        char d = day.charAt(5);

        System.out.println("" + b + c + d);

    }
}
