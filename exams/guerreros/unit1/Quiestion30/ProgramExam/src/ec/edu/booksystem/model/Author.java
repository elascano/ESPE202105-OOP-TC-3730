/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.booksystem.model;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Author {
    private String name;
    private String profession;
    private Float salary;

    public Author(String name, String profession, Float salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", profession=" + profession + ", salary=" + salary + '}';
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
     * @return the profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * @param profession the profession to set
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * @return the salary
     */
    public Float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Float salary) {
        this.salary = salary;
    }
    
    
    
    
    
    
    
    
}
