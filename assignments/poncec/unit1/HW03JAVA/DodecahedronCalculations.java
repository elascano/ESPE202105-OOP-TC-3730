/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodecahedron.calculations;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author camil
 */
public class DodecahedronCalculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada=new Scanner(System.in);
        
        float side,apotema,perimeter,area,volumen;
        System.out.println("Camilo Ponce, HW03: JAVA Syntax and netbeans");     
     System.out.println("\t\tCalculations of a dodecahedron");
     
        System.out.println("Write the length of the side of the dodecahedron:");
          side = entrada.nextFloat();    
          apotema=(side/1.45f);
          
          System.out.println("Perimeter:");
          perimeter=side*30;
          System.out.println("\tThe perimeter of the dodecahedron is:"+perimeter);
         
          System.out.println("Area:");
          area= 30*side*apotema;
          System.out.println("\tThe area of the dodecahedron is:"+area); 
          
          System.out.println("Volume:");
          volumen=(float) (((15+7*sqrt(5))* Math.pow(side,3))/4);
          System.out.println("\tThe volume of the dodecahedorn is:"+volumen);
    }
    
}
