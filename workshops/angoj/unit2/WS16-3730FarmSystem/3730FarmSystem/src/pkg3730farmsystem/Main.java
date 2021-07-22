/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3730farmsystem;

import ec.espe.edu.farm.model.FarmAnimal;
import java.util.Date;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FarmAnimal farmAnimal;
        Date date = new Date ();
        farmAnimal = new FarmAnimal(0, "gernan shephard", date);
        System.out.println("Farm Animal ->");
      
    }
    
}

