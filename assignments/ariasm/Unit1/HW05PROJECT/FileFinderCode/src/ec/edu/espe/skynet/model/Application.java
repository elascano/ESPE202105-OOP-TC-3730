/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.skynet.model;

import java.util.ArrayList;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class Application {
    private String name;
    private double wright;
    private float version;
    private ArrayList<Type> Administrator = new ArrayList<>();

    @Override
    public String toString() {
        return "Application{" + "name=" + name + ", wright=" + wright + ", version=" + version + ", Administrator=" + Administrator + '}';
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
     * @return the wright
     */
    public double getWright() {
        return wright;
    }

    /**
     * @param wright the wright to set
     */
    public void setWright(double wright) {
        this.wright = wright;
    }

    /**
     * @return the version
     */
    public float getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(float version) {
        this.version = version;
    }

    /**
     * @return the Administrator
     */
    public ArrayList<Type> getAdministrator() {
        return Administrator;
    }

    /**
     * @param Administrator the Administrator to set
     */
    public void setAdministrator(ArrayList<Type> Administrator) {
        this.Administrator = Administrator;
    }

}
