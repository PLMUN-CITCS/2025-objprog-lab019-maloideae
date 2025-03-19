import java.util.Scanner;

public class FactorialCalculator {

    public static int getNonNegativeInteger(Scanner input) {
        int number;
        
        System.out.print("Enter a non-negative integer: ");

        while (true) {
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Error! Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                input.next();
            }
            System.out.print("Enter a non-negative integer: ");
        }
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = getNonNegativeInteger(input);
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);

        input.close();
    }
}
