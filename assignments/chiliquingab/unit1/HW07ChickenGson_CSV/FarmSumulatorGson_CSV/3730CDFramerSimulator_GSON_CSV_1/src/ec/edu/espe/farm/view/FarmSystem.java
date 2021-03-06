/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.farm.view;
import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import ec.edu.espe.farm.model.Age;
import static ec.edu.espe.farm.model.Age.calculaAnos;
import static ec.edu.espe.farm.model.Age.calculaDias;
import static ec.edu.espe.farm.model.Age.calculaMeses;
import ec.edu.espe.farm.model.Chicken;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) throws IOException, CsvValidationException {
        //TODO reading from keyboard
        Scanner entrada = new Scanner(System.in);
        Chicken chicken;
        Age age;
        int id; 
        String name; 
        String color; 
        boolean molthing;
        int eggCounter;
        int dia;
        int mes;
        int ano;
        boolean salir = false;
        int option;
        String jsonChicken;
        String jsonAge;
        FileReader archCSV = null;
        CSVReader csvReader = null;
        String SEPARADOR = null;
        
    //TODO reading from keyboard
    
    ArrayList <Chicken> pollo =  new ArrayList<>();
    ArrayList <Age> edad = new ArrayList<>();

    Chicken chickens[] = new Chicken[10];
    Age ages[] = new Age[10];
        
    for(int i=0;i<10;i++){
        System.out.println("\nEnter the chicken data[" + (i+1) + "]:");
        
        System.out.print("Enter the id: ");
        id = entrada.nextInt();
        
        System.out.print("Enter the name: ");
        name = entrada.next();
        
        System.out.print("Enter the color: ");
        color = entrada.next();
        
        System.out.print("Insert molthing: ");
        molthing = entrada.nextBoolean();
        
        System.out.print("Enter the egg counter: ");
        eggCounter = entrada.nextInt();
        
        System.out.println("Enter the chicken's date of birth[" + (i+1) + "]:");
        
        System.out.print("Enter the day: ");
        dia = entrada.nextInt();
        
        System.out.print("Enter the month: ");
        mes = entrada.nextInt();
        
        System.out.print("Enter the year: ");
        ano = entrada.nextInt();
        
        entrada.nextLine();
        
        chickens[i] = new Chicken(id, name, color, molthing, eggCounter);
        ages[i] = new Age(calculaDias(dia,mes,ano), calculaMeses(dia,mes,ano),calculaAnos(dia,mes,ano));
        
        pollo.add(chickens[i]);
        edad.add(ages[i]);
        
    }
     
//  for(int i=0;i<1;i++){
//       System.out.println("Chicken -> " + chickens[i]);
//       System.out.println("El pollo[" + (i+1) + "]" + " tiene la edad de " + ages[i]);
//  }

    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();
    
    CsvWriter csvWriter =  new CsvWriter("Chicken.csv");
    
     do{
        
       System.out.println("\nMenu: ");
    System.out.println("1. Write the jsonChicken: ");
    System.out.println("2. Read the jsonChicken: ");
    System.out.println("3. Write the CsvChicken: ");
    System.out.println("4. Read the CsvChicken: ");
    System.out.println("5. Exit: ");
    System.out.print("Enter an option: ");
    option = entrada.nextInt();
    
    if(option == 1){
    
    for(int i=0;i<10;i++){
    //Serealizacion
    System.out.println("\njsonChicken[" + (i+1) + "]");
    jsonChicken = gson.toJson(chickens[i]);
    System.out.println("\njsonChicken -> " + jsonChicken);
    
    jsonAge = gson.toJson(ages[i]);
    System.out.println("jsonAge -> " + jsonAge);
    
        }
    
    }
    
    if(option == 2){
    
    for(int i=0;i<10;i++){
    //Serealizacion
    System.out.println("\njsonChicken[" + (i+1) + "]");
    jsonChicken = gson.toJson(chickens[i]);
    
    jsonAge = gson.toJson(ages[i]);
    //System.out.println("jsonAge -> " + jsonAge);
    
    //deserealizacion
    Chicken chicken2;
    chicken2 = gson.fromJson(jsonChicken,Chicken.class);
    
    System.out.println("\nChicken object id -> " + chicken2.getId());
    System.out.println("Chicken object name -> " + chicken2.getName());
    System.out.println("Chicken object color -> " + chicken2.getColor());
    System.out.println("Chicken object molthing -> " + chicken2.isMolthing());
    System.out.println("Chicken object eggCounter -> " + chicken2.getEggCounter());
    
    Age ages2;
    ages2 = gson.fromJson(jsonAge,Age.class);
    
    System.out.println("\nThe chicken[" + (i+1) + "] is " + ages2.getAno() 
            + " years, " + ages2.getMes() + " months and " 
            + ages2.getDia() + " days old");
    }
    
  }
    
    if(option == 3){
        
    for(Chicken aux1 : pollo){
      System.out.println("\n" + aux1);
      String [] datos = aux1.getArray();
      csvWriter.writeRecord(datos);
    }
    
     for(Age aux2 : edad){
      System.out.println(aux2);
      String [] datos = aux2.getArray();
      csvWriter.writeRecord(datos);
    }
     
     csvWriter.close();
     
}
    
    if(option == 4){
        
    System.out.println("\n");
       
    try{
        BufferedReader reader = new BufferedReader(new FileReader("Chicken.csv"));
        String line;
            while((line = reader.readLine()) != null){
                String [] parts = line.split(",");
                int totalParts = parts.length;
        
                for(int i=0;i<totalParts;i++){
                    System.out.print(parts[i] + ", ");
                }
            System.out.print("\n");
            }
    }catch(IOException e){
    e.printStackTrace();
    }
   
}
    if(option == 5){
        salir = true;
    }
    
    }while(!salir);
    
        System.out.println("\nEnd of the program");
   
    }

  }