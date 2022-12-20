package javapractice;

import java.util.Scanner;

public class Practice02 {

        public static void main (String[]args){

        int numA = 2;
        int numB = 3;
        String str1 = "Study";
        String str2 = "Hard";
        System.out.println(str1 + " " + str2);
        System.out.println((numA+numB) + " " + str1);
        System.out.println(str2 + numA + numB);
        System.out.println(str2 + (numB-numA));
        System.out.println((numA+numB+1) + "" + (numB-numA) + str1 + (numA-numB));

        Scanner input = new Scanner(System.in);
        System.out.println("Type in an integer");
        int num = input.nextInt();

        if (num%2==0) {
            System.out.println("The integer is even");
        }else {
            System.out.println("The integer is odd");
        }

            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter an initial of a day");
            String initial = input2.next();


            //1. Yol if-else
        if (initial.equalsIgnoreCase("s")) {
            System.out.println("Saturday or Sunday");
        }else if (initial.equalsIgnoreCase("m")) {
            System.out.println("Monday");
        }else if (initial.equalsIgnoreCase("t")) {
            System.out.println("Tuesday or Thursday");
        }else if (initial.equalsIgnoreCase("w")) {
            System.out.println("Wednesday");
        }else if (initial.equalsIgnoreCase("f")){
            System.out.println("Friday");
        }else {
            System.out.println("You entered a wrong initial");
        }

            //2.Yol switch
            switch (initial.toLowerCase()) {
                case "s":
                    System.out.println("Saturday or Sunday");
                    break;
                case "m":
                    System.out.println("Monday");
                    break;
                case "t":
                    System.out.println("Tuesday or Thursday");
                    break;
                case "w":
                    System.out.println("Wednesday");
                    break;
                case "f":
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("You entered a wrong initial");
            }





        }

    }