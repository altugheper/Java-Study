package javapractice;

public class Practice19 {
    public static void main(String[] args) {

        /*
        *
       * *
      *   *
     *     *
    *********
         */

//        for (int i = 1; i<=5; i++){ //column
//            for (int s = 1; s<9;s++){ //row
//                if ((i==1 && s==5) || (i==2 && (s==4 || s==6)) || (i==3&&(s==3||s==7)) || (i==4 && (s==2 || s==8)) || i==5){
//                    System.out.print("*");
//                }else System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();

        //Yeni column/row problemi
//        for (int k=1;k<=5;k++){
//            for (int j=1;j<9;j++){
//                if (k==1 || (k==2 && (j==2 || j==8)) || (k==3 &&(j==3 || j==7)) || (k==4 && (j==4 || j==6)) || (k==5 && j==5)){
//                    System.out.print("*");
//                }else System.out.print(" ");
//            }
//            System.out.println();
//        }

        //Ismini yazdir
            /*
             *      *     ******  *    *  ******
            * *     *       *     *    *  *
           *****    *       *     *    *  * ****
          *     *   *       *     *    *  *    *
         *       *  ******  *     ******  ******
             */

        for (int a = 1; a<=5;a++){
            for (int i = 1; i<=9; i++){
                if ((a==1 && i==5) || (a==2 && (i==4 || i==6)) || (a==3 && (i==3 || i==4 || i==5 || i==6 || i==7 )) || (a==4 && (i==2 || i==8)) || (a==5 && (i==1 || i==9))){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }







    }
}
