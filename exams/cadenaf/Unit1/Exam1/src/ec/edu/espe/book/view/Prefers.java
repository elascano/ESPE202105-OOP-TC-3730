/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.view;

import com.google.gson.Gson;
import ec.edu.espe.book.model.book;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Prefers {
         public static void main(String[] args) {
             book book; 
             
             String title;
             String author;
             int publisher;
             int year; 

             title = "La lluvia sabe porque";
             author = "Maria Fernanda Heredia";
             publisher = 2016;
             year = 2016;
             
             book = new book(title, author, publisher, year);
             System.out.println("bool -> " + book);
             book book2 = new book("Abrazame", "Chistian Becerra", 2002, 2003); 
             System.out.println("book 2 " + book2);
             String jsonbook = null;
             
             System.out.println("book json " + jsonbook);
        
             GsonBuilder gsonBuilder = new GsonBuilder() ;
             Gson gson = gsonBuilder.create();
             jsonbook = gson.toJson(book);
        
             System.out.println("jsonbook " + jsonbook);
             jsonbook = gson.toJson(book2);
             System.out.println("jsonbook " + jsonbook);
        
             book book3;
             book3 = gson.fromJson(jsonbook, book.class);
             System.out.println("book objects name: " + book3.getName());       
    }
}

                     
     
