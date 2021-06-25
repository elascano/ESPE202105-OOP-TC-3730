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
public class Course {
    private String semester;
    private int nrc;

    public Course(String semester, int nrc) {
        this.semester = semester;
        this.nrc = nrc;
    }

    @Override
    public String toString() {
        return "Course{" + "semester=" + getSemester() + ", nrc=" + getNrc() + '}';
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
    
    
    
        
    }
    

