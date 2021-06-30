/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savebooks;

import com.google.gson.Gson;
import ec.edu.espe.saveBooks.model.Books;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;
import static java.rmi.server.ObjID.read;




/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class SaveBooks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
            Gson gson = new Gson();
            System.out.print("Exam Unit 1 \n "+ "Mosquera Kerly \n  "+"Welcome \n ");
            System.out.print("Inserte title: ");
            String title = read.next();
            System.out.print("Insert author: ");
            read.nextLine();
            String author = read.next();
            System.out.println("Editorial insert: "); 
            String editorial = read.next(); 
            System.out.println("Insert the year of publicacion: ");
            int yearPublication = read.nextInt();
            
            ArrayList<String> booksArray= new ArrayList();
            Books books = new Books(title,author,editorial,yearPublication);
            String BooksDataJson = gson.toJson(books);
            FileManager.save("BooksList.json", BooksDataJson);
            System.out.println(booksArray); //prints in Json format on the console
            System.out.println("The total number of books are: "+booksArray.size());
    } 
    }
   
//Inspector: Erick Oña

//Execution: 8 // the program runs up to a certain point

//Json file: 0  //  there is no json file
//Books list on screen: 0	// the program does not print any list of books

//total number of books: 0 // the program does not print any book
//code quality:	5 //	the program only has the model and there is no creation of the view
//total: 13/50
