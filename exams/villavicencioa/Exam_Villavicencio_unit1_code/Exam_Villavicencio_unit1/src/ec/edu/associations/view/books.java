/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.associations.model.Book1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class books {
    public static void main(String[] args) {
         System.out.println ("BooksJson, \n"
            + "Alina Villavicencio \n");
     Scanner data = new Scanner(System.in);    
     Scanner sc =new Scanner(System.in);
     
     String title,author,publisher;
     int yearOfPublication;
     
     
     Book1 book1[] = new Book1[10];
     ArrayList<Book1> boo = new ArrayList();
     
        for (int i = 0; i < 3; i++) {
        
        System.out.println("Enter title");
        title =data.next();
        System.out.println("Enter author");
        author = data.next();
        System.out.println("Enter publisher");
        publisher = data.next();
        System.out.println("Enter yearOfPublication");
        yearOfPublication= sc.nextInt();
        
        boo.set(i, new Book1(title,author,publisher,yearOfPublication));
        
        }
        for(int i= 0;i < 2;i++){
                         GsonBuilder gsonBuilder = new GsonBuilder();
                         Gson gson= gsonBuilder.create();
                         String jsonBook1 = gson.toJson(boo.get(i));
                     
                         Book1 book;
                         book = gson.fromJson(jsonBook1, Book1.class);
                         System.out.println("jsonBook1:"+jsonBook1);
                         
                         System.out.println(boo.get(i).getTitle() + "" + boo.get(i).getAuthor()+ "" + boo.get(i).getPublisher());
                     }
    }
}
