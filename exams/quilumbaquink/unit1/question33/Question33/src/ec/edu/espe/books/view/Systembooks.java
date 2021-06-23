/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.books.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.books.model.Book;
import java.util.Scanner;



/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class Systembooks {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Book book;
        
        String title;
        String author;
        String publisher;
        int yearOfPublication;
        
        Book [] books=new Book [10];
        for(int i=0;i<books.length;i++){
            
            System.out.println("\n Hen's name: ");
            title=read.next();
            System.out.println("\n Hen's name: ");
            author=read.next();
            System.out.println("\n Hen's name: ");
            publisher=read.next();
            System.out.println("\n Hen's name: ");
            yearOfPublication=read.nextInt();   
            book=new Book(title,author,publisher,yearOfPublication);
            books[i]=book;
        }
        for (int j=0; j<10; j++){
            
            System.out.println("book"+ j + "=" + books[j]);
                
        }
        GsonBuilder gsonBuilder= new GsonBuilder();
        Gson gson=gsonBuilder.create();

                String jsonBook="";
                jsonBook=gson.toJson(books);
        
                //Serialization
                System.out.println("jsonBook ->"+jsonBook);
        
       
    }
    
}
