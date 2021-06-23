/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.view;

import ec.edu.espe.book.model.Book;
import java.util.Date;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.book.model.Book;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class LibrarySystem {
     public static void main(String[] args) throws ParseException, IOException {
        Book book;
  
        String title;
        String author;
        String publisher ;
        double year;
        String jsonBook = "";
        Scanner read = new Scanner(System.in);
       

        System.out.println("LibrarySystem Vanessa");
        
        System.out.println("Write title of book: ");
        title = read.next();
        
        System.out.println("Write author of book : ");
        author = read.next();
        
        System.out.println("Write pubilsher of book: ");
        publisher = read.next();
        
        System.out.println("Write year of book ");
        year = read.nextInt();
        

        
        
   
        book = new Book(title, author, publisher, year);
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonBook = gson.toJson(book);
                try {
                    FileWriter file = new FileWriter("./files/Books.json");
                    file.write(jsonBook);
                    file.flush();
                    file.close();

                } catch (IOException e) {
                
                }

     }

    }

