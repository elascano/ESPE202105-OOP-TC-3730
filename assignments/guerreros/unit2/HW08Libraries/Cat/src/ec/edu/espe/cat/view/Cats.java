/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cat.view;
import ec.edu.espe.catManager.CatManager;
import java.io.IOException;


/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Cats {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Cats Library- Stefany Guerrero");
     String name = null;
     String color = null;
     int age=0;
     Float stature= 0.0F;
     String breed = null;  
        
     
     
     CatManager.enter(name, color, breed, age, stature);
     CatManager.indicate(name, color, breed, age, stature);
     CatManager.search(name, color, breed, age, stature);
     
     
     
     
     
     
     
        
        
    }
    
}
