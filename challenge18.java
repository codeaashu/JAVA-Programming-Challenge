import java.util.Scanner;

// Write a function that calculates the factorial of a given number.🚀
public class challenge18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to factorial");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is: " + fact);
    }

    public static long factorial(int num){
        if (num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}