package MOOC_Loops;

import java.util.Scanner;

public class loop9 {
    public static void main(String[] args) {
        //Write a program that asks the user for input until the user inputs 0.
        //After this, the program prints the average of the positive numbers (numbers that are greater than zero).
        //If no positive number is inputted, the program prints "Cannot calculate the average"
        Scanner sc = new Scanner(System.in);
        int count_poz = 0;
        int sum_poz = 0;
        int avg_poz;
        int broj;
        while (true) {
            System.out.println("unesi broj: ");
            broj = sc.nextInt();
            if (broj == 0) {
                System.out.println("izlaz");
                break;
            } else if (broj > 0) {
                count_poz = count_poz + 1;
                sum_poz = sum_poz + broj;
            }
        }
        if (count_poz > 0) {
            avg_poz = sum_poz / count_poz;
            System.out.println("prosek pozitivnih brojeva: " + avg_poz);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}