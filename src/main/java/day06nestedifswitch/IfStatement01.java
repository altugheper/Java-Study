package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Soru: Type a code, get age from user and decide which stage on it
        //0 - 4 -baby
        //5 - 12 -child
        //13 - 20 -teenage
        //21 - 30 -adult
        //else (not expected age)

        Scanner input = new Scanner(System.in);
        System.out.println("Please submit your age");
        byte age = input.nextByte();

        if (age<0) {
            System.out.println("Please submit an applicable age");
        }else if (age<=4) {
            System.out.println("Baby");
        }else if (age<=12) {
            System.out.println("Child");
        }else if (age<=20) {
            System.out.println("Teenage");
        }else if (age<=30) {
            System.out.println("Adult");
        }else {
            System.out.println("Not expected age");
        }

        //Boundary Value Analyze Test (BVA)
        //Sinir degerlerini test etmeye denir.

    }

}
