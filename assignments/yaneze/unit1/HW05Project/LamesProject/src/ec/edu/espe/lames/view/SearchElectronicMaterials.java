/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.view;

import ec.edu.espe.lames.model.ElectronicMaterial;
import ec.edu.espe.lames.model.Interface;
import ec.edu.espe.lames.model.Product;
import ec.edu.espe.lames.model.Program;
import ec.edu.espe.lames.model.User;



/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class SearchElectronicMaterials {
    public static void main(String[] args) {
        ElectronicMaterial electronicmaterial = new ElectronicMaterial();
        Interface inter = new Interface();
        Product product = new Product();
        Program program = new Program();
        User user = new User();
        
        electronicmaterial.setName("Arduino");
        electronicmaterial.setFabricator("Arduino");
        electronicmaterial.setDescription("This is a description of Arduino");
        electronicmaterial.setCost(9.99f);
        electronicmaterial.setAvailable(true);
        
        user.setName("Erick");
        user.setLastName("Yánez");
        user.setSearch("Arduinos");
        
        product.setName("Arduinos");
        product.setSpecification("Specification from Arduino");
        product.setCost(9.99f);
        
        program.setName("Searcher for Electronic Materials Program");
        program.setNumberOfMaterials(1000);
        
        inter.setName("Console Interface");
        
        System.out.println("HELLO FROM SEARCH OF ELECTRONIC MATERIALS\nErick Yánez\n");
        System.out.println("Interface " + inter);
        System.out.println("Program " + program);
        System.out.println("The electronic material is: " + electronicmaterial);
        System.out.println("User: " + user);
        System.out.println("Product " + product);
        
    }
}