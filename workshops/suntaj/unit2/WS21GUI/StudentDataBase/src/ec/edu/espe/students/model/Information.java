/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.students.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class Information {
  private  String name;
  private  String universityName;
  private  String carrier;
  private  String studentCode;
 
  private  String gender;
  private  int grades;
    
  private  ArrayList<Subject> subject ;
  private  LocalDateTime birthayDate;
  private  int monthStudent;

    public Information(String name, String universityName, String carrier, String studentCode, String gender, int grades, ArrayList<Subject> subject, LocalDateTime birthayDate, int monthStudent) {
        this.name = name;
        this.universityName = universityName;
        this.carrier = carrier;
        this.studentCode = studentCode;
        this.gender = gender;
        this.grades = grades;
        this.subject = subject;
        this.birthayDate = birthayDate;
        this.monthStudent = monthStudent;
    }

   
    public void add(Information information){
        //TODO add information to dtabase
        // T
    }
    
    
    public void search(int ID){
        
    }

  
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the universityName
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * @param universityName the universityName to set
     */
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    /**
     * @return the carrier
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * @param carrier the carrier to set
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * @return the studentCode
     */
    public String getStudentCode() {
        return studentCode;
    }

    /**
     * @param studentCode the studentCode to set
     */
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the grades
     */
    public int getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(int grades) {
        this.grades = grades;
    }

    /**
     * @return the subject
     */
    public ArrayList<Subject> getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }

    /**
     * @return the birthayDate
     */
    public LocalDateTime getBirthayDate() {
        return birthayDate;
    }

    /**
     * @param birthayDate the birthayDate to set
     */
    public void setBirthayDate(LocalDateTime birthayDate) {
        this.birthayDate = birthayDate;
    }

    /**
     * @return the monthStudent
     */
    public int getMonthStudent() {
        return monthStudent;
    }

    /**
     * @param monthStudent the monthStudent to set
     */
    public void setMonthStudent(int monthStudent) {
        this.monthStudent = monthStudent;
    }

}