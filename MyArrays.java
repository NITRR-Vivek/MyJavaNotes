import java.util.Scanner;
import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = { 12, 45, 46, 25, 40 };

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Length of the arr2 is: " + arr2.length);

        System.out.println("Array is: " + Arrays.toString(arr));

        System.out.println("Elements in the array is:");
        for (int num : arr2) {
            System.out.println(num);
        }
        int index = Arrays.binarySearch(arr2, 46);
        System.out.println("Index of 46 in arr2 is: " + index);

        int[] arr3 = new int[5];
        Arrays.fill(arr3, 7);
        System.out.println(Arrays.toString(arr3));
    }
}
