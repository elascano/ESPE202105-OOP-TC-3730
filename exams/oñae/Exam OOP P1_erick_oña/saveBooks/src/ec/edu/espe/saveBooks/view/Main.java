/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saveBooks.view;

import com.google.gson.Gson;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.saveBooks.model.Book;
import static java.rmi.server.ObjID.read;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class Main {
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            Gson gson = new Gson();
            System.out.print("Ingrese un titulo: ");//doesn't read the full title of the book by giving space
            String title = read.next();
            System.out.print("Ingrese el autor: ");
            read.nextLine();
            String author = read.next();
            System.out.println("Ingrese la editorial: "); //By giving space for the author's last name he does not allow entering the name of the publisher
            String editorial = read.next(); 
            System.out.println("Ingrese el año de publicacion: ");
            int yearPublication = read.nextInt();
            
            ArrayList<String> bookArray= new ArrayList();
            Book book = new Book(title,author,editorial,yearPublication);
            String BookDataJson = gson.toJson(book);
            FileManager.save("BooksList.json", BookDataJson);
            bookArray  = FileManager.findAll("BooksList.json"); 
            System.out.println(bookArray); //prints in Json format on the console
            System.out.println("El total de libros son: "+bookArray.size());
    } 

   }  
