package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int i = 1;
        //While loop bazi durumlarda hic calismayabilir, yani while loop icin "zero execution" mumkundur
        while (i<1) {
            System.out.println("While loop");
            i++;
        }

        int k = 1;

        //do-while loop kullandiginizda loop body'si icindeki kod en az bir kere calisir.
        //Yani; do-while loop icin "zero execution" mumkun degildir
        do {
            System.out.println("do-while loop");
            k++;
        }while (k<1);



        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz
        //           24.5673 ==> 5+6+7+3 = 23

        double num = 24.5673;
        System.out.println(num);//24.5673

        //String.valueOf() methodu parantezin icine konulan datanin tipini String yapar
        String str = String.valueOf(num);
        System.out.println(str);//24.5673

        //Regex icin nokta kullandiginiz zaman onune "\\" koyunuz. Yani nokta "\\." seklinde kullanilir
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);//5673

        int sum = 0;
        do {

            sum = sum + decimalInt%10;

            decimalInt = decimalInt/10;

        }while (decimalInt>0);

        System.out.println(sum);

    }
}
