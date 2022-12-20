package day24statickeywordencapsulation;

//Encapsulation: "Data Hiding" demektir
//Datayi neden gizlersiniz? Datayi dis etkenlerden korumak icin
//Datayi nasil gizlersin? Access Modifierini private yaparak gizlerim
//Datayi gizledikten sonra baska Classlardan okumak istersen ne yaparsin?
//get() methodlar (getter) olusturarak gizledigimiz datalari okunur hale getirebiliriz
//Datayi gizledikten sonra baska Classlardan degistirmek istersen ne yaparsin?
//set() methodlar(setter) olusturarak gizledigimiz datalari degistirebiliriz
//Variable'in data type ile get methodun return type i ayni olmalidir

public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    //getter method
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    //setter method
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

}
