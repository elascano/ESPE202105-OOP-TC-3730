/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ball.view;

import ec.edu.espe.balls.Ball;
import java.util.Scanner;

/**
 *
 * @author Fernanda Cadena Team of machine ESPE-DCCO
 */
public class Balls {

    public static void main(String[] args) {
        
        float ballRadio;
        float radio;
        float ballWeight;
        float weight;
        Scanner read = new Scanner(System.in);
        int optionMenu;
        // TODO code application logic here
        System.out.println("Ball system");
        do {
            System.out.println("1.- Radio");
            System.out.println("2.- weight");
            System.out.println("3.- exit");

            System.out.println("Choose the option: ");
            optionMenu = read.nextInt();
            
            switch (optionMenu) {
                case 1:
                    System.out.println("Write radio of the ball: ");
                    radio = read.nextFloat();
                    ballRadio = Ball.getRadio(radio);
                    System.out.println("radio: " + ballRadio);
                    break;

                case 2:
                    System.out.println("Write weight ");
                    weight = read.nextFloat();
                    ballWeight = Ball.getWeight(weight);
                    System.out.println("" + ballWeight);
                    break;

                case 3:
                    System.out.println("Exit of system");
                    break;

                default:
                    System.out.println("option not valid..!");
            }
        } while (optionMenu != 3);
    }
}
