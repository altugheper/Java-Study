package javapractice;

import java.util.Scanner;

public class Practice20 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            for (int k = 0; k<7;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the number of rows");
//        int row = input.nextInt();
//        System.out.println("Please enter the character");
//        char ch = input.next().charAt(0);
//
//        for (int i = 0; i<row;i++){
//
//            for (int k=row-i;k>1;k--){
//                System.out.print(" ");
//            }
//            for (int y = 0;y<=i;y++){
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int row2 = input2.nextInt();
        System.out.println("Please enter the character");
        char ch2 = input2.next().charAt(0);

        for (int i = row2; i > 1; i--){
            for (int space = i-1; space<row2;space++){
                System.out.print(" ");
            }
            for (int cha = i;cha>1;cha--){
                System.out.print(ch2 + " ");
            }
            System.out.println();
        }
    }
}
