/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bonus.model;

/**
 *
 * @author Camilo Ponce Program Builder ESPE-DCCO
 */
public class Gender implements Comparable<Gender> 
{
  private String name;
  private String Lastname;
  private String Gender;

    public Gender(String name, String Lastname, String Gender) {
        this.name = name;
        this.Lastname = Lastname;
        this.Gender = Gender;
    }

    public Gender(String name, String Lastname) {
        this.name = name;
        this.Lastname = Lastname;
    }

    @Override
    public String toString() {
        return "Gender{" + "name=" + name + ", Lastname=" + Lastname + ", Gender=" + Gender + '}';
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
     * @return the Lastname
     */
    public String getLastname() {
        return Lastname;
    }

    /**
     * @param Lastname the Lastname to set
     */
    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    @Override
    public int compareTo(Gender u) 
    {
        if (u.getGender()=="Masculino"){    
        return 1; }
      return -1;

   }}