package day18arraylistspassbyvalue;

public class MethodOverLoading01 {

    /*
    Method Overloading nasil yapilir?
    1) Method isimleri ayni olmalidir
    2) Method parametleri farkli olmalidir
        i)Parametre sayilari degistirilebilir
        ii)Parametrelerin data typelarini degistirebilirsiniz
        iii)Parametrelerin yerlerini degistirebilirsiniz ancak
            data typelari farkli ise
    3)Method Ismi + Parametreler = Method Signature

     */

    public static void main(String[] args) {

        toplama(3, 5);
        toplama(3, 5.0);

    }

    public static void toplama(int a, int b) {
        System.out.println(a+b);
    }

    public static void toplama(int a, int b, int c) {
        System.out.println(a+b);
    }

    public static void toplama(int a, double b) {
        System.out.println(a+b);
    }

    public static void toplama(double a, int b) {
        System.out.println(a+b);
    }

}
