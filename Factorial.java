import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept the number from the user
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        
        // Calculate factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        // Display the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
}

