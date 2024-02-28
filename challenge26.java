import java.util.Scanner;

// Create a program to find the sum and average of all elements in an array.🚀
public class challenge26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to Array sum and Average");
        System.out.print("Please enter the number of element: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Please enter element no: " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            i++;
        }
        int sum = 0;
        for (int j = 0; j < size; j++) {
            sum += num[j];
        }
        double average = (double) sum / size;
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
    }
    }