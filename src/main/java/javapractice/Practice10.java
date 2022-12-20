package javapractice;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 4 digit number");
        int digit = input.nextInt();
        int birler = digit%10;
        int binler = ((digit/10)/10)/10;

        int sonuc = birler + binler;
        System.out.println(sonuc);

        /*
        Example 1: Type java code by using nested if statement,
        If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
        “Perfect even number” otherwise, the output will be “Good even number.”
        If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
        “Perfect odd number” otherwise, the output will be “Good odd number.”
         */

        int num = 10;
        if (num%2==0) {
            if (num%3==0) {
                System.out.println("Perfect even number");
            }else {
                System.out.println("Good even number");
            }

        }else if (num%2==1) {
            if (num%3==0) {
                System.out.println("Perfect odd number");
            }else {
                System.out.println("Good odd number");
            }
        }else System.out.println("You did not enter a number");

        /*
        Type java code by using nested if() statement.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
         */

        int year = 2000;
        if (year%100==0) {
            if (year%400==0) {
                System.out.println("leap year");
            }else System.out.println("not leap year");


        }else if (year%4==0) {
            System.out.println("leap year");
        }else System.out.println("not leap year");




    }
}
