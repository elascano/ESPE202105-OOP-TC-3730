/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epe.studentaplicationjson.model;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class Information {
    private String name;
    private int age;
    private String University;
    private String semester;
    private String racing;

    
    public void write()
    {
        
    }
    public void establish()
    {
        
    }
    public void identify()
    {
        
    }
    public void describe()
    {
        
    }
    
   

    public Information(String name, int age, String University, String semester, String racing) {
        this.name = name;
        this.age = age;
        this.University = University;
        this.semester = semester;
        this.racing = racing;
    }

    @Override
    public String toString() {
        return "Information{" + "name=" + getName() + ", age=" + getAge() + ", University=" + getUniversity() + ", semester=" + getSemester() + ", racing=" + getRacing() + '}';
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
     * @return the University
     */
    public String getUniversity() {
        return University;
    }

    /**
     * @param University the University to set
     */
    public void setUniversity(String University) {
        this.University = University;
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
