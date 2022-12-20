package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");
        System.out.println(names);

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Tacettin");

        names.removeAll(cities);//removeAll() kullandiginizda sadece ilk list degisir, parantezin icindeki list degismez
        System.out.println(names);// [Thomas, Tahsin]
        System.out.println(cities);// [Trump, Tom, Tacettin]


        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);//Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder
        //Hepsi varsa "true", en az biri yoksa "false" verir
        System.out.println(sonuc1);// true


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //Example 1: "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz
        a.remove("Shoes");
        System.out.println(a);// [TV, Radio, Laptop, Shoes, Book, Shoes] ilk gorunumunu sildi

        //Example 2: "Shoes" elemaninin tum gorunumlerini siliniz
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);// [TV, Radio, Laptop, Book]
        //removeAll() u kullanirken, yani bir Listten bir elemani silerken, ikinci bir List yaratip
        //Silinecek elemani o yeni Liste eklemen lazim

        //Example 3: Bir tane salary listi olusturun, eger salary 10000'den az ise %20, 10000'den cok ise %10 zam yapiniz
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.50);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);// [12345.0, 8674.5, 15000.5, 9500.0, 20500.0]

        for (Double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary);// [13579.500000000002, 10409.4, 16500.550000000003, 11400.0, 22550.000000000004]

        //Example 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz.
        // Iki ArrayList'in esit olabilmesi icin elemanlar, esit olmali ve ayni elemanlar ayni index'te olmali
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
        int counter = 0;

        //1. Yol:
        for (int i = 0; i < m.size(); i++) {

            if (m.size()!=n.size()) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
            if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }

        if (counter==0) {
            System.out.println("Listler esittir");
        }

        //2.Yol:
        boolean esitmi = m.equals(n);

        if (esitmi) {
            System.out.println("Listler esittir");
        }else {
            System.out.println("Listler esit degildir");
        }
    }

    }

