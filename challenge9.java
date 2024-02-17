import java.util.Scanner;

// Create a program to calculate simple intrest.🚀
public class challenge9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Simple Intrest");
        System.out.println("Enter principle amount: ");
        double p = input.nextDouble();
        System.out.println("Enter time period: ");
        int t = input.nextInt();
        System.out.println("Enter rate amount: ");
        double r = input.nextDouble();
        double si = (p * t * r) / 100;
        double fv = p + si;
        System.out.println("Simple Intrest is :" + fv);
    }
}