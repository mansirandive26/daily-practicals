import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number from the user
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is a three-digit number
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit number.");
        } else {
            // Calculate the sum of cubes of digits
            int originalNumber = number;
            int sum = 0;
            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, 3);
                number /= 10;
            }

            // Check if the sum is equal to the original number
            if (sum == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }
        }

        scanner.close();
    }
}

