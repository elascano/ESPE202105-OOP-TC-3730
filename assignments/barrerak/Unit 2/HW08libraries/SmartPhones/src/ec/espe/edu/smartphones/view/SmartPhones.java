/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.smartphones.view;

import ec.edu.espe.smartphonesLibrary.SmartPhoneManager;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class SmartPhones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje = "";
        int number = 0;
        String valid;
        boolean valid1 = true;
        Scanner read = new Scanner(System.in);
        int optionMenu;
        int numberop;
        int numberop1;
        int numberop2;
        String message1;
        System.out.println("Welcome to Smatphone system");
        do {
            System.out.println("1.- msm");
            System.out.println("2.- call");
            System.out.println("3.- exit");

            System.out.println("Choose the option: ");
            optionMenu = read.nextInt();
            switch (optionMenu) {
                case 1:
                    System.out.println("Introduce number of the Smartphone: ");
                    numberop = read.nextInt();
                    System.out.println("Introduce the message ");
                    message1 = read.next();
                    valid = SmartPhoneManager.sendMessage(message1, numberop);
                    System.out.println("" + valid);
                    break;
                case 2:
                    System.out.println("Introduce number of the Smartphone: ");
                    numberop2 = read.nextInt();
                    valid = SmartPhoneManager.call(numberop2);
                    System.out.println("" + valid);

                    break;

                case 3:
                    System.out.println("Exit of system");
                    break;

                default:
                    System.out.println("option not valid...!!!");
            }
        } while (optionMenu != 3);

    }

}
