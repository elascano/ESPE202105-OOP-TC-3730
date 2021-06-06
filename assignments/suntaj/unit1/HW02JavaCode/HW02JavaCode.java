
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ALEJANDRO
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int horasTotales, semanas,dias,horas;
        
        System.out.print("Enter the time to Calculate:");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 /24;
        horas = horasTotales%24;
        
        System.out.println("\n Your result is:");
        System.out.println("Weeks:"+semanas);
        System.out.println("Days:"+dias);
        System.out.println("Hours:"+horas);
        
        
        
        
        
        
    }
    
}
