/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;
import com.csvreader.CsvWriter;
import ec.edu.espe.farm.model.Age;
import ec.edu.espe.farm.model.Chicken;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) throws IOException {
        //TODO reading from keyboard
    
    ArrayList <Age> ages = new ArrayList();
    
    ages.add(new Age(1, 6, 2021));
    ages.add(new Age(1, 2, 2020));
    ages.add(new Age(2, 12, 2022));
    ages.add(new Age(6, 9, 2021));
    ages.add(new Age(3, 8, 2021));
    ages.add(new Age(1, 6, 2019));
    ages.add(new Age(9, 5, 2017));
    ages.add(new Age(4, 3, 2016));
    ages.add(new Age(3, 11, 2020));
    ages.add(new Age(7, 10, 2021));
    
    ArrayList <Chicken> chickens =  new ArrayList();
    
    chickens.add(new Chicken(1, "Alisson", "Blue", true, 77));
    chickens.add(new Chicken(2, "Melanie", "Red", false, 95));
    chickens.add(new Chicken(3, "Andrea", "Black", true, 24));
    chickens.add(new Chicken(4, "Alexandra", "Yellow", false, 33));
    chickens.add(new Chicken(5, "Veronica", "White", true, 21));
    chickens.add(new Chicken(6, "Lucy", "Brown", false, 34));
    chickens.add(new Chicken(7, "Ericka", "Green", true, 88));
    chickens.add(new Chicken(8, "Fernanda", "Rose", false, 11));
    chickens.add(new Chicken(9, "Priscila", "Orange", true, 99));
    chickens.add(new Chicken(10, "Shayde", "Gray", false, 55));
    
    
    CsvWriter csvWriter =  new CsvWriter("Chicken.csv");
    
    for(Chicken chicken : chickens){
        String [] datos = chicken.getArray();
        csvWriter.writeRecord(datos);
    }
    
    for(Age age : ages){
        String [] dat = age.getArray();
        csvWriter.writeRecord(dat);
    }
    
    csvWriter.close();
  
    }
    
}    


 
  
