/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

import java.util.Scanner;

/**
 *
 * @author Stefany Guerrero ESPE-DCCO
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        float radio, varArea, varPerimeter, varDiameter;
        Circulo cir= new Circulo();
        Scanner sca=new Scanner(System.in);
        System.out.println("Tell me the radius of the circle");
        radio =sca.nextFloat();
        varArea=cir.area(radio);
        varPerimeter=cir.perimeter(radio);
        varDiameter=cir.diameter(radio);
        
        System.out.println("circle with radio: "+radio+"\n The area is:"+varArea+"\n The perimeter is: "+varPerimeter+"\n the diameter is:"+varDiameter);
        
        
        
    }
     public float area(float radio)
    { float result= (float)(2*Math.PI*radio);
      return result;
    }
    
     
     public float perimeter(float radio)
    { float result= (float)(Math.PI*(radio*radio));
      return result;
    }
     
     
     public float diameter(float radio)
     { float result= (float)((2*radio));
       return result;
        
     }
}

    
