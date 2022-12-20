package day21accessmodifiersinheritance;

public class Student {

    /*

    1) public   2)protected     3) default (Access Modifier'i default yapmak icin access modifier yazmayiz) 4)private
    Note: Access Modifier'lari genisten dara dogru sayiniz INTERVIEW QUESTION
          public > protected > default > private  INTERVIEW QUESTION
    Note: Access Modifier'lari birer birer aciklayiniz
          public her class'dan kullanilabilir
          protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
          default olanlar baska package'den kullanilamazlar
          private olanlar sadece olusturulduklari Class icinde kullanilabilirler
    Note: Protected ile default un farkini soyleyiniz INTERVIEW QUESTION
          protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
          default olanlar baska package'den kullanilamazlar
    Note: Class'lar icin hangi Access Modifier'lar kullanilabilirler
          public, default kullanilir ama protected ve private kullanilamaz

          173-176 sayfalarina bak
     */


    //public her class'dan kullanilabilir
    public String stdName = "TomHanks";

    //protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
    protected String address = "Miami";

    //default olanlar baska package'den kullanilamazlar
    String email = "th@gmail.com";

    //private olanlar sadece olusturulduklari Class icinde kullanilabilirler
    private String stdId = "202017004";

}
