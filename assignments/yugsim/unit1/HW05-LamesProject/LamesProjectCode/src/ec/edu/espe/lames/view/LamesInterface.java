/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.view;

import ec.edu.espe.lames.model.*;
/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class LamesInterface {
    
    public static void main(String[] args) {
        System1 system1 = new System1();
        People people = new People();
        Circuit circuit = new Circuit();
        Owner owner = new Owner();
        ElectronicMaterial electronicmaterial = new ElectronicMaterial();
        
        System.out.println("HW05 - Lames Project, \n"
                        + "Pamela Yugsi");
        
        system1.setAdaptable(true);
        system1.setCapacity(100.0F);
        
        System.out.println("system1 -> " + system1);
        
        people.setAge(54);
        people.setGender("Female");
        people.setLastName("Carapaz");
        people.setName("Nayely");
        
        System.out.println("people -> " + people);
        
        circuit.setCost(54000.57F);
        circuit.setElements("Protoboard");
        circuit.setSize(9.45F);
        
        System.out.println("circuit -> " + circuit);
        
        owner.setAge(45);
        owner.setGender("Male");
        owner.setLastName("Tandazo");
        owner.setName("Oscar");
        
        System.out.println("owner -> " + owner);
        
        electronicmaterial.setColor("Rojo");
        electronicmaterial.setCost(0.85F);
        electronicmaterial.setName("Protoboard");
        electronicmaterial.setTypeOfMaterial("Plastic");
        
        System.out.println("electronicmaterial -> " + electronicmaterial);
        
    }
}
