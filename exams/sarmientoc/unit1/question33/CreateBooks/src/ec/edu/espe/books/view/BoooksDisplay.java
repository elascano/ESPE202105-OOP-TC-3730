/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.books.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.books.model.BornOn;
import ec.edu.espe.books.model.Books;
import java.util.Scanner;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class BoooksDisplay {
    public static void main(String[] args) {
        
        String title; 
        String author; 
        String editorial; 
        int year;
        String jsonBooks = "";
        String jsonBornOn = "";
        
                       
        Scanner enter = new Scanner (System.in);
         
        
        Books books [] = new Books[2];
        BornOn bornOn[] = new BornOn[2];
       
        
        System.out.print("Hello, Play the Store Books" + "Programmer: Cristopher Sarmiento ");
        
        for(int i=0;i<2;i++){
            
            System.out.print("\n Description: \n");
            System.out.println("\n This program store 3 books, now play and write ");
            
            
            System.out.print("Write Book title:");
            title = enter.next();
            
            System.out.print("Put Book author:");
            author = enter.next();
            
            System.out.print("Write Book editorial:");
            editorial = enter.next();
                                  
            System.out.print("Introduce Born Date Plis \n");
           
            System.out.print("Put Year:"); 
            year = enter.nextInt();

            
            
           
            enter.nextLine();
            
            books[i] = new Books(title,author,editorial);  
            bornOn[i] = new BornOn(year);
            
            
            

        }
        
        for(int i=0;i<2;i++){
            
           System.out.println("Characteristics about all books:");
           
           System.out.println("\n");
       
           System.out.println("\n" + books[i]);
      
           System.out.println(bornOn[i]);
          
          GsonBuilder gsonBuilder = new  GsonBuilder();
          Gson gson = gsonBuilder.create();
          jsonBooks = gson.toJson(books[i]);
          jsonBornOn = gson.toJson(bornOn[i]);
          
           Books books1;
           books1 = gson.fromJson(jsonBooks, Books.class);
           BornOn bornOn1;
           bornOn1 = gson.fromJson(jsonBooks, BornOn.class);
           
           
           System.out.println("\n");
           System.out.println("Information about Json Serialization:");
                
           
           System.out.println("JsonBooks ->" + jsonBooks);
           System.out.println("JsonBornOn ->" + jsonBornOn);
           
           System.out.println("\n");
           System.out.println("Information about Json Deserialization:");
           System.out.println("Title ->" + books1.getTitle());
            System.out.println("Author ->" + books1.getAuthor());
            System.out.println("Editorial ->" + books1.getEditorial());
            System.out.println("Year object ->" + bornOn1.getYear());
            
                
           
           
           
           
          
           
         
        
        }
    }
}
           
      
           
  