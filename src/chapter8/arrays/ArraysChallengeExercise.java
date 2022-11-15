package chapter8.arrays;

import java.util.Scanner;

public class ArraysChallengeExercise {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrays = getIntegers(5);
        sortArray(arrays);
        printArray(arrays);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void sortArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] < arrays[j + 1]) {
                    int temp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arrays) {
        for (int i : arrays) {
            System.out.println(i);
        }
    }
}
