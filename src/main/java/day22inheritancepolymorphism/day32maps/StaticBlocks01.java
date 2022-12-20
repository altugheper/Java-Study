package day22inheritancepolymorphism.day32maps;

public class StaticBlocks01 {

    public static double pi;

    //static block'lar ihtiyacimiz olan variable'larin clas olusturma safhasinda elimizde olmasini saglar
    //static block'lar Class icindeki herseyden once calistirilir. "main method" dan ve diger tum method'lardan once calistirilir
    //static block'lar icinde sadece static variable'lara deger atanabilir
    //birden fazla statick block varsa ustteki once calistirilir

    static{
        pi=3.14;
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {

        System.out.println("Main method");

    }

    static{
        System.out.println("Static block 2");
    }

}
