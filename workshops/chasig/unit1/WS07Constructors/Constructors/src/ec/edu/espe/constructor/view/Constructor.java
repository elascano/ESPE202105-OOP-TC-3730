/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.view;
import ec.edu.espe.constructor.model.Car;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Constructor {
 public static void main (String[] args){
     System.out.println("Hello From constructor");
     
    Car car = new Car ("Honda", " 2010","rojo");
    System.out.println(car);
 }
 
 
}
