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
        int[] arr1 = new int[n];
        int[] arr = { 12, 45, 46, 25, 40 };

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Length of the arr2 is: " + arr.length);

        System.out.println("Array is: " + Arrays.toString(arr));

        System.out.println("Elements in the array is:");
        for (int num : arr) {
            System.out.println(num);
        }

        // Searches for the element 46 in the array.
        int index = Arrays.binarySearch(arr, 46);
        System.out.println("Index of 46 in arr2 is: " + index);

        int[] arr3 = new int[5];
        Arrays.fill(arr3, 7);
        System.out.println(Arrays.toString(arr3));

        int[] copy = Arrays.copyOf(arr, arr.length);
        int[] partialCopy = Arrays.copyOfRange(arr, 1, 3);

        System.out.println(Arrays.equals(copy, arr));

        // Multidimentional Array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Array as a Streams
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println();
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        Arrays.stream(arr)
                .filter(num -> num > 2)
                .sorted()
                .forEach(System.out::println);

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Max: " + max + " Min: " + min);

        System.out.println("Array is: " + Arrays.toString(arr));
        // Reversing an array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reverse of Array is: " + Arrays.toString(arr));

    }
}
