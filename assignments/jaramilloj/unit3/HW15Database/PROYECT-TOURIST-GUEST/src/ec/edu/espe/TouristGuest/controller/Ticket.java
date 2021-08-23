
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.controller;
/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Ticket {
      private double destination;
      private float discount;
      private int clas;
    
    private static float discountStudent = 50.0F;
    
        public static float  discount(float type) {
        float discountType= type * discountStudent/100;
        return discountType;
    
    }
   
   public static double ticketCost(double Destino,int clas ){
     
       double totalTicket;
       totalTicket= (Destino + clas + discount(discountStudent) );
        return totalTicket;
   
   }

      
      
    
       
    
    
}
