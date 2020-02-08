package exercises;
import java.util.Scanner;

public class MpgCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used?");
        double gallonsOfGas = input.nextDouble();

        double mpg = miles / gallonsOfGas;

        System.out.println("You are getting " + mpg + " miles per gallon.");
    }

}