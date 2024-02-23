import java.util.Scanner;

// Create a program that computes the sum of the digits of an integer.🚀
public class challenge19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digits!");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("The sum of the digits is: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}