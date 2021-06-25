/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import java.util.Scanner;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class BookSystem {
    private static Object data;

    public static void main(String[] args) {

        Scanner inpout = new Scanner(System.in);
        String title;
        String autor;
        String publisher;
        int year;
        
        System.out.println("");
        System.out.println("Programmer name:Andres Maximiliano Galarza Tufiño");
        System.out.println("Career:Telecomunications Engineering");
        System.out.println("Nrc;3730");
        for (int i = 0; i < 10; i++) {
                        System.out.println("Enter the book data: ");
                        System.out.println("Enter the title: ");
                        title= data.next();
                        System.out.println("Enter the publisher: ");
                        autor = data.next();
                        System.out.println("Enter the publisher: ");
                        publisher = data.next();
                     
                    }
                    
  
    }
}
