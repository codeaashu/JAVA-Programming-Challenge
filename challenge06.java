import java.util.Scanner;

// Create a program that takes two numbers and show result of all arithmetic operators (+,-,*,/,%) .🚀
public class challenge6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int fn = input.nextInt();
        System.out.print("Enter Second Number: ");
        int sn = input.nextInt();
        System.out.println("\n The all arithmetic result of your two number is: ");
        int plus = fn + sn;
        System.out.println("The Addition of First or Second is: "+plus);
        int minus = fn - sn;
        System.out.println("The Subtraction of First or Second is: "+minus);
        int multi = fn * sn;
        System.out.println("The Multiplication of First or Second is: "+multi);
        int div = fn / sn;
        System.out.println("The Division of First or Second is: "+div);
        int modules = fn % sn;
        System.out.println("The Percentage of First or Second is: "+modules);
    }
}
