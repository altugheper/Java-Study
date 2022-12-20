package day18arraylistspassbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {

        /*
        1) Java variablelarin orjinal degerlerini korumak ister
        2) Variable methodlar icinde kullanildiginda, Java methodun icine
        orjinal degeri koymaz, o degerin bir kopyasini uretir ve methoda
        o kopyayi yollar. Method kopya ustunde degisiklik yapar, dolayisiyla
        variablein orjinal degeri korunmus olur
        Bu sisteme "Pass By Value" denir.
        Note: Java "Pass By Value" kullanir.
        Note: Bazı programlama dilleri orijinal değeri koruma altına almamıştır. Bu işi developer'lara bırakmıştır.
            Bu tarz diller "Pass By Reference" kullanır.
         */

        int x = 5;
        System.out.println(x);// 5
        //static method olan "main method"un icindeki  hersey
        //static olmalidir
        change(x);
        System.out.println(x);// 5

        int ucret = 100;

        int kopya = indirim(ucret);
        System.out.println(kopya);//90
        indirim(ucret);
        System.out.println(ucret);//100

    }

    public static void change(int a) {
        System.out.println(a*3);
    }

    //void disindaki "return type"larda method bodysi icinde
    //"return" keyword kullanilmalidir
    public static int indirim(int gomlekUcreti) {
        return gomlekUcreti - 10;


    }
}
