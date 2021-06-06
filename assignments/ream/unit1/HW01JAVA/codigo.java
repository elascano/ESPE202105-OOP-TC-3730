package hw01.operation;

import java.util.Scanner;

/**
 *
 * @author REA MISHEL
 */
public class HW01OPERATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println("H-E-L-L-O");
            System.out.println("MY NAME IS REA MISHEL");
            System.out.println("CHOOSE AN OPTION FROM THE MENU");
            System.out.println("====== Calculator ======");
            System.out.println("1. -> Tabla of multiplication of number 6");
            System.out.println("2. -> downward collation from 20 to 5");
            System.out.println("3. -> Exit");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int top = 12;
                    int product = 0;
                    int table = 6;
                    for (int j = 0; j <= top; j++) {
                        product = table * j;
                        System.out.println("The table of multiplication of number 6 is");
                        System.out.println("6 *" + j + " = " + product);
                    }

                    break;
                case 2:

                    System.out.println("downward collation from 20 to 5");
                    int star = 20;
                    int stop = 5;
                    for (int j = 20; j >= stop; j--) {
                        System.out.println(j);
                    }

                case 3:
                    System.out.println("B-Y-E=U-S-E-R");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }
}