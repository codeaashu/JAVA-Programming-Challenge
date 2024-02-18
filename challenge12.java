import java.util.Scanner;

// Create a program that determines the greatest of the three numbers.🚀
public class challenge12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter first number: ");
        int firstnumber = sc.nextInt();
        System.out.print("Now, enter second number: ");
        int secondnumber = sc.nextInt();
        System.out.print("Finally, enter third number: ");
        int thirdnumber = sc.nextInt();
        if(firstnumber >= secondnumber && firstnumber >= thirdnumber){
            System.out.println("First number is greatest: "+firstnumber);
        } else if(secondnumber >= thirdnumber){
            System.out.println("Second number is greatest: "+secondnumber);
        } else{
            System.out.println("Third number is greatest: "+thirdnumber);
        }
    }
}