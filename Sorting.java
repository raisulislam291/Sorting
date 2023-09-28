import java.util.Scanner;

public class Sorting {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your sorted array is: ");
        // int[] arr = { 7, 8, 3, 1, 2 };

        // bubble sorting
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temporaryVar = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporaryVar;
                }
            }
        }
        printArray(arr);
    }
}
