/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.student.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.filemanager.Student;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class StudentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner entry = new Scanner(System.in);
        String name;
        String lastname;
        int age;
        int nrc;
        int id = 0;
        boolean exit = false;
        int option;
        String reference = null;
        String inquire;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        while (!exit) {
            System.out.println("menu");
            System.out.println("1. enter student date:");
            System.out.println("2. save date in the file:");
            System.out.println("3. search data");
            System.out.println("4. exit");
            System.out.print("enter option:");
            option = entry.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter the name");
                    name = entry.next();
                    System.out.println("enter the lastname");
                    lastname = entry.next();
                    System.out.println("enter the age");
                    age = entry.nextInt();
                    System.out.println("enter the nrc");
                    nrc = entry.nextInt();
                    System.out.println("enter the id");
                    id = entry.nextInt();
                    reference = Student.information(name, lastname, age, nrc);
                    break;

                case 2:
                    Student.put(reference, id);
                       
                    break;
                case 3:
                    System.out.println("number of the id you want to search:");
                    Scanner evince = new Scanner(System.in);
                    inquire = evince.nextLine();
                    Student.search(inquire);
                    break;
                case 4:
                    exit = true;
                    break;

            }

        }

    }

}
