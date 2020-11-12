package MOOC_Loops;

import java.util.Scanner;

public class VezbaIfLeapYear {
    public static void main(String[] args) {
        //A year is a leap year if it is divisible by 4. However,if the year is divisible by 100,
        //then it is a leap year only when it is also divisible by 400.
//Write a program that reads a year from the user, and checks whether or not it is a leap year.
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi godinu: ");
        int godina = sc.nextInt();
        if (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 == 0)) {
            System.out.println("godina je prestupna");
        } else {
            System.out.println("godina nije prestupna");
        }
    }
}
//    if(year % 4 === 0 && (year % 100 !== 0 || year % 400 === 0)) {