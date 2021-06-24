/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cayambe_1;

import static java.lang.Math.pow;

/**
 *
 * @author user
 */
public class Cayambe_1 {
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double number;
      number=59;
      int copy;
      double binary=0;
      double octal=0;
      int residue=0;
      double i=0;
      String hexa="";
      String Hexadecimalcharacters = "0123456789abcdef";
      copy=(int) number;
      
      if (number>=0){
          /*Transformation from decimal to binary*/
          while(copy>0){
          residue=copy%2;
          binary=binary+residue*pow(10,i);
          i++;
          copy=copy/2;
          }
          
          /*Transformation from decimal to octal*/
          copy=(int) number;
          residue=0;
          i=0;
          while(copy>0){
          residue=copy%8;
          octal=octal+residue*pow(10,i);
          i++;
          copy=copy/8;
          }
          
          /*Transformation from decimal to hexadecimal*/
          copy=(int) number;
          residue=0;
          i=0;
          while(copy>0){
          residue=copy%16;
          hexa=Hexadecimalcharacters.charAt(residue) + hexa;
          copy=copy/16;
          }
          
          System.out.println("The decimal number: "+(int) number);
          System.out.println("Binary transformation: "+(int) binary);
          System.out.println("Octal transformation : "+(int) octal);
          System.out.println("Binary tansformation binary: "+hexa);
      }
      else{ 
          System.out.println("Introduce a positive value");
      }
      
    }


}
