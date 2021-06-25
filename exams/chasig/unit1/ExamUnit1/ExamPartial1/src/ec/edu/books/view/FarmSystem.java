/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.books.view;
import com.google.gson.GsonBuilder;
import ec.edu.books.model.Books;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class FarmSystem {
   public static void main(String[] args) {
        //Variables
            Books books;
        int year;
        String title;
        String editorial;
        String autor;
       
        String jsonBooks="" ;
        
        year=2001;
        title= "the big ";
        editorial = "5";
        autor = "Paulo Cohelo";
        
        books = new Books (year, title, editorial, autor );
        System.out.println("books -> " + books);
        Books books1 = new Books(2001, "the big ", "5", "Paulo Cohelo", true);
        
        System.out.println("Books " + books);
        
        System.out.println("Books json " + jsonBooks);
        
        GsonBuilder gsonBuilder = new GsonBuilder() ;
        
        
       
   }
}
