import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        double width = 0;
        double height = 0;
        boolean isValid;
        String trash;


        do {
            isValid = false;
            System.out.print("Enter the width of the rectangle: ");
            if (pipe.hasNextDouble()) {
                width = pipe.nextDouble();
                pipe.nextLine();
                if (width > 0) {
                    isValid = true;
                } else {
                    System.out.println("Error: Width must be greater than 0.\n");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Error: '" + trash + "' is not a valid number.\n");
            }
        } while (!isValid);


        do {
            isValid = false;
            System.out.print("Enter the height of the rectangle: ");
            if (pipe.hasNextDouble()) {
                height = pipe.nextDouble();
                pipe.nextLine();
                if (height > 0) {
                    isValid = true;
                } else {
                    System.out.println("Error: Height must be greater than 0.\n");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Error: '" + trash + "' is not a valid number.\n");
            }
        } while (!isValid);


        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));


        System.out.println("\n-----------------------------");
        System.out.printf("Area of the rectangle: %.2f\n", area);
        System.out.printf("Perimeter of the rectangle: %.2f\n", perimeter);
        System.out.printf("Length of the diagonal: %.2f\n", diagonal);
        System.out.println("-----------------------------");
    }
}

