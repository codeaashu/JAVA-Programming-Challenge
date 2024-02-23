import java.util.Scanner;

// Create a program to find the Least Common Multiple (LCM) of two numbers.🚀
public class challenge20 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM!");
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int lcm = findLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int findLCM(int num1, int num2) {
        int greaterNum = Math.max(num1, num2);
        while (true) {
            if (greaterNum % num1 == 0 && greaterNum % num2 == 0) {
                return greaterNum;
            }
            greaterNum++;
        }
    }
}