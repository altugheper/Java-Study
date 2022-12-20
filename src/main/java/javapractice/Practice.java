package javapractice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        //kullanicidan bir karakter girmesini isteyin
        //girilen karakterin harf olup olmadigini yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Bir harf giriniz...");
        char letter = input.next().charAt(0);

        //if ile yap
        if (letter>='A' && letter<='Z' || letter>='a'&&letter<='z') {
            System.out.println("Girdiginiz karakter bir harftir");
        }else {
            System.out.println("Girdiginiz karakter bir harf degildir");
        }



        //user dan yaşını isteyin 18'den büyükse reşitsin
        //18'den küçükse kaç yıl sonra reşit olacagını yazdırın

        Scanner input2 = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas = input2.nextInt();

        if (yas>=18) {
            System.out.println("Resitsiniz");
        }else {
            System.out.println("Resit degilsiniz ama " + (18-yas) + " sene sonra resit olacaksiniz");
        }

        //kadın 60ından sonra
        //erkek 65 inden sonra emekli olabilir

        Scanner input3 = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        String sex = input3.next().toLowerCase();

        switch (sex) {
            case "erkek":
                System.out.println("65'inizden sonra emekli olacaksiniz");
                break;
            case "kadin":
                System.out.println("60'inizdan sonra emekli olacaksiniz");
                break;
            default:
                System.out.println("Gecerli bir cinsiyet giriniz");
        }

           //2. Method:
        Scanner input4 = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        String cinsiyet = input4.next();

        if (cinsiyet.equalsIgnoreCase("Erkek")) {
            System.out.println("65'inizden sonra emekli olacaksiniz");
        }else if (cinsiyet.equalsIgnoreCase("Kadin")) {
            System.out.println("60'inizdan sonra emekli olacaksiniz");
        }else {
            System.out.println("Gecerli bir cinsiyet giriniz...");
        }

        //user dan offer için maaşı sorun
        //yıllık 42000 Euronun altına 'kabul edemem'
        //42000 ile 48000 arasına 'anlaşabiliriz'
        //48000 in üzerine ise kabul ediyorum yazdırın

        Scanner input5 = new Scanner(System.in);
        System.out.println("Lutfen offer'inizi giriniz");
        int maas = input5.nextInt();

        if (maas<42000) {
            System.out.println("Kabul edilemez");
        }else if (maas>=42000 && maas<48000) {
            System.out.println("Anlasabiliriz");
        }else if (maas>=48000) {
            System.out.println("Kabul edilebilir");
        }else {
            System.out.println("Lutfen gecerli bir maas giriniz");
        }

        //user dan pozitif tam sayi isteyin.
        // tam sayi 3 basamaklı ise '3 basamaklı
        // 3 basamaklı degilse tek veya cift oldugunu yazdırın

        Scanner input6 = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = input6.nextInt();

        if (sayi>99 && sayi<1000) {
            System.out.println("3 basamakli sayi");
        }else if (sayi%2==0) {
            System.out.println("Cift basamakli sayi");
        }else {
            System.out.println("Tek basamakli sayi");
        }

        }



    }


