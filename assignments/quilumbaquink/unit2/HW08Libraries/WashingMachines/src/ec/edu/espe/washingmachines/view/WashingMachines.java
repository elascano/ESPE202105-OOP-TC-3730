/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.washingmachines.view;



import java.util.Scanner;
import ec.edu.espe.washingmachine.WashingMachine;


/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class WashingMachines {
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.println("\n 1. Remojar ");
        System.out.println("\n 2. Lavar ");
        System.out.println("\n 3. Exprimir ");
        System.out.println("Ingrese una opcion : ");
        int opcion=read.nextInt();
        switch(opcion)
        {
            case 1: System.out.println("Ingrese el peso que va a lavar : ");
                    float capacidad= read.nextFloat ();
                    System.out.println("Ingrese el nivel de agua  (Alto,Normal,Mínimo o Intermedio): ");
                    String niveldeagua= read.next();
                    System.out.println("Ingrese el tipo de lavado(blanca,color,delicada,edredones,jeans):");
                    String tipodelavado=read.next();
                    System.out.println("Ingrese el tiempo de remojo (30,45,60):");
                    int temporizador=read.nextInt();
                    String remojado=WashingMachine.remojar(capacidad,niveldeagua,temporizador,tipodelavado);
                    System.out.println("Está "+ remojado +"tipo"+tipodelavado+",un peso de "+capacidad+"con un nivel de agua"+niveldeagua+"se tardará"+temporizador+"minutos");
            
            break;
            case 2:System.out.println("Ingrese el peso que va a lavar : ");
                    float capacidad1= read.nextFloat ();
                    System.out.println("Ingrese el nivel de agua  (Alto,Normal,Mínimo o Intermedio): ");
                    String niveldeagua1= read.next();
                    System.out.println("Ingrese el tipo de lavado(blanca,color,delicada,edredones,jeans):");
                    String tipodelavado1=read.next();
                    String lavado=WashingMachine.lavar();
                    System.out.println("Está "+ lavado +"tipo"+tipodelavado1+"un peso de "+capacidad1+"con un nivel de agua"+niveldeagua1);
            break;
            case 3:System.out.println("Ingrese el peso que va a lavar : ");
                   float capacidad2= read.nextFloat ();
                   System.out.println("Ingrese el tiempo de remojo (30,45,60):");
                   int temporizador1=read.nextInt();
                   String exprimido;
                   exprimido = WashingMachine.exprimir(capacidad2,temporizador1);
                   System.out.println("Está"+exprimido+"un peso de "+capacidad2+"se tardará"+temporizador1+"minutos");
                          
            break;
            case 4:
            break;
            
        }
                
        
        
    }
        
    }
