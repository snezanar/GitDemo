package MOOCpack7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Film f = new Film("kojot", 18);

        Scanner sc = new Scanner(System.in);
        System.out.println("how old are you?");
        int perAge = sc.nextInt();

        if (perAge >= f.filmRating()) {
            System.out.println("You may rent the film " + f.filmName());
        } else {
            System.out.println("You may NOT rent the film " + f.filmName());
        }

    }
}
