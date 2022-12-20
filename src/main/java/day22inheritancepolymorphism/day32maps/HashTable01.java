package day22inheritancepolymorphism.day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
        1)Hashtable bir map'dir.
        2)Hashtable enterSet'leri herhangi bir siralamaya tabi tutmaz
        3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe  ve synchronized'dir
        4)Hashtable'larda key null olamaz. NullPointerException atar
        5)Hashtable'larda value null olamaz. NullPointerException atar.

        Note: toString() method'u object'leri console'da detaylari ile gorebilmek icin class'larin icinde olusturulur.
              toString() methodu'unu olusturmadan object'i console'a yazdirirsaniz Java o object'in adresini yazdirir

     */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 40000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations); //{USA=40000000, Germany=83000000, Turkey=90000000}

        //countryPopulations.put(null, 90000000); //Hashtable'larda key null olamaz. NullPointerException
        //countryPopulations.put("France", null); //Hashtable'larda value null olamaz. NullPointerException

        Hashtable<String, Students> myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks", "th@gmail.com", 21, true));

        System.out.println(myStudents);

        String name = myStudents.get("Math").name;
        System.out.println(name);

        int age = myStudents.get("Math").age;
        System.out.println(age);

    }

}
