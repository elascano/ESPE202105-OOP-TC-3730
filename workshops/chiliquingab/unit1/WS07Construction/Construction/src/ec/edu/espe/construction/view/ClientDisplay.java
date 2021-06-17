/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.construction.view;

import ec.edu.espe.construction.model.Client;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class ClientDisplay {
    public static void main(String[] args) {
        System.out.println("Hello Welcome To Customer\n" + "Bryan Chiliquinga\n");
        
        Client client = new Client("Adrian", "Quishpe", 19);
        
        System.out.println(client);
    }
}
