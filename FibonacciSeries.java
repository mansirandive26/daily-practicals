public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 78; // The number up to which Fibonacci series is to be displayed
        
        // Display Fibonacci series up to n
        System.out.println("Fibonacci series up to " + n + ":");
        int a = 0, b = 1;
        while (a <= n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

