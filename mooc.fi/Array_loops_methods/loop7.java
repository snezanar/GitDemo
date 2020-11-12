package MOOC_Loops;

import java.util.Scanner;

public class loop7 {
    public static void main(String[] args) {
        // The example below shows a program which reads numbers from the user until the user writes 0.
        //Then the program prints the number of positive and negative numbers given,
        //and the percentage of positive numbers from all numbers given.
        Scanner sc = new Scanner(System.in);
        int br_poz = 0;
        int br_neg = 0;

        while (true) {
            System.out.println("unesi broj: ");
            int broj = sc.nextInt();
            if (broj == 0) {
                System.out.println("izlaz");
                break;
            } else if (broj > 0) {
                br_poz = br_poz + 1;

            } else if (broj < 0) {
                br_neg = br_neg + 1;
            }
        }
        System.out.println("broj pozitivnih unetih brojeva: " + br_poz);
        System.out.println("broj negativnih unetih brojeva: " + br_neg);
        if (br_poz + br_neg > 0) {
            double proc = (br_poz / (br_poz + br_neg)) * 100;
            System.out.println("procenat pozitivnih u ukupnom broju: " + proc + " %.");
        }

    }
}
