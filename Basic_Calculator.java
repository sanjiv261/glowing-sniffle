import java.util.Scanner;

public class Basic_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Calculation = true;

        System.out.println("----- Java Calculator -----");

        while (Calculation) {
            // Display menu
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                Calculation = false;
                System.out.println("Thanks for using calculator ");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Please choose the number between 1 to 5.");
                continue;
            }

            // Get numbers from user
            System.out.print("Enter first number: ");
            double n1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double n2 = scanner.nextDouble();

            double result = 0;
            String operation = "";

            // Perform calculation based on choice
            switch (choice) {
                case 1:
                    result = add(n1, n2);
                    operation = "+";
                    break;
                case 2:
                    result = subtract(n1, n2);
                    operation = "-";
                    break;
                case 3:
                    result = multiply(n1, n2);
                    operation = "*";
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    result = divide(n1, n2);
                    operation = "/";
                    break;
            }

            // Display result
            System.out.println("Result: " +n1+operation+n2+ "="+result );
        }

    }

    // Addition method
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division method
    public static double divide(double a, double b) {
        return a / b;
    }
}