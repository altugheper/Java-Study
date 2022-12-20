package day24statickeywordencapsulation;

public class StudentRunner {
    public static void main(String[] args) {

        Student std1 = new Student();

        //getter
        System.out.println(std1.getStdId()); //TH202201
        System.out.println(std1.getGpa()); //3.8
        System.out.println(std1.isRetired()); //false

        //setter
        std1.setStdId("AB");
        System.out.println(std1.getStdId()); //AB

        std1.setRetired(true);
        System.out.println(std1.isRetired()); //true

        std1.setGpa(4.0);
        System.out.println(std1.getGpa()); //4.0

        //Yeni Object
        Student std2 = new Student();
        System.out.println(std2.getStdId()); //TH202201 settera uymayip eski yani orjinal halini gordu



    }
}
