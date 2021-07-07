/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanagersystem.view;

import ec.edu.espe.filemanager.FileManager;
import ec.edu.espe.filemanager.id;
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
    public static void main(String[] args) throws IOException {
        Scanner entry = new Scanner(System.in);
        String name;
        String lastName;
        String id;
        int age;
        boolean salir = false;
        int option;
        int count = 0;
        String add;
        String search;

        FileManager read[] = new FileManager[1000];
        id iD[] = new id[1000];

        System.out.println("File Manager -> Bryan Chiliquinga");

        while (!salir) {
            System.out.println("\nMenu");
            System.out.println("1. Enter new data");
            System.out.println("2. Save data to file");
            System.out.println("3. Search for a data");
            System.out.println("4. Show all file data");
            System.out.println("5. Exit");
            System.out.print("Enter option: ");
            option = entry.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nHow much new data do you want to enter: ");
                    count = entry.nextInt();
                    for (int i = 0; i < count; i++) {
                        System.out.print("\nEnter name: ");
                        name = entry.next();
                        System.out.print("Enter the last name: ");
                        lastName = entry.next();
                        System.out.print("Enter your age: ");
                        age = entry.nextInt();
                        System.out.print("Enter your id: ");
                        id = entry.next();
                        iD[i] = new id(id);
                        read[i] = new FileManager(name, lastName, id, age);
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        FileManager.add(read[i], iD[i]);
                    }
                    System.out.println("\nThe information has been saved");
                    break;
                case 3:
                    System.out.print("\nWrite the id to search in the file: ");
                    Scanner find = new Scanner(System.in);
                    search = find.nextLine();
                    FileManager.find(search);
                    break;
                case 4:
                    System.out.println("\nThe data in the file is: ");
                    System.out.println("");
                    FileManager.indicate();
                    break;
                case 5:
                    salir = true;
                    break;
            }
        }
    }
}
