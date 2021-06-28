/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.model;

/**
 *
 * @author Vanessa Cayambe Team of machine Developers
 */
public class Brand {
    private int age;
    private int type;
    private String modelofvehicle;

    @Override
    public String toString() {
        return "Brand{" + "age=" + age + ", type=" + type + ", modelofvehicle=" + modelofvehicle + '}';
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
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the modelofvehicle
     */
    public String getModelofvehicle() {
        return modelofvehicle;
    }

    /**
     * @param modelofvehicle the modelofvehicle to set
     */
    public void setModelofvehicle(String modelofvehicle) {
        this.modelofvehicle = modelofvehicle;
    }
    
    
}
