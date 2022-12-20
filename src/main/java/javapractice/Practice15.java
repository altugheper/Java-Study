package javapractice;

import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {

        /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
         */

        int year = 2004;
        String leapYear = (year%100==0) ? (year%400==0 ? "Leap Year" : "Not leap year")
                : (year%4==0 ? "Leap year" : "Not leap year");
        System.out.println(leapYear);

        /*
        If the user pressed 1, 2, 3 the program will print the number that is pressed;
        otherwise, program will print "Not allowed
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1-3");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Not Allowed");
        }

        /*
        Write a Java program user will choose answer among A, B, C, or D.
        If the answer is true, output will be “True.” If the answer is false, output will be
        “False”. Correct answer is ‘C’ for the multiple option question.
         */

        Scanner input2 = new Scanner(System.in);
        System.out.println("Type a letter between A-D");
        char a = input2.next().charAt(0);

        switch (a) {
            case 'A':
                System.out.println("False");
                break;
            case 'B':
                System.out.println("False");
                break;
            case 'C':
                System.out.println("True");
                break;
            case 'D':
                System.out.println("False");
                break;
        }



    }
}
