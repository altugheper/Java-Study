package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
    //     byte < short < integer < long < float < double
    //Auto widening: Kucukten buyuge data type'i cevirmek
    //Explicit narrowing: Buyukten kucuge data type'i cevirmek

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        //Example 1: short'u double a ceviren kodu yaziniz
        //           float'i byte yapan kodu yaziniz

        short abc = 10;
        double newAbc = abc;//Auto Widening

        float price = 10.99F;
        byte newPrice = (byte)price;//Explicit Narrowing

        System.out.println(newPrice);//10 ==> Java ondalik sayiyi, tam sayiya cevirirken yuvarlama islemi yapmaz
                                     //       Java ondalik sayiyi, tam sayiya cevirirken ondalik kismini siler

        int number = 515;
        byte newNumber = (byte)number;
        System.out.println(newNumber);//3 ==> neden 3? Java 515'i 256'ya(byte'taki sayilarin sayisi) boldu kalani return etti

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);//-2


    }

}
