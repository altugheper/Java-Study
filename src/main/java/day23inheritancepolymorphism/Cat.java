package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cats meow");
    }

    @Override //@Override annotation'ini kullanarak, Java'nin yaptigimiz Override isleimini kontrol etmesini saglariz
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b){
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b){
        return a*b+1;
    }

    //Asagidaki method "Overriding Method"
    @Override
    public Mammal create(){
        return new Mammal();
    }

    /*
    Override: Parentdan alip methodu degistirmeye denir
    1)Override yaparken methodun bodysi degistirilir
    2)Override yaparken asla method signature(isim ve parametre) degistirilmez
    3)Override yaparken inheritance olmak zorundadir
    4)Override yaparken access modifierlar belli kurallara gore farklilastirabilirler
            i)private methodlar override edilemezler
            ii)child classdaki override edilen methodun access modifieri parent classdaki methodun access modifieri ile ayni veya genis olmalidir
            Note: Child classdaki methodun access modifieri daha dar olamaz
            iii)default methodlar ayni package icindeyse override edilebilirler
                farkli packageden override edilemezler.
    5)Parent Classdaki methodun return type i void ise return type degistirilemez
    6)Parent Classdaki methodun return type i primitive ise return type degistirilemez
    7)Parent Classdaki methodun return type i wrapper class ise return type degistirilemez
    8)Parent Classdaki methodun return type i parent class ise return type childlardan biri olabilir
    Note:Child classdaki return type parent classdakinden genis olamaz
    Note:Aralarinda parent child iliskisi olmayan Class'lar overridingde return type degisiminde kullanilamaz
    Mesela Short, Integerdan kucuktur, fakar aralarinda Parent Child iliskisi
    olmadigindan Integer yerine Short kullanamazsiniz
    Note:Childdaki methodun return typeindan parentdaki methodun return typeina gidiste "is-a" relationship olmali
    Note: Aralarinda "IS-A" relationship olan data typelara "Covariant" denir
                      HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
    9) Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
   HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
    10)"final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
    "final" method body degistirilmesine musaade etmez.
    11)Polymorphism = Overloading + Overriding INTERVIEW QUESTION
       Note: Polymorphism nedir? derlerse Overloading ve Overridingi anlatin
    12)Overloading ve Overriding arasindaki farklar nelerdir? INTERVIEW QUESTION
       i)Overloading icin inheritance gerekmez fakat Overriding icin gerekir
       ii)private methodlar overload edilebilir, override edilemezler
       iii)final methodlar overload edilebilir, override edilemezler
       iv)Overloading static polymorphism olarak, Overriding dynamic Polymorphism olarak adlandilir
       Cunku static methodlar overload edilebilir, Override edilemezler
       v)Overloadingde method signature degisir ama overridingde method signaturea dokunulmaz

     */

}
