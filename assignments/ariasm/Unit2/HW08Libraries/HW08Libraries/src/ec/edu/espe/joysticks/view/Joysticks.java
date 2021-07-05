/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.joysticks.view;

import ec.edu.espe.joysticks.*;
import java.io.IOException;

/**
 *
 * @author Marco Arias SkyNet.hub ESPE-DCCO
 */
public class Joysticks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("JOYSTICK LIBRARY - Gabriel Aguirre, Johny Ango , Marco Arias");
        int unit = 0;
        String trademark = null;
        String color = null;
        boolean ergonomic = false;
        boolean wireless = false;

        Joystick.Joystick(unit, trademark, color, ergonomic, wireless);
        Joystick.find(unit, trademark, color, ergonomic, wireless);
    }

}
