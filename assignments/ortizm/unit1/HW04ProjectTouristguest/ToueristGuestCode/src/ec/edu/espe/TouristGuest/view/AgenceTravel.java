/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

import ec.edu.espe.TouristGuest.model.Citys;
import ec.edu.espe.TouristGuest.model.Country;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class AgenceTravel {
    public static void main(String[] args){
        System.out.println("Welocme dear guest");
        Citys c1= new Citys("City1", 1, 1);
        Citys c2= new Citys("City2", 1, 1);
        Citys c3= new Citys("City3", 1, 1);
        
        Citys c4= new Citys("City4", 1, 1);
        Citys c5= new Citys("City5", 1, 1);
        Citys c6= new Citys("City6", 1, 1);
        
        Citys c7= new Citys("City7", 1, 1);
        Citys c8= new Citys("City8", 1, 1);
        Citys c9= new Citys("City9", 1, 1);
                
       Country p1= new Country("Country 1", 1000, "Spanish", "American");
       Country p2= new Country("Country 2", 1000, "Spanish", "Europe");
       Country p3= new Country("Country 3", 1000, "Spanish", "American");
    
       p1.addCitys(c1);
       p1.addCitys(c2);
       p1.addCitys(c3);
      
       
       p2.addCitys(c4);
       p2.addCitys(c5);
       p2.addCitys(c6);
       
       p3.addCitys(c7);
       p3.addCitys(c8);
       p3.addCitys(c9);
       
        System.out.println(p1.getinfo());
        System.out.println(p2.getinfo());
        System.out.println(p3.getinfo());
              
    }
    
    }

