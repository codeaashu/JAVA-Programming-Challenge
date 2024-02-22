import java.util.Scanner;

// Develop a program that prints the multiplication table for a given number.🚀
public class challenge16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Multiplication Table");
        System.out.print("Please enter your number: ");
        int num = sc.nextInt();
        printmultiplicationtable(num);
    }

    public static void printmultiplicationtable(int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num + " X " + i + " = " + (num*i));
            i++;
        }
    }
}