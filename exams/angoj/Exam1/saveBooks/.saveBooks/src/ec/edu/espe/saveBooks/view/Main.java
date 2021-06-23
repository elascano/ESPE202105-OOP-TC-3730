/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saveBooks.view;
import com.google.gson.Gson;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.saveBooks.model.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner read = new Scanner(System.in);
            Gson gson = new Gson();
            System.out.print("Ingrese un titulo: ");
            String title = read.next();
            System.out.print("Ingrese el autor: ");
            read.nextLine();
            String author = read.next();
            System.out.println("Ingrese la editorial: ");
            String editorial = read.next();
            System.out.println("Ingrese el año de publicacion: ");
            int yearPublication = read.nextInt();
            
            ArrayList<String> bookArray= new ArrayList();
            Book book = new Book(title,author,editorial,yearPublication);
            String BookDataJson = gson.toJson(book);
            FileManager.save("BooksList.json", BookDataJson);
            bookArray  = FileManager.findAll("BooksList.json");
            System.out.println(bookArray);
            System.out.println("El total de libros son: "+bookArray.size());
        
        
    }
    
}
