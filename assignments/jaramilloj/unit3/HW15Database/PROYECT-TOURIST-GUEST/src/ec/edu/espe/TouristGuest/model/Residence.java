/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

/**
 *
 * @author JARAMILLO JEAN CODEC OPP-ESPE
 */
public class Residence {
    
      private float costOfAcommodation;
      private float feedingCost;
      private float tourismCost;
      
      public static float costOfResidence(float costOfAcommodation, float feedingCost, float tourismCost){
          float costTotalResicence;
          costTotalResicence = costOfAcommodation + feedingCost + tourismCost;
          return costTotalResicence;
      }
      
      
      
      }
      
    

