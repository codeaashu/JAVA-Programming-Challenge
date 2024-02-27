import java.util.Scanner;

// Create a program to check if a number is an Armstrong number.🚀
public class challenge24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;

        // find the number of digits in the number
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // find the sum of the cubes of each digit
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // if the sum is equal to the original number, then the number is an Armstrong number
        return result == number;
    }
}