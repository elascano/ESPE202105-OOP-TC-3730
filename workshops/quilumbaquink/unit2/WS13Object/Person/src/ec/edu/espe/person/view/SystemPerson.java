/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.person.view;

import com.google.gson.Gson;
import ec.edu.espe.Filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.Scanner;
import ec.edu.espe.person.model.Person;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class SystemPerson {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter your ID number: ");
        int id= read.nextInt();
        System.out.println("Enter your age : ");
        int age= read.nextInt();
        System.out.println("Enter your name: ");
        String name= read.next();
        System.out.println("Which is your height?: ");
        float height= read.nextFloat();
        System.out.println("What is your weight?: ");
        float weight= read.nextFloat();
        System.out.println("Enter your gender: ");
        String gender= read.next();
        
        Gson gson= new Gson();

        ArrayList<String> personArray= new ArrayList();
        Person person = new Person(id,age,name,height,weight,gender);
        String PersonDataJson = gson.toJson(person);
        FileManager.save("PersonList.json", PersonDataJson);
        personArray  = FileManager.findAll("PersonList.json"); 
        System.out.println(personArray);
        System.out.println("Number of people admitted: "+personArray.size());
        
    }
    
}
