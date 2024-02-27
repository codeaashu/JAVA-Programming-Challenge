import java.util.Scanner;

// Create a program to swap two numbers.🚀
public class challenge5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping station");
        System.out.print("Enter value of A : ");
        int a = input.nextInt();
        System.out.print("Enter value of B : ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("\nSwapping done...");
        System.out.println("value of A is : " + a);
        System.out.println("value of B is : " + b);
    }
}
