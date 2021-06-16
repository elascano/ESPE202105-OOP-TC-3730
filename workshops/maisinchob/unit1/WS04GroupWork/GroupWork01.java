/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.work.pkg01;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class GroupWork01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float basic = 0;
        float exceso = 0;
        double taxT;
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Welcome to SRI ");
        System.out.println();
        System.out.println("Names'group ");
        System.out.println("Johny Ango,Kevin Barrera,Cadena Roman,Marlon Ortiz,Maisincho Bryan,Taco Lizeth ");
        System.out.println("Criollo Kevin, Villavicencio Alina, Andrea quichimbo, Luis Heredia,Chiliquinga Bryan,Cristother Sarmiento");
        System.out.println();
        System.out.println("Ingrese valor: ");
        basic = keyboardinput.nextFloat();
        taxT = computeIncometax(basic);
        System.out.println("El impuesto a pagar es: " + taxT + "USD");

    }

    public static double computeIncometax(float fBasic) {
        double tax = 0;
        float exceso = 0;

        if (fBasic >= 0 && fBasic <= 11212) {
            tax = 0;
        } else {
            if (fBasic >= 11212 && fBasic <= 14285) {
                tax = 0;
                exceso = fBasic - 11212;
                tax = tax + (exceso * 0.05);
            } else {
                if (fBasic >= 14285 && fBasic <= 17854) {
                    tax = 154;
                    exceso = fBasic - 14285;
                    tax = tax + (exceso * 0.1);
                } else {
                    if (fBasic >= 17854 && fBasic <= 21442) {
                        tax = 511;
                        exceso = fBasic - 17854;
                        tax = tax + (exceso * 0.12);
                    } else {
                        if (fBasic >= 21442 && fBasic <= 42874) {
                            tax = 941;
                            exceso = fBasic - 21442;
                            tax = tax + (exceso * 0.15);
                        } else {
                            if (fBasic >= 42874 && fBasic <= 64297) {
                                tax = 4156;
                                exceso = fBasic - 42874;
                                tax = tax + (exceso * 0.2);
                            } else {
                                if (fBasic >= 64297 && fBasic <= 85729) {
                                    tax = 8440;
                                    exceso = fBasic - 64297;
                                    tax = tax + (exceso * 0.25);
                                } else {
                                    if (fBasic >= 85729 && fBasic <= 114288) {
                                        tax = 13798;
                                        exceso = fBasic - 85729;
                                        tax = tax + (exceso * 0.3);
                                    } else {
                                        if (fBasic >= 114288) {
                                            tax = 22366;
                                            exceso = fBasic - 114288;
                                            tax = tax + (exceso * 0.35);
                                        } else {

                                        }
                                    }

                                }
                            }

                        }
                    }

                }

            }
        }
        return tax;
    }

}
