package Naming_Conventions_and_Packages_static_and_final_keywords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        X x = new X(scanner.nextInt());
        x.x();
    }
}

