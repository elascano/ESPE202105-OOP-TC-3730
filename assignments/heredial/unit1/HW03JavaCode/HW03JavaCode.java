/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("LUIS ALBERTO HEREDIA IZA NRC 3730");
        System.out.println("\n");
        System.out.println("Hello please enter the required values ");
        
   
        {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input resistor 1 capacity");
        float Resistor1 = input.nextInt();
        System.out.println("Input resistor 2 capacity");
        float Resistor2 = input.nextInt();
        System.out.println("Input resistor 3 capacity");
        float Resistor3 = input.nextInt();
        System.out.println("Input Voltage ")
        float Voltage = input.nextInt();
        float TotalResistor = Resistor1 + Resistor2 + Resistor3; 
        float TotalCurrent = Voltage / TotalResistor ;
        float Voltage1 = TotalCurrent * Resistor1;
        float Voltage2 = TotalCurrent * Resistor2;
        float Voltage3 = TotalCurrent * Resistor3;
        
        System.out.println("Resistor 1 has a capacity of " + Resistor1 + " Ω (Ohms)");
        System.out.println("Resistor 2 has a capacity of " + Resistor2 + " Ω (Ohms)");
        System.out.println("Resistor 3 has a capacity of " + Resistor3 + " Ω 0(Ohms)");
        System.out.println("The Total Resistor of the series circuit is " + TotalResistor + " Ω (Ohms)");
        System.out.println("The Voltage is =  " + Voltage + "  Volts");
        System.out.println("The Total Current is the Circuit is " + TotalCurrent +  " A (amps)");
        System.out.println("Being a Series circuit, the current is the same at all points");
        System.out.println("Voltage at the first point is " + Voltage1 + " Volts")
        System.out.println("Voltage at the second point is " + Voltage2 + " Volts")
        System.out.println("Voltage at the third ponit " + Voltage3 + " Volts")
                
       
                
    }
    
}
