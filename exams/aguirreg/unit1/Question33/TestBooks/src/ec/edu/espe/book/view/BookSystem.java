/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.book.model.DatePublic;
import ec.edu.espe.book.model.Book;
import java.util.Scanner;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class BookSystem {
    public static void main(String[] args) {
        
        int id; 
        String name; 
        String author; 
        boolean molting;
        int Counter;
        int day;
        int month;
        int year;
        String jsonBook = "";
        String jsonDatePublic = "";
        
                       
        Scanner enter = new Scanner (System.in);
         
        
        Book book [] = new Book[10];
        DatePublic datePublic[] = new DatePublic[10];
       
        
        System.out.print("Welcome to Book Program" + " Author: Gabriel Aguirre ");
        
        for(int i=0;i<3;i++){
            
            System.out.print("\n Next Book... \n");
            
            
            System.out.print("Insert Book id:");
            id = enter.nextInt();
            
            System.out.print("Insert Book name:");
            name = enter.next();
            
            System.out.print("Insert Book author:");
            author = enter.next();
                                  
            System.out.print("Insert Date Publication On \n");
            
            System.out.print("Insert Day:"); 
            day = enter.nextInt();                  
                                    
            System.out.print("Insert Month:"); 
            month = enter.nextInt();
           
            System.out.print("Insert Year:"); 
            year = enter.nextInt();
            
            System.out.print("Inster molting:");
            molting = enter.nextBoolean();
            

            
            
           
            enter.nextLine();
            int counter;
            
            book[i] = new Book(id,name,author,molting,counter);  
            datePublic[i] = new DatePublic(day, month, year);
            
            
            

        }
        
        for(int i=0;i<3;i++){
            
           System.out.println("Characteristics about books:");
           
           System.out.println("\n");
       
           System.out.println("\n" + book[i]);
      
           System.out.println(datePublic[i]);
          
          GsonBuilder gsonBuilder = new  GsonBuilder();
          Gson gson = gsonBuilder.create();
          jsonBook = gson.toJson(book[i]);
          jsonDatePublic = gson.toJson(datePublic[i]);
          
           Book book1;
           book1 = gson.fromJson(jsonBook, Book.class);
           DatePublic datePublic1;
           datePublic1 = gson.fromJson(jsonBook, DatePublic.class);
           
           
           System.out.println("\n");
           System.out.println("Json Serialization:");
                
           
           System.out.println("JsonChicken ->" + jsonBook);
           System.out.println("JsonBornOn ->" + jsonDatePublic);
           
           System.out.println("\n");
           System.out.println("Json Deserialization:");
           
            System.out.println("book ID ->" + book1.getId());
            System.out.println("book Name ->" + book1.getName());
            System.out.println("book Color ->" + book1.getColor());
            System.out.println("book Moltying ->" + book1.isNolting());
            System.out.println("book EggCounter ->" + book1.getCounter());
            System.out.println("book Day ->" + DatePublic1.getDay());
            System.out.println("book Month object ->" + DatePublic1.getMounth());
            System.out.println("book Year object ->" + DatePublic1.getYear());
            
                
           
           
           
           
          
           
         
        
        }
    }
}