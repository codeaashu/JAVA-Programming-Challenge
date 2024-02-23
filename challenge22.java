import java.util.Scanner;

// Create a program to reverse the digits of a number.🚀
public class challenge22 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Reverse Digits!");
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int reversedNum = reverseDigits(num);
            System.out.println("Reversed digits: " + reversedNum);
        }
    
        public static int reverseDigits(int num) {
            int reversedNum = 0;
            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }
            return reversedNum;
        }
    }
