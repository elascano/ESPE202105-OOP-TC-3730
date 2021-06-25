/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasestudent.model;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class University {
    private String nameUniversity;
    private String racing;
    private int studentCode;
    
    
    
    
    public void catagorizeStudents()
    {
        
    }   
    public void establishCourse()
    {
        
    }
    public void placeRacing()
    {
        
        
    } 

    public University(String nameUniversity, String racing, int studentCode) {
        this.nameUniversity = nameUniversity;
        this.racing = racing;
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "University{" + "nameUniversity=" + getNameUniversity() + ", racing=" + getRacing() + ", studentCode=" + getStudentCode() + '}';
    }

    /**
     * @return the nameUniversity
     */
    public String getNameUniversity() {
        return nameUniversity;
    }

    /**
     * @param nameUniversity the nameUniversity to set
     */
    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
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

    /**
     * @return the studentCode
     */
    public int getStudentCode() {
        return studentCode;
    }

    /**
     * @param studentCode the studentCode to set
     */
    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

   
   
    }

    
    
    
    

  
    
    

