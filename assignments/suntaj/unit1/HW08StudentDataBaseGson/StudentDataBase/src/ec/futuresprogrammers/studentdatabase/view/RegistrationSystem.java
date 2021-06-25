/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.futuresprogrammers.studentdatabase.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



import ec.futuresprogrammers.studentdatabase.model.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class RegistrationSystem {
    public static void main(String[] args) throws IOException {
        
         Scanner enter = new Scanner(System.in);
        RegistrationSystem bus =  new RegistrationSystem();
        boolean salir= false;
         int option;
       while(!salir){
        
           
           System.out.println("\n Welcome to the student database "+" \n ");
           System.out.println("\n 1.Enter Information Student ");
           System.out.println("\n 2.Search on Student ");
           System.out.println("\n 3.Exit");
           
           System.out.println("Enter a number ");
             option = enter.nextInt();
             
       }
       
          
           
       
       int numbersId;
       
        String nameStudent;
        int age;
        String sex;
        String civilStatus;
        String nameUniversity;
        String racing;
        int nrc;
        String semester;
        String nameSubjects;
        String jsonStudenInformation = "";
        
       
        
        List<StudentsInformation> studentsInformationList = new ArrayList<StudentsInformation>();
        
        FileWriter file = new FileWriter("./files/StudentDataBase.json");
                
        
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student Information ");
        StudentsInformation si1= new StudentsInformation(nameStudent=sc.next(), numbersId=sc.nextInt(), civilStatus=sc.next(), sex=sc.next(), nameUniversity = sc.next(),nrc=sc.nextInt(),nameSubjects=sc.next());
        StudentsInformation si2= new StudentsInformation(nameStudent=sc.next(), numbersId=sc.nextInt(), civilStatus=sc.next(), sex=sc.next(), nameUniversity = sc.next(),nrc=sc.nextInt(),nameSubjects=sc.next());
        StudentsInformation si3= new StudentsInformation(nameStudent=sc.next(), numbersId=sc.nextInt(), civilStatus=sc.next(), sex=sc.next(), nameUniversity = sc.next(),nrc=sc.nextInt(),nameSubjects=sc.next());
        StudentsInformation si4= new StudentsInformation(nameStudent=sc.next(), numbersId=sc.nextInt(), civilStatus=sc.next(), sex=sc.next(), nameUniversity = sc.next(),nrc=sc.nextInt(),nameSubjects=sc.next());
        StudentsInformation si5= new StudentsInformation(nameStudent=sc.next(), numbersId=sc.nextInt(), civilStatus=sc.next(), sex=sc.next(), nameUniversity = sc.next(),nrc=sc.nextInt(),nameSubjects=sc.next());
        
        
        studentsInformationList.add(si1);
        studentsInformationList.add(si2);
        studentsInformationList.add(si3);
        studentsInformationList.add(si4);
        studentsInformationList.add(si5);
        
        
        System.out.println(" Data of the student ->"+ si1);
        System.out.println(" Data of the student ->"+ si2);
        System.out.println(" Data of the student ->"+ si3);
        System.out.println(" Data of the student ->"+ si4);
        System.out.println(" Data of the student ->"+ si5);
       }
       
        
        public static void searchJson() throws IOException{
             
        int numbersId;
         String nameStudent;
        int age;
        String sex;
        String civilStatus;
        String nameUniversity;
        String racing;
        int nrc;
        String semester;
        String nameSubjects;
               String jsonsi1 = "";
               String jsonsi2 = "";
               String jsonsi3 = "";
               String jsonsi4 = "";
               String jsonsi5 = "";
              
               
         List<StudentsInformation> studentsInformationList = new ArrayList<StudentsInformation>();
        
          FileWriter file = new FileWriter("./files/StudentDataBase.json");
         
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student Information ");
        StudentsInformation si1= new StudentsInformation(nameStudent=sc.next(), numbersId=sc.nextInt(), civilStatus=sc.next(), sex=sc.next(), nameUniversity = sc.next(),nrc=sc.nextInt(),nameSubjects=sc.next());
        StudentsInformation si2= new StudentsInformation(nameStudent=sc.next(), numbersId=sc.nextInt(), civilStatus=sc.next(), sex=sc.next(), nameUniversity = sc.next(),nrc=sc.nextInt(),nameSubjects=sc.next());
        StudentsInformation si3= new StudentsInformation(nameStudent=sc.next(), numbersId=sc.nextInt(), civilStatus=sc.next(), sex=sc.next(), nameUniversity = sc.next(),nrc=sc.nextInt(),nameSubjects=sc.next());
        StudentsInformation si4= new StudentsInformation(nameStudent=sc.next(), numbersId=sc.nextInt(), civilStatus=sc.next(), sex=sc.next(), nameUniversity = sc.next(),nrc=sc.nextInt(),nameSubjects=sc.next());
        StudentsInformation si5= new StudentsInformation(nameStudent=sc.next(), numbersId=sc.nextInt(), civilStatus=sc.next(), sex=sc.next(), nameUniversity = sc.next(),nrc=sc.nextInt(),nameSubjects=sc.next());
        
        
        studentsInformationList.add(si1);
        studentsInformationList.add(si2);
        studentsInformationList.add(si3);
        studentsInformationList.add(si4);
        studentsInformationList.add(si5);
        
        
        System.out.println(" Data of the student ->"+ si1);
        System.out.println(" Data of the student ->"+ si2);
        System.out.println(" Data of the student ->"+ si3);
        System.out.println(" Data of the student ->"+ si4);
        System.out.println(" Data of the student ->"+ si5);
        
        
       GsonBuilder gsonBuilder = new  GsonBuilder();
           Gson gson = gsonBuilder.create();
           jsonsi1 = gson.toJson(si1);
           System.out.println("jsonStudenInformation ->" + jsonsi1);
            System.out.println("jsonStudenInformation ->" + jsonsi2);
            System.out.println("jsonStudenInformation ->" + jsonsi3);
            System.out.println("jsonStudenInformation ->" + jsonsi4);
            System.out.println("jsonStudenInformation ->" + jsonsi5);
           

         
            
             System.out.println("Enter Id Students");
        
        
        
        
         }
        
        
        
        
        
        
        

        
    }
    


