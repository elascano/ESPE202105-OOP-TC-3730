/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

import java.util.ArrayList;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Country {
    private String name;
    private double numberOfInHabitants;
     private String idiom;
     private String continent;
     private ArrayList<City> listCitys;

    public Country(String name, double numberofinhabitants, String idiom, String continent) {
        this.name = name;
        this.numberOfInHabitants = numberofinhabitants;
        this.idiom = idiom;
        this.continent = continent;
        this.listCitys= new ArrayList<>();
    }
    
   
    public String getinfo(){
        String date = "";
        date += "\n Info of "+ this.getName() + ":";
        date +="\n Number of inhabitants: " +this.getNumberOfInHabitants();
        date +="\n idiom: "+ this.getIdiom();
        date +="\n continet: "+ this.getContinent();
      
 
       for(City citys : this.getListCitys()) {
            
            date +="\n\t"+citys.getName();
        }
        return date;
    
    }
    
    public void addCitys(City citys){
        this.getListCitys().add(citys);
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
     * @return the numberOfInHabitants
     */
    public double getNumberOfInHabitants() {
        return numberOfInHabitants;
    }

    /**
     * @param numberOfInHabitants the numberOfInHabitants to set
     */
    public void setNumberOfInHabitants(double numberOfInHabitants) {
        this.numberOfInHabitants = numberOfInHabitants;
    }

    /**
     * @return the idiom
     */
    public String getIdiom() {
        return idiom;
    }

    /**
     * @param idiom the idiom to set
     */
    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }

    /**
     * @return the country
     */
 
    /**
     * @return the listCitys
     */
    public ArrayList<City> getListCitys() {
        return listCitys;
    }

    /**
     * @param listCitys the listCitys to set
     */
    public void setListCitys(ArrayList<City> listCitys) {
        this.listCitys = listCitys;
    }

    /**
     * @return the continent
     */
    public String getContinent() {
        return continent;
    }

    /**
     * @param continent the continent to set
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }
            }
