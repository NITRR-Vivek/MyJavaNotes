import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;

public class MyArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr = { 12, -45, 46, -25, 40 };

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

        Arrays.stream(arr)
                .filter(num -> num > 2)
                .sorted()
                .forEach(System.out::println);

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        Double avg = Arrays.stream(arr).average().getAsDouble();
        long count = Arrays.stream(arr).count();
        int sum = Arrays.stream(arr).sum();

        System.out.println("Count: " + count + " Sum: " + sum + " Max: " + max + " Min: " + min + " Avg: " + avg);

        // Reversing an array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Array is: " + Arrays.toString(arr));
        System.out.println("Reverse of Array is: " + Arrays.toString(arr));
        System.out.println();

        double mean = Arrays.stream(arr).average().orElse(0.0);
        double median = getMedian(arr);
        int mode = getMode(arr);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
        System.out.println();

        int[] mArr = Arrays.stream(arr)
                .map(num -> num <= 0 ? num + 30 : num)
                .toArray();

        System.out.println("Modified arr (+30 each -ve element): " + Arrays.toString(mArr));

        IntSummaryStatistics stats = Arrays.stream(mArr).summaryStatistics();

        System.out.println(stats);
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
        System.out.println();
    }

    private static double getMedian(int[] arr) {
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        int n = sortedArr.length;
        if (n % 2 == 0) {
            return (sortedArr[n / 2 - 1] + sortedArr[n / 2]) / 2.0;
        } else {
            return sortedArr[n / 2];
        }
    }

    private static int getMode(int[] arr) {
        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        return frequencyMap.entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .get()
                .getKey();
    }
}
