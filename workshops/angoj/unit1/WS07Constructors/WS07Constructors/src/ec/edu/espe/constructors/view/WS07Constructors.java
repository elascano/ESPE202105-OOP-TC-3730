/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructors.view;
import ec.edu.espe.constructors.model.Files;
/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class WS07Constructors {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Files files = new Files ("words", "javier","12mb"); 
       System.out.println(files);
       
        
    }
    
}
