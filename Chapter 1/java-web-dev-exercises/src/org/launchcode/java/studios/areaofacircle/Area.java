package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {

        double radius;

        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.println("Enter a radius for a circle:");
                radius = input.nextDouble();

            } while (radius < 1);
            System.out.println("The area of that circle is: " + Circle.getArea(radius));

        } catch (Exception invalidInput) {
            System.err.println("Invalid entry");
        }


    }
}
