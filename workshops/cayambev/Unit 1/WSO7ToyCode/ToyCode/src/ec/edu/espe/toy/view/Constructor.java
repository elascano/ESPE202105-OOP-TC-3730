/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.toy.view;
import ec.edu.espe.toy.model.*;
/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class Constructor {
    public static void main(String[] args){
        
        System.out.println("WS07 - Vehicle Project, \n"
                        + "Vanessa Cayambe");
        
        Toy toy = new Toy("Playmobil", "negro","aeroplane");
        System.out.print(toy);
    }
}
