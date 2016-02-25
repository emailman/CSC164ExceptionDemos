package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        boolean continueInput = true;
        do {
            System.out.print("Enter a radius: ");
            try {
                String reply = input.next();

                double radius = Double.parseDouble(reply);

                double area = Math.PI * Math.pow(radius, 2);

                System.out.printf("Area of circle radius %f is %f%n", radius, area);

                continueInput = false;

            } catch (InputMismatchException e) {
                System.out.println("You messed up 1, try again");
                // Flush the input buffer
                input.nextLine();

            } catch (NumberFormatException e) {
                System.out.println("You messed up 2, try again");

            } catch (Exception e) {
                System.out.println("Something else happened");
                System.exit(1);
            }
        } while (continueInput);

        System.out.println("Thank you and have a nice day");
    }
}
