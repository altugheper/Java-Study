package day23inheritancepolymorphism;

public class Math extends Courses{
    public void practice() {
        System.out.println("Solve Questions");
    }

    public Math(){
        super("X");
        System.out.println("Constructor 1");
    }
    public Math(int a) {
        this(); //Ayni class'in icinde diger Constructor'i kullan
        System.out.println("Constructor 2");
    }
}
