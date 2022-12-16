package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing.arrays;

import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);

        int minValue = findMin(returnedArray);

        System.out.println(minValue);

    }
    private static int[] readIntegers(int count) {
        int[] ara = new int[count];

        for (int i = 0; i < ara.length; i++) {
            ara[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return ara;
    }
    private static int findMin(int[] ara) {
        int min = Integer.MAX_VALUE;

        for (int j : ara) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
