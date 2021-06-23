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
public class Course {
  
   private int nrc;
   private Students[] student;
   private String subjectName;
    
   
   public void determineNrc()
   {
       
   }
   public void identifyStudents()
   {
       
   }
    
    public void establisSubjectName()
    {
        
    }

    @Override
    public String toString() {
        return "Course{" + "nrc=" + getNrc() + ", student=" + getStudent() + ", subjectName=" + getSubjectName() + '}';
    }

    /**
     * @return the nrc
     */
    public int getNrc() {
        return nrc;
    }

    /**
     * @param nrc the nrc to set
     */
    public void setNrc(int nrc) {
        this.nrc = nrc;
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
     * @return the subjectName
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * @param subjectName the subjectName to set
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    
    
    
    
    
    
}
