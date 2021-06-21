/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;
import java.util.Scanner;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class FarmSystem1 {
    public static void main(String[] args){
    
     Scanner sc = new Scanner(System.in);
     System.out.println("Write the Id: ");
     String id = sc.nextLine();
     
     System.out.println("Write the name: ");
     String name = sc.nextLine();
     
     System.out.println("Write the color: ");
     String color = sc.nextLine();
     
     System.out.println("Write the age: ");
     String age = sc.nextLine();
     
     System.out.println("Write the bornOn: ");
     String bornOn = sc.nextLine();
     
     System.out.println("Write the molting: ");
     String molting = sc.nextLine();
     
     System.out.println("Write the eggCounter: ");
     String eggCounter = sc.nextLine();
     
     System.out.println("Id: " + id + ", Name: " + name + ", Color: " + color + ", Age: " + age + ", bornOn: " + bornOn + ", molting: " + molting + ", eggCounter: " + eggCounter);
              

    }
    
}