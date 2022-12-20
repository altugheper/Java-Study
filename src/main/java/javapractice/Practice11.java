package javapractice;

import java.util.Locale;
import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {

//        Type java code by using nested if() statement.
//                Ask user to enter a password
//        If the initial of the password is uppercase then check if it is ‘A’ or not.
//        If it is ‘A’ the output will be “Valid Password”
//        otherwise the output will be “Invalid Password”
//        For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid
//        If the initial of the password is lowercase then check if it is ‘z’ or not.
//        If it is ‘z’ the output will be “Valid Password”
//        otherwise the output will be “Invalid Password”
//        For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password");
        String pwd = input.next();
        char ilkHarf = pwd.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z') {
            if (pwd.startsWith("A")) {
                System.out.println("Valid Password");
            }else {
                System.out.println("Invalid Password");
            }
        }else if (ilkHarf>='a' && ilkHarf<='z') {
            if (pwd.startsWith("z")) {
                System.out.println("Valid Password");
            }else {
                System.out.println("Invalid Password");
            }
        }

    }
}
