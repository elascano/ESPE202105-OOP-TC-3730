/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modeltourist.trips;
import ec.edu.espe.constructor.viewtourist.trips.Agency;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class TouristTrips {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String workers;
        String travels;
        String services;
        String jsonAgency = "";
        
       workers = "1";
       travels = "8";
       services = "customer Support";
       
       
       GsonBuilder gsonBuilder = new GsonBuilder(); 
           Gson gson = gsonBuilder.create();
           
        Agency agencyn = new Agency (workers, travels, services);
           System.out.println("agency ->" + agencyn);
           
           jsonAgency = gson.toJson(agencyn);
              System.out.println("jsonAgency ->" + jsonAgency); 
       
        List<Agency> agencys = new ArrayList<Agency>();
        
        Agency agency = new Agency ("1","8","customer Support");
        System.out.println("agency");
        /*ExportarCSV(agencys);*/
        ImportarCSV();
    }

    public static void ExportarCSV(List<Agency>agencys){
     String outputFile = "project (tourist trip).csv";
     boolean exit = new File(outputFile).exists();
     
     try {
     CsvWriter outputCSV = new CsvWriter(new FileWriter(outputFile, true), ',');
     
     outputCSV.write("Workers");
     outputCSV.write("Travels");
     outputCSV.write("Services");
    
     outputCSV.endRecord();
    
     for(Agency ag : agencys ){
        outputCSV.write(ag.getWorkers());
        outputCSV.write(ag.getTravels());
        outputCSV.write(ag.getServices());
        
        outputCSV.endRecord();
     }
     
     
     outputCSV.close();
   
    } catch(IOException e ){
    e.printStackTrace();
    }
        
}
    public static void ImportarCSV() {
        try{
            List<Agency>agencys = new ArrayList<Agency>();
            CsvReader leerAgency = new CsvReader("Agencys.csv");
            leerAgency.readHeaders();
        
            while(leerAgency.readRecord()){
                String workers = leerAgency.get(0);
                String travels = leerAgency.get(1);
                String services = leerAgency.get(2);
                agencys.add(new Agency(workers, travels, services));
            }
            leerAgency.close();
            
            for(Agency ag : agencys ){
                System.out.println(ag.getWorkers() +  " , " 
                        + ag.getTravels() + " , " + ag.getServices());
            }
            
            
        }catch(FileNotFoundException e){
         e.printStackTrace();
        }catch(IOException e){
         e.printStackTrace();
        }
    }





}
