import java.util.Scanner;

// Create a program to calculate perimeter of a rectangle.🚀
public class challenge7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Perimeter of a rectangle");
        System.out.print("Enter length: ");
        int length = input.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = input.nextInt();
        System.out.println("Result is: "+ 2*(length+breadth));
    }
}
