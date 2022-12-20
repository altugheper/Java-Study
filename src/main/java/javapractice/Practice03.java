package javapractice;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = input.next().charAt(0);

        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
            System.out.println("This is an alphabet");
        }else {
            System.out.println("This is not an alphabet");
        }
    //--------------------------------------------------------
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the name of the day of a week");
        String day = input2.nextLine();

        boolean weekday = day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") ||
                day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday") ||
                day.equalsIgnoreCase("Friday");
        boolean weekend = day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday");

        if (weekday) {
            System.out.println("The day is week day");
        }else if (weekend) {
            System.out.println("The day is weekend");
        }else {
            System.out.println("You have entered a wrong day");
        }
    //--------------------------------------------------------
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age0 = input3.nextByte();

        if (age0>=18 && age0<=65) {
            System.out.println("You should work");
        }else {
            System.out.println("No need to work");
        }
    //--------------------------------------------------------

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = input4.nextByte();
        System.out.println("Enter your gender");
        String sex = input4.next();

        if (age>65 && sex.equalsIgnoreCase("Man")) {
            System.out.println("Hey man you retired");
        }else {
            System.out.println("No need to work");
        }
    //--------------------------------------------------------















    }
}
