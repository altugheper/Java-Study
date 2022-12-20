package day02methodcreation;

public class MethodCreation {


    //main method icinde kullanacaginiz hersey "static" olmalidir.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ucSayiyiCarp(2, 1.5, 6));

        System.out.println(ikiSayiyiToplaUcuncuIleCarp(2, 8, 3.2));

        //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
        //Ekrana birsey yazdirmak icin iki tane kod var i)System.out.println() ii)System.out.print()
        //println kullanirsan satir basi yapar. ln - line demek. eger normal out.print kullanirsan satir basi yapmaz

        

    }

    //Example 1: Toplama islemi yapan bir method olusturunuz

    public static double toplamaYap (double a, double b) {
        return a+b;

    }

    //Example 2: 3 sayiyi birbiri ile carpan bir method olusturunuz

    public static double ucSayiyiCarp (double a, double b, double c) {
        return a*b*c;
    }

    //Example 3: 3 sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup, sonucu ekrana yazdiriniz

    public static double ikiSayiyiToplaUcuncuIleCarp (double a, double b, double c) {
        return (a+b)*c;
    }


}
