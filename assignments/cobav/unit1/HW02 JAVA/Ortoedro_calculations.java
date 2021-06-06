/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ortoedro_calculations;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Vctor
 */
public class Ortoedro_calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner entry=new Scanner (System.in);
        
        float  lado1 , lado2 , lado3, perimetro, area, volumen;
        
        System.out.println(" Victor Coba, HW03: JAVA Syntax and Netbeans");
        System.out.println("Calculos de un ortoedro");
        
        System.out.println("Ingrese lado 1:");
        lado1=entry.nextFloat();
        
        System.out.println("Ingrese lado 2:");
        lado2=entry.nextFloat();
        
        System.out.println("Ingrese lado 3:");
        lado3=entry.nextFloat();
        
        System.out.println("Perimetro");
        perimetro=(lado1*4)+(lado2*4)+(lado3*4);
        
        System.out.println("El perímetro del octaedro es:"+perimetro);
        
        System.out.println("Area");
        area=(lado1*lado2)+(lado1*lado3)+(lado2*lado3);
        
        System.out.println("El area del octaedro es:"+area);
        
        System.out.println("Volumen");
        volumen = lado2*lado1*lado3;
        
        System.out.println("El volumen del octaedro es:"+volumen);
    }
    
}
