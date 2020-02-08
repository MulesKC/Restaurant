package exercises;

import java.util.Scanner;


public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of your rectangle?");
        double length = input.nextDouble();
//        System.out.println(length);

        System.out.println("What is the width of your rectangle?");
        double width = input.nextDouble();
//        System.out.println(width);

        input.close();

        double area = length * width;
        System.out.println("The area of your rectangle is: " + area);



    }
}