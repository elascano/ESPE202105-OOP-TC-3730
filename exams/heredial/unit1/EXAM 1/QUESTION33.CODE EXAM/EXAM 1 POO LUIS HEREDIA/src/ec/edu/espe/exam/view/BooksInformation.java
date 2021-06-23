/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.view;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.exam.model.Books;

import java.util.Scanner;
/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class BooksInformation {
    public static void main(String[] args) {
        
    String title;
    String author;
    String publisher;
    int year; 
    String jsonBooks = "";
    
     Scanner enter = new Scanner (System.in);
     Books book [] = new Books[10];
     
        
        System.out.println("Welcome to my Library\n" + "Author: LUIS ALBERTO HEREDIA IZA\n" );
        
           
        for(int i=0;i<2;i++){
            
            System.out.println("\n Book...");  
            
            System.out.print("Please Enter Book Title:");
            title = enter.next();
            
            System.out.print("Please Enter Book name Autor:");
            author= enter.next();
            
            System.out.print("Please Enter Publisher name:");
            publisher = enter.next();
                                            
            System.out.print("Please Enter year of publication");
            year = enter.nextInt();
                                   
            enter.nextLine();
            
            
            book[i] = new Books(title,author, publisher,year);  
        }
     for(int i=0;i<2;i++){
                    
               
           GsonBuilder gsonBuilder = new  GsonBuilder();
           Gson gson = gsonBuilder.create();
           jsonBooks = gson.toJson(book[i]);
                   
           Books book1; 
           book1 = gson.fromJson(jsonBooks, Books.class);
           
             
                                         
           System.out.print(" \n");
           System.out.println("JSON BOOKS ");

          
           System.out.println("The Book  Title ->" + book1.getTitle());
           
           System.out.println("The Book Author ->" + book1.getAuthor());
           
           System.out.println("The Book Publisher ->" + book1.getPublisher());
           
           System.out.println("The year Of Publication ->" + book1.getYear());
}
    }
}