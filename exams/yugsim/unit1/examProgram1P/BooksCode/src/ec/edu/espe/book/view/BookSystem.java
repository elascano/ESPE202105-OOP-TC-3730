/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.book.model.*;
import java.io.FileWriter;
import java.io.IOException;
import static java.rmi.server.ObjID.read;
import static java.rmi.server.UID.read;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class BookSystem {
    public static void main(String[] args) throws ParseException, IOException{
        Title title;
        Author author;
        Publisher publisher;
        YearOfPublication yearOfPublication;
        
        String titleOfTheBook;
        String name;
        String dateBorn;
        Date bornOn;
        String namePublisher;
        int year;
        String jsonBook = "";
        Scanner read = new Scanner(System.in);
        
        System.out.println("Exam 1P, \n"
                        + "Pamela Yugsi");
        
        System.out.println("Welcome to BookSystem Ma.Pamela");
        
        System.out.println("Enter title of the book: ");
        titleOfTheBook = read.next();
        
        System.out.println("Enter the author's name: ");
        name = read.next();
        
        System.out.println("Enter bornOn of the author: ");
        dateBorn = read.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        bornOn = sdf.parse(dateBorn);
        
        System.out.println("Enter publisher name: ");
        namePublisher = read.next();
        
        System.out.println("Enter year of publication: ");
        year = read.nextInt();
        
        
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonBook = gson.toJson(book);
                
                try {
                    FileWriter registry = new FileWriter("./registry/Book.json");
                    registry.write(jsonBook);
                    registry.flush();
                    registry.close();

                } catch (IOException e) {
                }
    }
}
