import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit;
        boolean isValid = false;
        String trash;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (pipe.hasNextDouble()) {
                celsius = pipe.nextDouble();
                pipe.nextLine();
                isValid = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Error: '" + trash + "' is not a valid number. Please try again.\n");
            }
        } while (!isValid);


        fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        System.out.printf("The equivalent temperature in Fahrenheit is: %.2f°F\n", fahrenheit);
    }
}

