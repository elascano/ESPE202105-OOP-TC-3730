/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.constructors.view;

import ec.edu.constructors.model.Computer;

/**
 *
 * @author Estefania
 */
public class WS07Constructors {
    public static void main(String[] args) {
        System.out.println("HELLO FROM COMPUTER OBJECT");
        
        Computer computer;
        computer = new Computer("pcg-61911u", "Sony Vio VPCEG", "C902EEMH");
        System.out.println(computer);
    }
}
