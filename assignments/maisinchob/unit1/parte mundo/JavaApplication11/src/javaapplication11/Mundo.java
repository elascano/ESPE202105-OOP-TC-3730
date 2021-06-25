/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class World {
    ListCountry countrylist;
    CityList citylist;
    public World(){
        this.countrylist = new ListCountry();
        this.citylist = new CityList();
    }
    public void addCountry(Country p){
        this.countrylist.addCountry(p);
    }
    public void addCity(City c){
        this.citylist.addCity(c);
    }
    public String getCitiesByCountry(String CountrySearched){
        Country p = this.countrylist.SearchCountry(CountrySearched);
        if (p != null){
            return p .getListCities();
        }
        return "Country not found. ";
    }
    
    public String getDataCity(String WantedCity){
        City c = this.citylist.SearchCity(WantedCity);
        if (c ! = null){
        return c.getNameCountry();
    }
        return "City not found. ";
    }
    
    
  
    
}
