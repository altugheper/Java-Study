package day06nestedifswitch.Homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side of a square: ");
        int length = scanner.nextInt();


        System.out.println("The area of square is: " + length*length);
        System.out.println("The perimeter of square is: " + 4*length);

    }


    }

 class Homework38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        System.out.println("The cube of your number is: " + number*number*number);


    }
}


class Homework39 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of the rectangle: ");
        int length = input.nextInt();

        System.out.println("Please enter the width of the rectangle: ");
        int width = input.nextInt();

        System.out.println("The area of rectangle is: " + width*length);
        System.out.println("The perimeter of rectangle is: " + 2*(width+length));




    }
}


class Homework40 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter width of the rectangular prism");
        int width = input.nextInt();

        System.out.println("Please enter length of the rectangular prism");
        int length = input.nextInt();

        System.out.println("Please enter height of the rectangular prism");
        int height = input.nextInt();

        System.out.println("The volume of rectangular prism is: " + width*length*height);
    }

}

class Homework41 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float pi = 3.14159F;

        System.out.println("Please enter a radius of a circle: ");
        float radius = input.nextFloat();

        System.out.println("The area of the circle is: " + pi*radius*radius);

        System.out.println("The perimeter of the circle is: " + 2*pi*radius);

    }
}

class Homework42 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length 1");
        byte length1 = input.nextByte();

        System.out.println("Please enter length 2");
        byte length2 = input.nextByte();

        System.out.println("Please enter length 3");
        byte length3 = input.nextByte();

        System.out.println("The perimeter of the triangle is: " + (length1+length2+length3));


    }

}

class Homework43 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a mile");
        double mile = input.nextDouble();

        System.out.println(mile + " mile" + " is " + mile*1.6 + " kilometer ");

    }

}

class Homework44 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter hour");
        long hour = input.nextLong();

        System.out.println(hour + " hour is " + hour*60*60 + " seconds ");

    }

}

class Homework45 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstName = input.nextLine();

        System.out.println("Please enter your last name");
        String lastName = input.nextLine();

        System.out.println("Your name and surname is: " + firstName + " " + lastName);

    }

}

class Homework46 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Please enter your address: ");
        String address = input.nextLine();

        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);

    }

}

