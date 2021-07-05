/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funtions;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class City {
    private String name;
    private String continent;
    private String coutry;
    private int fundationYear;

    @Override
    public String toString() {
        return "City{" + "name=" + name + ", continent=" + continent + ", coutry=" + coutry + ", fundationYear=" + fundationYear + '}';
    }

    public City(String name, String continent, String coutry, int fundationYear) {
        this.name = name;
        this.continent = continent;
        this.coutry = coutry;
        this.fundationYear = fundationYear;
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
     * @return the coutry
     */
    public String getCoutry() {
        return coutry;
    }

    /**
     * @param coutry the coutry to set
     */
    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    /**
     * @return the fundationYear
     */
    public int getFundationYear() {
        return fundationYear;
    }

    /**
     * @param fundationYear the fundationYear to set
     */
    public void setFundationYear(int fundationYear) {
        this.fundationYear = fundationYear;
    }
    
    
}
