/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07constructors;
import ec.edu.espe.contructors.model.Registry;
/**
 *
 * @author Victor Coba Beta Software ESPE-DCCD
 */
public class WS07Constructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Registry registry = new Registry ("Monday", "4:20","profesional"); 
       System.out.println(registry);
    }
    
}
