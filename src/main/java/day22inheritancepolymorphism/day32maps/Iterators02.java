package day22inheritancepolymorphism.day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example 1: Iterators kullanarak elemanlarini tersten console'a yuazdiriniz
        ListIterator<String> itr = myList.listIterator();

        //hasNext() method'u pointer'dan sonra eleman varsa true, yoksa false return eder.
        //next() method'u pointer'i bir sonraki elemanin onnue koyar ve ustunden atladigi elemani return eder.
        while (itr.hasNext()){
            itr.next();
        }

        // hasPrevious() methodu, pointer'dan önce eleman varsa true, yoksa false return eder.
        // hasNext() methodu, pointer'ı bir önceki elemanın sonuna koyar ve üstünden atladığı elemanı return eder.
        while (itr.hasPrevious()){
            String el = itr.previous();
            System.out.print(el + " ");
        }

        System.out.println();

        //Example 2: List'deki tum elemanlari siliniz
        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.print(myList);

        /*
        ListIterator() da i)hasNext() ii)next() iii)set() iv)hasPrevious() v)previous() vi)remove()

        Iterator da i)hasNext() ii)next() iii)remove() method'lari vardir.
         */

        System.out.println();

        List<String> yourList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        ListIterator<String> iterator = myList.listIterator();

        while (iterator.hasNext()){
            String el = iterator.next();
            System.out.print(el + " ");
        }


    }
}
