/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

import ec.edu.espe.computer.*;
import java.io.IOException;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Computers {
    public static void main(String[] args) throws IOException {
       
        
        System.out.println("COMPUTERDATA LIBRARY - Alina, Erick, MP");
        
        String brand = null;
        String color = null;
        float cost = 0;
        String processor = null;
        int ram = 0;
       
        Computer.Computer(brand, color, cost, processor, ram);
        Computer.find(brand, color, cost, processor, ram);
    }
    
}
        