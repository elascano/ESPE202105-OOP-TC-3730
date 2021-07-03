/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.workshop.view;

import ec.edu.espe.workshop.controller.ManagmentPerson;
import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author Fernando
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
        // TODO code application logic here
         ManagmentPerson cus = new   ManagmentPerson();
        cus.saveClient();
    }
    
}
