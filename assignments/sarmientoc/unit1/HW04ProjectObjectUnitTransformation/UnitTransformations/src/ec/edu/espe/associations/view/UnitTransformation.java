/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.*;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class UnitTransformation {
    public static void main(String[] args) {
       
       
        Systemm system = new Systemm();
        Program program = new Program();
        Data data = new Data();
        Units units = new Units();
        Mass mass = new Mass();
        Volume volume = new Volume();
        Lenght lenght = new Lenght();
 
        
       System.out.println("Hello From Unit Transformation");
       
        system.setSystemm("Windows10-Cristopher Sarmiento");
        program.setProgram("Unit Transformation");
        data.setData("Calcular Unidades");
        units.setUnits("Mass-Volume-Lenght");
        mass.setMass(50);
        volume.setVolume(50);
        lenght.setLenght(10);
        
    
        System.out.println("system -> " + system);
        System.out.println("program -> " + program);
        System.out.println("data -> " + data);
        System.out.println("units -> " + units);
        System.out.println("mass -> " + mass);
        System.out.println("volume -> " + volume);
        System.out.println("lenght -> " + lenght);
        
       
    }
}
