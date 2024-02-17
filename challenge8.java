import java.util.Scanner;

// Create a program to calculate the area of a traingle.🚀
public class challenge8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate area of a traingle");
        System.out.print("Enter Breadth: ");
        int breadth = input.nextInt();
        System.out.print("Enter Height: ");
        int Height = input.nextInt();
        int aot = (1/2*(breadth*Height));
        System.out.println("Result is: " + aot);
    }
}