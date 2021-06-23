/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.futuresprogrammers.studentdatabase.view;
import ec.futuresprogrammers.studentdatabase.model.*;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class RegistrationSystem {
    public static void main(String[] args) {
        
        Course course = new Course();
        DataInformations dataInformations = new DataInformations();
        ID id = new ID();
        StudentInformation studentInformation = new StudentInformation();
        Students students = new Students ();
        Subject subject = new Subject();
        University  university = new University ();
        
        
         System.out.println("Hello From Student DateBase");
         
         course.setNrc(3730);
         id.setNumber(1750839670);
         id.setSex("Feminine");
         id.setCivilStatus("single");
         studentInformation.setName("Gabriela");
         studentInformation.setAge(19);
         studentInformation.setSemester("Second");
         subject.setName("Programming");
         university.setName("ESPE");
         university.setRacing("Telecommunications Engineering");
         
         System.out.println("course->"+course);
         System.out.println("id->"+id);
         System.out.println("studentInformation->" + studentInformation);
         System.out.println("subject->"+subject);
         System.out.println("university->"+university);
         
         
         
         
        
        
    }
    
}
