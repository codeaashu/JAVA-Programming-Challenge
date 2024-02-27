import java.util.Scanner;

// Create a program to print the Fibonacci series up to a certain number.🚀
public class challenge23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms you want in the Fibonacci series: ");
        int numOfTerms = scanner.nextInt();

        if (numOfTerms <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
        } else {
            printFibonacciSeries(numOfTerms);
        }

        scanner.close();
    }

    public static void printFibonacciSeries(int numOfTerms) {
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci series up to " + numOfTerms + " terms:");

        for (int i = 1; i <= numOfTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
