package javapractice;

import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {

        /*
        Ask user to enter a String. If the String has 2 characters, output will be
“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        String result = (word.length()==2) ? ("It is valid for state abbreviations") :
                ("It is not valid for state abbreviations");
        System.out.println(result);

        /*
        Ask user to enter an integer. If the number has 3 digits, output will be
        “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
         */

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = input2.nextInt();

        String result2 = (num>99 && num<1000) ? ("This number has 3 digits.") :
                ("This number has no 3 digits.");
        System.out.println(result2);

        /*
        Ask user ta enter a number. If the number is less than 10 and greater
        than or equal to 0, calculate its cube. Otherwise, calculate its square.
         */

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num2 = input3.nextInt();

        int cal = (num2<10 || num2==0) ? (num2*num2*num2) : (num2*num2);
        System.out.println(cal);





    }
}
