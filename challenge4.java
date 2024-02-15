import java.util.Scanner;
// Create a program to add two number.🚀
public class challenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int fn = input.nextInt();
        System.out.print("Enter second no: ");
        int sn = input.nextInt();
        int sum = fn + sn;
        System.out.println("The sum of first and second no is: "+ sum);
    }
}