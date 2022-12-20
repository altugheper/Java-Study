package day18arraylistspassbyvalue;

public class Varargs01 {

     /*
    1) Farkli sayilardaki parametrelerle calisabilen bir method olusturmak
    isterseniz "varargs" kullanmalisiniz
    2) "varargs" arka tarafta "array" kullanir, bu yuzden "varargs"larla calisirken
    Arraylerle calisiyormus gibi davranabilirsiniz
    3)"varargs" olusturmak icin "<data type> ...<varargs ismi>"
    veya "<data type>... <varargs ismi>"
    4)Bir methodda "varargs"in yaninda baska bir parametre kullanilabilir mi?
    "varargs" en sonda olmak sarti ile kullanilir
    5)Bir methodda birden fazla "varargs" kullanilabilir mi?
    "varargs" en sonda olmak zorunda oldugunda, birden fazla
    kullanirsaniz en az biri en sonda olmayacaktir. Bu da 4. Kural ile celisir
     */


    public static void main(String[] args) {
        int r1 = toplama(2, 3);
        System.out.println(r1);

        int r2 = toplama(2, 3, 4);
        System.out.println(r2);
    }

    //Iki sayinin toplamini return eden bir method olustunuz
//    public static int toplama (int a, int b) {
//        return a+b;
//    }

    //Uc sayinin toplamini veren methodu yaziniz
//    public static int toplama(int a, int b, int c) {
//        return a+b+c;
//    }

    //Dort sayinin toplamini veren methodu yaziniz
//    public static int toplama(int a, int b, int c, int d) {
//        return a+b+c+d;
//    }

    //Istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim
    public static int toplama(int...a){
        int sum = 0;
        for (int w : a){

            sum += w;
        }
        return sum;
    }

}
