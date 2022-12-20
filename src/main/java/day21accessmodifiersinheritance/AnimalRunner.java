package day21accessmodifiersinheritance;

public class AnimalRunner {

        /*
        1)"Inheritance" sayesinde
            i)Code tekrarlaindan kurtuluruz
            ii)Code maintenance kolay olur
            iii)Child Class'lari daha atomic yapmis oluruz
        2)Bir Class'i baska bir Class'in Child Class'i yapmak icin "extends" keyword kullanilir.
        Ilk yazilan Class Child, ikinci yazilan Class parent olur
        3)Child class objectleri parent classdan method ve variablelari kullanabilirler
        4)Parent class objectleri Child classdan method ve variablelari kullanamazlar
        5)Object Class her classin parentidir
        Javada Object Class haric her classin parenti vardir
        6)"Private" method ve variablelar Child Classlar tarafindan kullanamazlar
        7)"Protected" methodlar ve variablelar Child classlar tarafindan kullanilabilir
        8)"Default" methodlar ve variablelar ayni packagedeki Child classlar tarafindan kullanilabilir
        9)"Public" methodlar ve variablelar Child classlar tarafindan kullanilabilir
        Note: Child classlar tarafindan kullanilabilir olmak inherit edilebilir demektir
        10)4 tip inheritance vardir
            i)Multilevel Inheritance: Java bunu kabul eder
            ii)Hierarchical Inheritance: Bir parent icin coklu child, Java bunu kabul eder
            iii)Multiple Inheritance: Bir Childa coklu Parent, Java bunu desteklemez
            iv)Single Inheritance: Bir Child class icin bir parent class demektir. Java bunu destekler


        */

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();

        Bird b1 = new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();

    }
}
