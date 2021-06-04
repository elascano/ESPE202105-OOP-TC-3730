/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgjh;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Kerly
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initialValue;
        int option;
        double res;
        double res1;
        double res2;
        double res3;
        double res4;
        System.out.println("Kerly Mosquera,HW03: Java Syntax ");
        System.out.println("——–MENU——–");
        System.out.println(" Type a number according to the measure you want to convert:");
        System.out.println("1.- MILIMETERS");
        System.out.println("2.- CENTIMETERS");
        System.out.println("3.- INCHES");
        System.out.println("4.- YARDS");
        System.out.println("5.- KILOMETRES");
        System.out.println("\n");
        option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("MEASUREMENTS IN MILLIMETERS");
                System.out.println("ENTER THE VALUE");
                initialValue = input.nextInt();
                res1 = convertMmToCm(initialValue);
                res2 = initialValue * 0.000001;
                res3 = initialValue * 0.03937;
                res4 = initialValue * 0.00109361;
                System.out.println("THE RESULT IS: " + res1 + " CENTIMETERS");
                System.out.println("THE RESULT IS: " + res2 + " KILOMETRES");
                System.out.println("THE RESULT IS: " + res3 + " INCHES");
                System.out.println("THE RESULT IS: " + res4 + " YARDS");
                break;
            case 2:
                System.out.println("MEASUREMENTS IN CENTIMETERS");
                System.out.println("ENTER THE VALUE");
                initialValue = input.nextInt();
                res1 = initialValue * 10.0;
                res2 = initialValue / 100.000;
                res3 = initialValue * 0.393701;
                res4 = initialValue * 0.0109361;
                System.out.println("THE RESULT IS: " + res1 + " MILLIMETERS");
                System.out.println("THE RESULT IS: " + res2 + " KILOMETRES");
                System.out.println("THE RESULT IS: " + res3 + " INCHES");
                System.out.println("THE RESULT IS: " + res4 + " YARDS"
                        + "");
                break;
            case 3:
                System.out.println("MEASUREMENTS IN INCHES");
                System.out.println("ENTER THE VALUE");
                initialValue = input.nextInt();
                res1 = initialValue * 2.54;
                res2 = initialValue * 0.0000254;
                res3 = initialValue * 25.4;
                res4 = initialValue * 0.0277778;
                System.out.println("THE RESULT IS: " + res1 + " CENTIMETERS");
                System.out.println("THE RESULT IS: " + res2 + " KILOMETRES");
                System.out.println("THE RESULT IS: " + res3 + " MILLIMETERS");
                System.out.println("THE RESULT IS: " + res4 + " YARDS");
                break;
            case 4:
                System.out.println("MEASUREMENTS IN YARDS");
                System.out.println("ENTER THE VALUE");
                initialValue = input.nextInt();
                res1 = initialValue * 91.44;
                res2 = initialValue * 0.0009144;
                res3 = initialValue * 36;
                res4 = initialValue * 914.4;
                System.out.println("THE RESULT IS: " + res1 + " CENTIMETERS");
                System.out.println("THE RESULT IS: " + res2 + " KILOMETRES");
                System.out.println("THE RESULT IS: " + res3 + " INCHES");
                System.out.println("THE RESULT IS: " + res4 + " MILLIMETERS");
                break;
            case 5:
                System.out.println("MEASUREMENTS IN KILOMETRES");
                System.out.println("ENTER THE VALUE");
                initialValue = input.nextInt();
                res1 = initialValue * 100000;
                res2 = initialValue * 1000000;
                res3 = initialValue * 39370.0792;
                res4 = initialValue * 0193.6133;
                System.out.println("THE RESULT IS: " + res1 + " CENTIMETERS");
                System.out.println("THE RESULT IS: " + res2 + " MILLIMETERS");
                System.out.println("THE RESULT IS: " + res3 + " INCHES");
                System.out.println("THE RESULT IS: " + res4 + " YARDS");
                break;
        }
    }

    private static double convertMmToCm(int initialValue) {
        double res1;
        res1 = initialValue * 0.1;
        return res1;
    }
}

