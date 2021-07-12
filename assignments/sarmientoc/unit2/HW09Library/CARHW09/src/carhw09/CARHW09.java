/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carhw09;
import ec.edu.espe.carLibrary.CarLibrary;
import java.io.IOException;


/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class CARHW09 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
    String color = null;
    String type = null;
    String brand = null;
    String model = null;
    int year = 0;
    
    
    CarLibrary.enter(color, type, brand, model, year);
    CarLibrary.find(color, type, brand, model, year);
    
    }
    
}
