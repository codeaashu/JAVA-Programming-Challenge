import java.util.Scanner;

// Create a program that determines if a number is odd or even.🚀
public class challenge11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Know your number is : ODD & EVEN");
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        if(input % 2 == 0){
            System.out.println("Your number is EVEN: "+input);
        } else {
            System.out.println("Your number is ODD: "+input);
        }
    }
}