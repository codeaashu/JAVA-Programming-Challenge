import java.util.Scanner;

// Create a program that calculates grade based on their marks.🚀
public class challenge14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks know your grade, you are(A,B,C,D, or F)");
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println("Great, You have got Grade (A)");
        } else if(marks >= 75 && marks < 90){
            System.out.println("Good, You have got Grade (B)");
        } else if(marks >= 60 && marks < 75){
            System.out.println("Work harder next time, You have got Grade (C)");
        } else if(marks >= 30 && marks < 60){
            System.out.println("You seriously need to work, You have got Grade (D)");
        } else if(marks < 30 && marks >= 0){
            System.out.println("Sorry, You have failed you got Grade (F)");
        } else{
            System.out.println("invalid!");
        }
    }
}