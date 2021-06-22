/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.*;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class SystemDisplay {
    public static void main(String[] args) {
        System.out.println("Hello from System Display");
        
        ElectronicMaterial electronicMaterial = new ElectronicMaterial();
        Files files = new Files();
        Information information = new Information();
        Program program = new Program();
        User user = new User();
        
        electronicMaterial.setName(" LEDs");
        electronicMaterial.setCost((float)0.50);
        electronicMaterial.setMaterial(" plastic");
        electronicMaterial.setCharacteristics(" Light-emitting diode that lights "
                + "up when electricity passes through it.");
        
        
        information.setName(" protoboard");
        information.setDescriptionOfMaterials("One breadboard with 30 rows "
                + "10 columns and two pairs of rails");
        information.setSize(" small");
        
        user.setName(" Leslie");
        user.setLastname(" Titoaña");
        user.setAge(19);
        
        program.setName(" Search Materials");
        program.setNumberOfMaterials(105);
        program.setCodeOfMaterial("056");
        
        files.setBestMaterial("multimeter");
        files.setName("Basic Materials");
      
        
        
        System.out.println("Electronic Materials → " +electronicMaterial);
        System.out.println("Information of material → " + information);
        System.out.println("User → " + user);
        System.out.println("Program → " +program);
        System.out.println("Files → " +files);
        
       
    }
    
}
