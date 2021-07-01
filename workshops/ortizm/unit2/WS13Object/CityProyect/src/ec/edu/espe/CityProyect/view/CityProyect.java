/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CityProyect.view;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.CityProyect.model.City;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */

public class CityProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner data = new Scanner(System.in);
        int id;
        String name;
        String continent;
        String country;
        int numberOfProvinces;
        
        
        String turistPlace;
        
        String jsonChicken = "";
        
        City city[] = new City[10];
        ArrayList<City> Citys = new ArrayList();
        
        for (int i = 0; i < 2; i++) {
                        System.out.println("Enter the city data: ");
                        System.out.println("Enter the id: ");
                        id = data.nextInt();
                        System.out.println("Enter the name: ");
                        name = data.next();
                        System.out.println("Enter the continent: ");
                        continent = data.next();
                        System.out.println("Enter the country: ");
                        country = data.next();
                        System.out.println("Enter number of Province: ");
                        int numberOfProvinces = data.nextInt();
                        System.out.println("Enter the toutirtsplace: ");
                        turistPlace = data.next();

                  
                        city[i] = new City(id, name, continent, country, numberOfProvinces, turistPlace);
                    }
                    System.out.println("Data of all Citys entered: ");
                    for (int i = 0; i < 2; i++) {
                    
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        jsonChicken = gson.toJson(city[i]);

                        City city1;
                        city1 = gson.fromJson(jsonChicken, City.class);

                        System.out.println("jsonChicken ->" + jsonChicken);

                        System.out.println(city[i].getId() + " " +city[i].getName()+ " " +city[i].getName()+ " " + city[i].getContinent() + " " + city[i].getNumberOfProvinces() + " " + city[i].getTuristPlace());
                        System.out.println("\n");
                    }
    
    
    }
}
    

