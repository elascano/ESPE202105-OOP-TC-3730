/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanagersystem.view;

import ec.edu.espe.filemanager.FileManager;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FileManagerSystem {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        Scanner entry = new Scanner(System.in);
        String name;
        String lastName;
        String id = null;
        String age;
        boolean salir = false;
        int option;
        String Read = null;
        String add;
        String search;
        
        System.out.println("File Manager -> Bryan Chiliquinga");
            
        while(!salir){
            System.out.println("\nMenu");
            System.out.println("1. Enter new data");
            System.out.println("2. Save data to file");
            System.out.println("3. Search for a data");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            option = entry.nextInt();
            
            switch(option){
                case 1: System.out.print("\nEnter name: ");
                        name = entry.next();
                        System.out.print("Enter the last name: ");
                        lastName = entry.next();
                        System.out.print("Enter your age: ");
                        age = entry.next();
                        System.out.print("Enter your id: ");
                        id = entry.next();
                        Read = FileManager.read(name, lastName, age);
                        break;
                case 2: FileManager.add(Read, id);
                        break;
                case 3: System.out.print("\nWrite the id to search in the file: ");
                        Scanner find = new Scanner(System.in);         
                        search = find.nextLine();
                        FileManager.find(search);
                        break;
                case 4: salir = true;
                        break;
            }
        }
    }
}	


