/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saveBooks.view;

import com.google.gson.Gson;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.saveBooks.model.Books;
import static java.rmi.server.ObjID.read;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camilo Ponce PROGRAM BUILDER ESPE-DCCO
 */
public class SaveBooks {
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            Gson gson = new Gson();
            System.out.print("Ingrese un titulo: ");//Put the name of the book with spaces if it requires
            String title = read.next();
            System.out.print("Ingrese el autor: ");//Put the name of the book with spaces if it requires
            read.nextLine();
            String author = read.next();
            System.out.println("Ingrese la editorial: "); //Put the editorial without spaces 
            String editorial = read.next(); 
            System.out.println("Ingrese el año de publicacion: ");//Put the year with numbers 
            int yearPublication = read.nextInt();
            
            ArrayList<String> bookArray= new ArrayList();
            Books book = new Books(title,author,editorial,yearPublication);
            String BookDataJson = gson.toJson(book);
            FileManager.save("BooksList.json", BookDataJson);
            bookArray  = FileManager.findAll("BooksList.json"); 
            System.out.println(bookArray); //prints in Json format on the console
            System.out.println("El total de libros son: "+bookArray.size());
    } 

   }