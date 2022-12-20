package javapractice;

import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {

        /*
        Type java code by using ternary and if-else, ask user to enter an integer,
        if the integer is even,
        the output will be “The integer is even”. If the integer is odd,
        the output will be “The integer is odd”.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = input.nextInt();


        String result = (num%2==0) ? ("The number is even") : ("The number is odd");

        System.out.println(result);

        /*
        Type java code by using ternary and if-else. Ask user to enter two integers
        Write a program to print the minimum one on the console.
         */

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the first integer");
        int int1 = input2.nextInt();
        System.out.println("Please enter the second integer");
        int int2 = input2.nextInt();


//        if (int1>int2) {
//            System.out.println(int2);
//        }else if (int2>int1) {
//            System.out.println(int1);
//        }else System.out.println("The numbers are even");

        int result2 = (int1>int2) ? (int2) : (int1);
        System.out.println(result2);



    }
}
