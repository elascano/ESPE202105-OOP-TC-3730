/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hub.skynet.basiccode.model;

import java.util.ArrayList;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class Community {
    private String name;
    private float size;
    private String sex;
    private ArrayList<Student> student = new ArrayList<>();
    
    public void analyze(){
        
    }
    public void comment(){
        
    }

    @Override
    public String toString() {
        return "Community{" + "name=" + getName() + ", size=" + getSize() + ", sex=" + getSex() + ", student=" + getStudent() + '}';
    }
    public void giveyouropinion(){
        
    }
    public Student add(Student student){
        Student people = new Student();
        
        return people;
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
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the student
     */
    public ArrayList<Student> getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }
}
