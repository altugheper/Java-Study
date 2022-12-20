package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //If it rains I will cancel the picnic
        //If statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin.
//        int s = -12;
//
//        if (s>0) {
//            System.out.println("Positive");
//        }


        //Example 2: Verilen character buyuk harf ise ekrana buyuk harf yazdirin
        char ch = 'A';
        if (ch>='A' && ch<='Z') {
            System.out.println("Buyuk Harf");
        }

        /*
        && islemi "ve" demektir ve sadece boolean ile kullanilir
                true && true = true
                true && false = false
                false && true = false
                false && false = false
        && islemi mukemmelliyetcidir, true sonucunu alabilmek icin hersey true olmalidir
        Bir tane false varsa sonuc false demektir
         */

        //Example 3: Verilen bir sayi 3 basamakli ise ekrana "Uc basamakli" yazdiriniz

        int number = -990;

        number = Math.abs(number);

        if (number>99 && number<1000) {
            System.out.println("Uc basamakli");
        }

        //Example 4: Verilen bir sayi cift sayi ise ekrana "Cift sayi" yazdiriniz
        int p = -14;


        //"=" isareti atama operatorudur, matematikteki esittir anlamina gelmez.
        //Matematikteki esittir sembolu Java'da "==" seklindedir
        //2+3 == 5
        if (p%2==0){
            System.out.println("Cift sayi");
        }

        //Example 5: Verilen bir sayi 300'den kucuk veya 1200'den buyuk ise ekrana "Harika sayi" yazdirin
        /*
            Note: "||" islemi "veya" demektir ve sadece boolean ile kullanilir
              true || true = true
              false || true = true
              true || false = true
              false || false = false
            Note: || isleminde false alabilmek icin herseyin false olmasi gerekir
                  || isleminde sadece bir tane true sonucu true yapmaya yeter
        */
        int r = 250;
        if (r<300 || r>1200 ){
            System.out.println("Harika sayi");
        }


    }

}
