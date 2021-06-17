/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regular_pyramid_calculations;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Estefania
 */
public class Regular_pyramid_calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entry=new Scanner (System.in);
        
        float base, lado,Ab, Al, h, apb, apl, perimetro, area, volumen;
        
        System.out.println(" Andrea Quichimbo, HW03: JAVA Syntax and Netbeans");
        System.out.println("Calculos de una pirámide triangular");
        
        System.out.println("Ingrese la base");
        base=entry.nextFloat();
        
        System.out.println("Ingrese el lado ");
        lado=entry.nextFloat();
        
        System.out.println("Ingrese la altura ");
        h=entry.nextFloat();
        
        System.out.println("Perimetro");
        perimetro=(base*4)+(lado*4);
        
        System.out.println("El perímetro de la pirámide regular es:"+perimetro);
        
        System.out.println("Area");
        Ab=(float) (Math.pow(base, 2));
        apb=(base/2);
        double aph = sqrt(Math.pow(h, 2))+Math.pow(apb, 2);
        Al=(float) ((base*aph)/2);
        area= Al+Ab;
       
        System.out.println("El area de la pirámide regular es:"+area);
        
        System.out.println("Volumen");
        volumen=(Ab*h)/3;
        
        System.out.println("El volumen de la pirámide regular es:"+volumen);
  
    }
    
}
