/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chairfactory;



/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class ChairFactory {
    
  public static String file(String composition){
      //TODO code to file compositions and returns data of type String
      String files;
              files =  "wood"+"plastic"+"iron" ;
     return "0";
  }
  public static String creates(String design ){
      //TODO code to create  design and return data of type String
      String creates;
              creates = "iconic"+"Thonet"+"hilleHouse";
      return "1";
  }  
    
  private static String save(String colorCombination){
      String save;
       save = "geen"+"black"+"yellow";
     return"2";
  }
     
  private static float peso = 127.0F ;
  
  private static float contains(float weightCapacity){
     //TODO code to contain data of type int weight Capacity and returns data of type int
     float cointaind;
             cointaind = weightCapacity + peso;
     return 3; 
     
  }

    

    

   

    

    

   
   
  
  
  
  
    
}
