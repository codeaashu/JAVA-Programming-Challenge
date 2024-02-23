import java.util.Scanner;

// Create a program to find the Greatest Common Divisor (GCD) of two integers.🚀
public class challenge21 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to GCD!");
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            int gcd = gcd(num1, num2);
            System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        }
    
        public static int gcd(int num1, int num2) {
            if (num2 == 0) {
                return num1;
            }
            return gcd(num2, num1 % num2);
        }
}