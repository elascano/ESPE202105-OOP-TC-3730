/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws01.menu;

import java.util.Scanner;

/**
 *
 * @author REA MISHEL 
 */
public class WS01MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        {
            System.out.println("H-E-L-LO");
            System.out.println("My name is Rea Mishel");
            System.out.println("MENU");
            System.out.println("1. -> SUM OF ELEMENTS OF AN ARRANGEMENT OF 5");
            System.out.println("2. -> AVERAGE OF 3 ELEMENTS OF AN ARRANGEMENT OF FLOATS");
            System.out.println("3. -> TNUMBER FINDER IN A MATRIX");
            System.out.println("4. -> EXIT");
            option = input.nextInt();

            switch (option) {

                case 1:

                    int[] arreglo = new int[5];
                    for (int i = 0; i < 5; i++) {
                        arreglo[i] = i + 1;
                    }
                    int Number1;
                    int Number2;
                    int Number3;
                    int Number4;
                    int Number5;
                    int TotalSum;

                    System.out.println("enter Number1 -> ");
                    Number1 = input.nextInt();
                    System.out.println("enter Number2-> ");
                    Number2 = input.nextInt();
                    System.out.println("enter Number3 -> ");
                    Number3 = input.nextInt();
                    System.out.println("enter Number4 -> ");
                    Number4 = input.nextInt();
                    System.out.println("enter Number5 -> ");
                    Number5 = input.nextInt();
                    TotalSum = Number1 + Number2 + Number3 + Number4 + Number5;
                    System.out.println("The total of the sum  is -->" + TotalSum);
                    break;

                case 2:

                    int n;
                    int s = 0;
                    int x;
                    double p;

                    System.out.println("ENTER THE ELEMENTS -> ");
                    n = input.nextInt();

                    for (int i = 1; i <= n; i++) {
                        System.out.println("NUMBER ");
                        x = input.nextInt();
                        s = s + x;
                    }
                    p = s / n;

                    System.out.println("THE AVERAGE IS:" + p);
                    break;

                case 3:
                    int[] nums = new int[7];
                    nums[0] = 12;
                    nums[1] = 23;
                    nums[2] = 34;
                    nums[3] = 98;
                    nums[4] = 87;
                    nums[5] = 65;
                    nums[6] = 0;
                    int pos = -1;

                    System.out.println("ENTER THE NUMBER");
                    int r = input.nextInt();
                    for (int i = 0; i < nums.length; i++) {
                        if (nums[i] == r) {
                            pos = i;

                        }
                    }

                    if (pos == -1) {
                        System.out.println("ERROR");
                    } else {
                        System.out.println("THE POSITION OF " + r + " IS: " + pos);

                    }
            }
        }

    }
}