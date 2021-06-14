/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrtizMarlon.constructor.model;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Country {
    private String name;
    private String continent;
    private String idiom;

    public Country(String name, String continent, String idiom) {
        this.name = name;
        this.continent = continent;
        this.idiom = idiom;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", continent=" + continent + ", idiom=" + idiom + '}';
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
    
    
    
    
}
