import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;

        boolean isValid;
        String trash;


        do {
            isValid = false;
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (pipe.hasNextDouble()) {
                gallons = pipe.nextDouble();
                pipe.nextLine();
                if (gallons > 0) {
                    isValid = true;
                } else {
                    System.out.println("Error: Gallons must be greater than 0.\n");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Error: '" + trash + "' is not a valid number.\n");
            }
        } while (!isValid);


        do {
            isValid = false;
            System.out.print("Enter the fuel efficiency in miles per gallon (MPG): ");
            if (pipe.hasNextDouble()) {
                mpg = pipe.nextDouble();
                pipe.nextLine();
                if (mpg > 0) {
                    isValid = true;
                } else {
                    System.out.println("Error: MPG must be greater than 0.\n");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Error: '" + trash + "' is not a valid number.\n");
            }
        } while (!isValid);


        do {
            isValid = false;
            System.out.print("Enter the price of gas per gallon: $");
            if (pipe.hasNextDouble()) {
                pricePerGallon = pipe.nextDouble();
                pipe.nextLine();
                if (pricePerGallon > 0) {
                    isValid = true;
                } else {
                    System.out.println("Error: Price must be greater than 0.\n");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Error: '" + trash + "' is not a valid number.\n");
            }
        } while (!isValid);


        double costPer100Miles = (100.0 / mpg) * pricePerGallon;

        double maxDistance = gallons * mpg;


        System.out.println("\n-----------------------------");
        System.out.printf("Cost to drive 100 miles: $%.2f\n", costPer100Miles);
        System.out.printf("How far the car can go on a full tank: %.2f miles\n", maxDistance);
        System.out.println("-----------------------------");
    }
}

