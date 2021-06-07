/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese Valor a Cancelar");
        float baseimponible = read.nextInt();
        
        if (baseimponible >= 0 &&  baseimponible < 11212){
            System.out.println("Adeuda " + baseimponible);
            
        }else if(baseimponible >= 11212 && baseimponible < 14285 ){
         
            float exceso =  baseimponible - 11212; 
                    float valorapagar = exceso * 5 /100;
                    
            System.out.println("Adeuda " + valorapagar);        
        }else if(baseimponible >= 14285 && baseimponible  < 17854 ){
         
            float fexcedente = baseimponible - 14285 ;
                    float pfexcedente = fexcedente * 10 /100;
                    float valorpagar = pfexcedente + 154   ;      
                            
            System.out.println("Adeuda " + valorpagar ); 
            
        }else if(baseimponible >= 17854 && baseimponible  < 21442 ){
         
            float fexcedente = baseimponible - 17854 ;
                    float pfexcedente = fexcedente * 12 /100;
                    float valorpagar = pfexcedente + 511   ;      
                            
            System.out.println("Adeuda " + valorpagar ); 
             
        }else if(baseimponible >= 21442 && baseimponible  < 42874 ){
         
            float fexcedente = baseimponible - 21442 ;
                    float pfexcedente = fexcedente * 15 /100;
                    float valorpagar = pfexcedente + 941   ;      
                            
            System.out.println("Adeuda " + valorpagar ); 
            
        }else if(baseimponible >= 42874 && baseimponible  < 64297 ){
         
            float fexcedente = baseimponible - 42874 ;
                    float pfexcedente = fexcedente * 20 /100;
                    float valorpagar = pfexcedente + 4156   ;      
                            
            System.out.println("Adeuda " + valorpagar ); 
            
        }else if(baseimponible >= 64297 && baseimponible  < 85729 ){
         
            float fexcedente = baseimponible - 64297 ;
                    float pfexcedente = fexcedente * 25 /100;
                    float valorpagar = pfexcedente + 8440   ;      
                            
            System.out.println("Adeuda " + valorpagar ); 
            
        }else if(baseimponible >= 85729 && baseimponible  < 114288 ){
         
            float fexcedente = baseimponible - 85729 ;
                    float pfexcedente = fexcedente * 30 /100;
                    float valorpagar = pfexcedente + 13798  ;      
                            
            System.out.println("Adeuda " + valorpagar );   
           
        }else if(baseimponible >= 114288){
         
            float fexcedente = baseimponible - 114288 ;
                    float pfexcedente = fexcedente * 35 /100;
                    float valorpagar = pfexcedente + 22366;
                           
                            
            System.out.println("Adeuda " + valorpagar );   
    }
        

        
   
        
          
     
        
        
        
        
        
    }
    

