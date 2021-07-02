/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Book;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class SystemLibrary {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Book book;
        String title;
        String author;
        String yearOfPublication;
        String jsonBook = "";
        int i; // bad name for a variable

        for (i = 0; i < 4; i++) {
            System.out.println("Marco_Arias_Exam");
            System.out.println("\tBook");
            System.out.println("Place Title: ");
            title = read.next();
            System.out.println("Place Author: ");
            author = read.next();
            System.out.println("place Year of Publication: ");
            yearOfPublication = read.next();

            book = new Book(title, author, yearOfPublication);

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            jsonBook = gson.toJson(book);
            try {
                FileWriter file = new FileWriter("./files/Book.json");
                file.write(jsonBook);
                file.flush();
                file.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }
}
