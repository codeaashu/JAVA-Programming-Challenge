import java.util.Scanner;

// Create a program that determines if a number is positive, negative, or zero.🚀
public class challenge10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int input = sc.nextInt();
        if(input < 0){
            System.out.println("Number is negative: "+input);
        } else if(input == 0){
            System.out.println("Number is Zero: "+input);
        } else{
            System.out.println("Number is positive: "+input);
        }
    }
}