/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        double Ab;
        int altura;
        double volume;
        int radius;
        double area;
        int options;
        Scanner read = new Scanner(System.in);
        
        System.out.println("OPTIONS");
        System.out.println("1. Calculate Base Area");
        System.out.println("2. Calculate Volume");
        System.out.println("3. Calculate Area");
        System.out.println("Choose the Option");
        options=read.nextInt();
        System.out.println();
        
        switch(options){
            case 1: 
        System.out.println("Calculation of the base area of a Cylinder");
        System.out.println();
        System.out.println("Enter Radius");
        radius=read.nextInt();
        Ab=(3.14)*radius*radius;
        System.out.println("The Base Area is :"+Ab);
        break;
        
            case 2:
        System.out.println("Calculation of the volume of a Cylinder");
        System.out.println();
        System.out.println(" Enter Base Area of the Cylinder : ");
        Ab=read.nextInt();
        System.out.println("Enter Height of the Cylinder: ");
        altura=read.nextInt();
        volume= Ab*altura;
        System.out.println("The Volume is  : "+volume);
        break;
        
            case 3:
        System.out.println("Calculation of the Area of a Cylinder");
        System.out.println();
        System.out.println("Enter the height of the Cylinder ");
        altura=read.nextInt();
        System.out.println("Enter Radius ");
        radius=read.nextInt();
        area= (2*radius*3.14)* (altura+radius);
        System.out.println("The Area is  : "+area);
        break;
        
            default: System.out.println("OPTION NOT VALID");
        }
      
   
    }
    
    
}
