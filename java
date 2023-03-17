import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Ask user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms to generate: ");
        int numTerms = scanner.nextInt();
        
        // Generate and print the Fibonacci sequence
        int prev1 = 0, prev2 = 1, current;
        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= numTerms; i++) {
            if (i == 1) {
                System.out.print(prev1 + " ");
                continue;
            }
            if (i == 2) {
                System.out.print(prev2 + " ");
                continue;
            }
            current = prev1 + prev2;
            System.out.print(current + " ");
            prev1 = prev2;
            prev2 = current;
        }
    }
}
