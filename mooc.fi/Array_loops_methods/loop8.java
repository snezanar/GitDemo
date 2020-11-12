package MOOC_Loops;

import java.util.Scanner;

public class loop8 {
    public static void main(String[] args) {
        //Write a program that asks the user for input until the user inputs 0.
        // After this the program prints the amount of numbers inputted
        //The number zero does not need to be added to the sum, but adding it does not change the results.
        //After this, the program prints the average of the numbers. You may assume that the user inputs at least one number.

        Scanner sc = new Scanner(System.in);
        int zbir = 0;
        int count = 0;
        double avg;

        while (true) {
            System.out.println("unesi broj");
            int br = sc.nextInt();
            if (br != 0) {
                zbir = zbir + br;
                count = count + 1;

            } else if (br == 0) {
                System.out.println("izlaz");
                break;
            }
        }
        System.out.println("suma unetih brojeva: " + zbir);
        System.out.println("broj unosa: " + count);
        if (count > 1) {
            avg = zbir / count;
            System.out.println("prosek brojeva je " + avg);
        }

    }
}
