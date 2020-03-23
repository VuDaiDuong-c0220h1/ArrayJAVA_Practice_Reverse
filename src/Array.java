import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Array:");
        for (int x : arr) {
            System.out.print(x + "\t");
        }
        for ( int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.println();
        System.out.println("New Array:");
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }
}
