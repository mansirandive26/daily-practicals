import java.util.Scanner;

public class EvenNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept min and max values from the user
        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();
        
        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();
        
        // Display even numbers within the range
        System.out.println("Even numbers between " + min + " and " + max + ":");
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}

