import java.util.Scanner;

// Create a program to sum all odd numbers from 1 to a specified number N.🚀
public class challenge17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ODD SUM");
        System.out.print("Please enter your number: ");
        int num = sc.nextInt();
        int sum = oddsum(num);
        System.out.println("ODD SUM till " + num + " is: " + sum);
    }

    public static int oddsum(int num){
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}