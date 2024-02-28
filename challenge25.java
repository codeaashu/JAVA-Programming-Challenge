import java.util.Scanner;

// Create a program to verify if a number is a palindrome.🚀
public class challenge25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        long number = scanner.nextLong();
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(long number) {
        String originalNumber = String.valueOf(number);
        String reversedNumber = new StringBuilder(originalNumber).reverse().toString();
        return originalNumber.equals(reversedNumber);
    }
}