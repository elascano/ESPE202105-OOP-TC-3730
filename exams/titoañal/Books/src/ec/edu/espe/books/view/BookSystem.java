/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.books.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.books.model.*;
import java.util.Scanner;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class BookSystem {
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String title;
        String author;
        String publisher;
        int  yearOfPublication;
        Book books[]=new Book[5];
        for(int counter=0;counter<5;counter++){
        System.out.println("Enter title of book");
        title = sc.next();
        System.out.println("Enter author");
        author = sc.next(); 
        System.out.println("Enter publisher");
        publisher = sc.next();
        System.out.println("Enter the year of publication");
        yearOfPublication = sc.nextInt(); 
        books[counter]= new Book(title, author, publisher, yearOfPublication);
            
        }
        
        for(int counter=0;counter<5;counter++){
            System.out.println(books[counter]);
            System.out.println("Total number of books");
            System.out.println(" "+counter);
            
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            String jsonBook= gson.toJson(books[counter]);
            Book book;
            book = gson.fromJson(jsonBook, Book.class);
            System.out.println("jsonBook:"+jsonBook);
            System.out.println(books[counter].getPublisher()+books[counter].getAuthor()+books[counter].getTitle()+books[counter].getYearOfPublication());
            
            
        }
  
    }
    
}
