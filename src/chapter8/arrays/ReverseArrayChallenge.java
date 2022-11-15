package chapter8.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        System.out.println(Arrays.toString(returnedArray));
        reverseArray(returnedArray);
        System.out.println(Arrays.toString(returnedArray));

    }
    private static int[] readIntegers(int count) {
        int[] ara = new int[count];

        for (int i = 0; i < ara.length; i++) {
            ara[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return ara;
    }

    private static void reverseArray(int[] ara) {
        for(int i = 0; i < ara.length / 2; i++) {
            int temp = ara[i];
            ara[i] = ara[ara.length - i - 1];
            ara[ara.length - i - 1] = temp;
        }
    }
}
