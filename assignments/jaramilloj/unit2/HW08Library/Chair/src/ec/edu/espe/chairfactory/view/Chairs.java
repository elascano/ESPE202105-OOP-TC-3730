/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chairfactory.view;
import com.google.gson.Gson;
//import ec.edu.espe.chairsFactory.ChairFactory;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.chairfactory.ChairFactory;
import java.io.IOException;
import ec.edu.espe.chairfactory.ChairFactory;


//import java.io.FileWriter;
/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Chairs {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException {
        
         System.out.println("LibraryChair-");
       float weightCapacity = 42.0F;
       float peso = 127.0F;
       float cointaind =0.0F;
       
        String files  = null;
        String creates  = null;
        String save = null;
        
       System.out.println("the impression of the functions created in the library are ->" );
       
       
       Gson gson = new Gson();
            System.out.println("contains material compositions and returns data of type String");
            
            System.out.println("code to create layout and return data of type String");
            
            System.out.println(" color of the chair");
            
            
            System.out.println("enter the number of people capacity that the chair supports");
            
            
            ChairFactory chair = new ChairFactory();
            String ChairDataJson = gson.toJson(chair);
            
            FileManager.save("./files/Chair.json",ChairDataJson);
                        
            
            
        
            
           
        
        
    }
       
       
       
       
       
   
     
     
     
     
     
     
     
     
            
            
        
            
           
    }
     

 