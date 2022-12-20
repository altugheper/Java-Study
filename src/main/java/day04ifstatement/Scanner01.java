package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    /*
    Kullanicidan ilk, orta, soy ismini, kimlik numarasini aliniz ve asagidaki formatta ekrana yazdiriniz
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        //1.Yol:
//        System.out.println("Enter your first name: ");
//        String firstName = input.next(); //next() methodu kullanicidan String datasi almak icin kullanilir
//
//        System.out.println("Enter your middle name: ");
//        String middleName = input.next();
//
//        System.out.println("Enter your last name: ");
//        String lastName = input.next();
//
//        System.out.println("Enter your national ID: ");
//        String ID = input.nextLine();
//
//        System.out.println("Your name: " + firstName + " " + middleName + " " + lastName);
//        System.out.println("Your national ID: " + ID);
//
//        //2.Yol:
//        System.out.println("Enter your First, Second, and Last name and national ID: ");
//        String first = input.next();
//        String middle = input.next();
//        String last = input.next();
//        String id = input.next();
//
//        System.out.println(first + " " + middle + " " + last);
//        System.out.println(id);

        /*
        next() ile nextLine() in farki nedir?
        next() methodu kullanicidan gelen String'in sadece ilk kelimesini alir
        nextLine() methodu kullanicidan gelen String'in tamamini alir
         */



        //3.Yol:
        System.out.println("Enter first, middle and last name: ");
        String fullName = input.nextLine();
        System.out.println(fullName);

        System.out.println("Enter your national ID");
        String id = input.next();
        System.out.println(id);



    }

}
