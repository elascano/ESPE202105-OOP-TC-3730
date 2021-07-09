/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.funtions.view;

import Funtions.ConsoleFuntions;
import java.io.IOException;


/**
 *
 * @author  Alexander Pachacama BUILDER ESPE-DCCO
 */
public class Funtions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String name = null;
       String continent = null;
       String coutry = null;
       int fundationYear = 0;
       ConsoleFuntions.addCity(name, continent, coutry,fundationYear );
       ConsoleFuntions.indicate(name, continent, coutry,fundationYear );
       ConsoleFuntions.search(name, continent, coutry,fundationYear );
    }
    
}
