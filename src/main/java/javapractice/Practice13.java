package javapractice;

import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args) {

        /*
        Type java code by using ternary.
        Write a program to print absolute value of an integer entered by user.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = input.nextInt();

        int result = (num>0) ? (num) : (Math.abs(num));
        System.out.println(result);

        /*
        Type java code by using ternary.
        Take values of length and width of a rectangle from user and check if it is square or not.
         */

        int width = 4;
        int height = 4;
        String result2 = (width==height) ? ("it is square") : ("it is not square");

        System.out.println(result2);

    }
}
