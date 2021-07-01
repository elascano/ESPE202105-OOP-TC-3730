/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CityProyect.model;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class City {
    private int id;
    private String name;
    private String continent;
    private String country;
    private int numberOfProvinces;
    private String turistPlace;

    public City(int id, String name, String continent, String country, int numberOfProvinces, String turistPlace) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.country = country;
        this.numberOfProvinces = numberOfProvinces;
        this.turistPlace = turistPlace;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the numberOfProvinces
     */
    public int getNumberOfProvinces() {
        return numberOfProvinces;
    }

    /**
     * @param numberOfProvinces the numberOfProvinces to set
     */
    public void setNumberOfProvinces(int numberOfProvinces) {
        this.numberOfProvinces = numberOfProvinces;
    }

    /**
     * @return the turistPlace
     */
    public String getTuristPlace() {
        return turistPlace;
    }

    /**
     * @param turistPlace the turistPlace to set
     */
    public void setTuristPlace(String turistPlace) {
        this.turistPlace = turistPlace;
    }


}
