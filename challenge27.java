import java.util.Scanner;

// Create a program to find number of occurrences of an element in an array.🚀
public class challenge27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to count:");
        int x = scanner.nextInt();
        int count = countOccurrences(arr, x);
        System.out.println("The number of occurrences of " + x + " in the array is: " + count);
    }

    public static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
}