package MOOC_Loops;

import java.util.Scanner;

public class VezbaIfGiftTax {
    public static void main(String[] args) {
        //For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000)_0.08),
        //and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) _ 0.12)
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi iznos poklona: ");
        int iznos = sc.nextInt();
        double tax = 0;
        if (iznos >= 5000 && iznos < 25000) {
            tax = 100 + (iznos - 5000) * 0.08;
            System.out.println("tax iznosi " + tax);
        } else if (iznos >= 25000 && iznos < 55000) {
            tax = 1700 + (iznos - 25000) * 0.10;
            System.out.println("tax iznosi " + tax);
        } else if (iznos >= 55000 ) {
            tax = 4700 + (iznos - 55000) * 0.12;
            System.out.println("tax iznosi " + tax);
        }else{
            System.out.println("nema poreza");
        }


        }

    }
