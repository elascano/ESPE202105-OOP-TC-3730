/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.view;

import ec.edu.espe.exam.model.Book;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;





/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class KevinBarreraExam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
              Book book;
        //TODO reading from keyboard
        int id;
        String author;
        String editorial;
        int yearPublication;
        String title;
        String jsonBook = "";
        Scanner read = new Scanner(System.in);
        int optionMenu;
        FileWriter file = new FileWriter("./files/Books.json");
        System.out.println("Welcome to books system Kevin");
        do{
        System.out.println("1.- Save Book");
        System.out.println("2.- List Book");
        System.out.println("3.- Exit");
        System.out.println("Choose the option: ");
        optionMenu = read.nextInt();
        switch (optionMenu) {
            case 1:
                System.out.println("Introduce id of Book: ");
                id = read.nextInt();
                System.out.println("Introduce title of book: ");
                title = read.next();
                System.out.println("Introduce author of book: ");
                author = read.next();
                System.out.println("Introduce editorial of book: ");
                editorial = read.next();
                System.out.println("Introduce year of publication of book: ");
                yearPublication = read.nextInt();
                book = new Book(id,title,author,editorial,yearPublication);
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonBook = gson.toJson(book);
                try {
                    file.append(jsonBook);
                    file.flush();
                    file.close();

                } catch (IOException e) {
                    //manejar error
                }
                break;
            case 2:
                
                break;
            case 3:
                System.out.println("Exit of system");
                break;
            default:
                System.out.println("option not valid...!!!");
        }
        }while(optionMenu!=3);

    }
 
}
    

