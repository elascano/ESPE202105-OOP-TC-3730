/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

import ec.edu.associations.model.*;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class SystemDysplay {
    public static void main(String[] args) {
        ElectronicMaterial electronicMaterial= new ElectronicMaterial();
        Information information= new Information();
        Program program= new Program();
        Scheme scheme= new Scheme();
        User user= new User();
        
    System.out.println ("From Program Diagram to Code, \n"
            + "Alina Villavicencio");
    
    electronicMaterial.setName("Resistor");
    information.setCharacteristicsOfMaterials("The resistance tolerance is the maximum error whit wich it is manufactures, it can be 5% or 10%");
    information.setCost(0.15F);
    information.setMaterialFunction("Material that opposes the flow of electrons");
    information.setColorOfMaterial("It varies according to the value that is needed");
    program.setName("Electronic materials search");
    program.setNumberOfMaterials(10);
    program.setInformation("We have a wide variety of materials which you want to choose");
    scheme.setGoodSpeed(true);
    scheme.setDesign("Easy for a beginner user");
    scheme.setName("Electronic Materials");
    user.setName("Alina");
    user.setLastName("Villavicencio");
    user.setCity("Quito");
    
    
        System.out.println("electronicMaterial ->" +electronicMaterial);
        System.out.println("information ->" +information);
        System.out.println("program ->" +program);
        System.out.println("scheme ->" +scheme);
        System.out.println("user ->" +user);
    }
}
