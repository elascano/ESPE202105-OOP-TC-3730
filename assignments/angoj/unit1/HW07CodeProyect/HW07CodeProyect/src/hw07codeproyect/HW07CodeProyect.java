/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw07codeproyect;
import ec.edu.espe.skynet.model.*;
/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class HW07CodeProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lines list = new Lines();
        programing search = new programing ();
        code lines = new code ();
        
   
        
        list.setI(18);
        search.setA(200);
        search.setB(1);
        lines.setA(30);
      
      
        System.out.println("Hello From System Display, \n"+"Johny Ango");
        
        System.out.println("list->"+list.getI());
        System.out.println("serch->"+search.getA());
        System.out.println("search->"+search.getB());
        System.out.println("lines->"+lines.getA());
    }
    
}
