import java.util.Scanner;

// Create a program that determines if a given year is a leap year.🚀
public class challenge13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if( year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        // or or
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Your year is leap year");
        } else{
            System.out.println("Your year is not a leap year");
        }
    }
}