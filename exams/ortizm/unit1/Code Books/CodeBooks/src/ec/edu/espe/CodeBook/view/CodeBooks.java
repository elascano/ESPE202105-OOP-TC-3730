/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CodeBook.view;

import ec.edu.espe.CodeBook.model.Book;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class CodeBooks {

    /**
     * @param args the command line arguments
     */
   public static void main (String [] args) {
       
       Scanner sc = new Scanner (System.in);
        String title, author;
        

        // book1 is created using the constructor with parameters
        Book book1 = new Book ("Don Quixote", "Cervantes", 1, 0);
        // the book2 object is created using the default constructor
        Book book2 = new Book ();

        System.out.print ("Enter title:");
        title = sc.nextLine ();
        System.out.print ("Enter author:");
        author = sc.nextLine ();
        System.out.print ("Number of copies:");
       

        // The data requested by keyboard is assigned to book2.
        // for this the setters methods are used
        book2.setTitle (title);
        book2.setAuthor (author);


        // the data of the book1 object is displayed on the screen
        // getters methods are used to access the value of the attributes
        System.out.println ("Book 1:");
        System.out.println ("Title:" + book1.getTitle ());
        System.out.println ("Author:" + book1.getAutor ());
        System.out.println ("Items:" + book1.getExamples ());
        System.out.println ();
        
        System.out.println ("Book 1:");
        System.out.println ("Title:" + book1.getTitle ());
        System.out.println ("Author:" + book1.getAutor ());
        System.out.println ("Items:" + book1.getExamples ());
        System.out.println ();

        // display the data of the book2 object
        System.out.println ("Book 2:");
        System.out.println ("Title:" + book2.getTitle ());
        System.out.println ("Author:" + book2.getAutor ());
        System.out.println ("Items:" + book2.getExamples ());
        System.out.println ();
   
        
    }

       }

    
    

