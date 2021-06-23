/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.futuresprogrammers.studentdatabase.model;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class StudentInformation {
   private String name;
   private int age;
   private int ID;
   private String semester;
   
   public void introduceName()
   {
    
   }
   public void identifyAge()
   {
   }
   public void determineSemester()
   {
       
   }
    
    @Override
    public String toString() {
        return "StudentInformation{" + "name=" + name + ", age=" + age + ", ID=" + ID + ", semester=" + semester + '}';
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }
           
           
           
}