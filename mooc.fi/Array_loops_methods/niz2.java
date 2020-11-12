package MOOC_Arrays;

import java.util.Scanner;

public class niz2 {
    public static void main(String[] args) {
        //asks the user for a number to search in the array.
        //If the array contains the given number, the program tells the index containing the number.
        // If the array doesn't contain the given number, the program will advise that the number wasn't found.
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi trazeni broj");
        int broj = sc.nextInt();

        int[] niz = new int[5];
        niz[0] = 1;
        niz[1] = 3;
        niz[2] = 5;
        niz[3] = 7;
        niz[4] = 9;

        int i = 0;
        while (i < niz.length) {
            if (broj == niz[i]) {
                break;
            }
            if (broj != niz[i]) {
                i++;
            }
        }
        System.out.println("trazeni broj je na indexu " + i);
    }
}
