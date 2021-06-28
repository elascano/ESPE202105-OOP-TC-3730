
package ec.edu.espe.gson.view;

import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.gson.model.*;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class FarmSystem {
    private static Iterable<Chicken> ch;
   
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
  
        int id;
        String name;
        String color; 
        boolean molting;
        int eggCounter;
        int day;
        int year;
        int month;
        Calendar cal = new GregorianCalendar();
        int actualMonth = cal.get(Calendar.MONTH), actualYear = cal.get(Calendar.YEAR), actualDay;
        actualDay = cal.get(Calendar.DAY_OF_MONTH);
        int resultDay;
        int resultMonth;
        int resultYear;
        
        Chicken chickens[]=new Chicken[10];
        BornOn bornOn[]= new BornOn[10];
        Age age[]= new Age[10];
        System.out.println("Enter the chicken data");
        for(int counter=0;counter<1;counter++){
            
            System.out.println("Enter id");
            id=sc.nextInt();
            System.out.println("Enter name");
            name = sc.next();
            System.out.println("Enter color");
            color = sc.next(); 
            System.out.println("Enter day");
            day = sc.nextInt();
            System.out.println("Enter month");
            month = sc.nextInt();
            System.out.println("Enter year");
            year = sc.nextInt();          
            System.out.println("Enter molting");
            molting=sc.nextBoolean();
            System.out.println("Enter eggCounter");
            eggCounter=sc.nextInt();
            System.out.println("Enter next chicken data");
            chickens[counter]= new Chicken(id, name, color, molting, eggCounter);
            bornOn[counter] = new BornOn(day, month, year);
            resultMonth = Math.abs(month-actualMonth);
            resultDay = Math.abs(day-actualDay);
            resultYear = Math.abs(year-actualYear);
            age[counter]=new Age (resultDay, resultMonth, resultYear);
            
        }
            
       
        for(int counter=0;counter<1;counter++){
            System.out.println(chickens[counter]);  
            System.out.println(bornOn[counter]);
            System.out.println(age[counter]);
        }
  menu();
} 
public static void menu() throws IOException{
    Scanner sn = new Scanner(System.in);
    boolean exit = false;
    int option;
    while(!exit){
        System.out.println("Choose an option");
        System.out.println("1.- Save json ");
        System.out.println("2.- Save csv ");
        System.out.println("3.- Exit");
        
        option = sn.nextInt();
        switch (option){
            case 1:
                saveJson();
                break;
                
            case 2:
                saveCsv();
                break;
                
            case 3:
                exit = true;
                break; 
            default:    
        }
        
    }
    
}

public static void saveJson(){
    
        String jsonChicken;
        jsonChicken = "";
    
        Chicken chickens[]=new Chicken[10];   
        for(int i=0;i<1;i++){      
        GsonBuilder gsonBuilder= new GsonBuilder();
        Gson gson = gsonBuilder.create();
        jsonChicken = gson.toJson(chickens[i]);
        System.out.println("jsonChicken:"+jsonChicken);
}
}

public static void saveCsv() throws IOException{
ch.add(new Chicken(id, name, color, molting, eggCounter));
CsvWriter csvWriter=new CsvWriter ("chickens.csv");
for (Chicken chicken: ch){
    String [] data = chicken.getArray();
     csvWriter.writeRecord(data);
}
 csvWriter.close();

}
}

