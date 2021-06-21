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
public class University {
   private String name;
   private Students[] student;
   private int course;
   private String racing;
    
   
   public void  catagorizeStudent()
   {
   }
   
   public void establishCourse()
   {
       
   }
   public void placeRacing()
   {
       
   }

    @Override
    public String toString() {
        return "University{" + "name=" + name + ", student=" + student + ", course=" + course + ", racing=" + racing + '}';
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
     * @return the student
     */
    public Students[] getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Students[] student) {
        this.student = student;
    }

    /**
     * @return the course
     */
    public int getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(int course) {
        this.course = course;
    }

    /**
     * @return the racing
     */
    public String getRacing() {
        return racing;
    }

    /**
     * @param racing the racing to set
     */
    public void setRacing(String racing) {
        this.racing = racing;
    }
    
    
}
