import java.util.Scanner;

// Create a program that categorize a person into different age groups.🚀
public class challenge15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to age calculator");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 0 && age < 13){
            System.out.println("You are a child");
        } else if(age >= 13 && age < 20){
            System.out.println("You are a teenager");
        } else if(age >= 20 && age < 60){
            System.out.println("You are an adult");
        } else if(age >= 60 && age <= 150){
            System.out.println("You are a senior citizen");
        } else {
            System.out.println("Sorry, You are downloaded");
        }
    }
}