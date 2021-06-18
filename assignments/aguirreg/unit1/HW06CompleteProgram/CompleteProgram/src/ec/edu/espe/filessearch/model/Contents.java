/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filessearch.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Contents {
    private String name;
    private String nickname;
    private SizeOccupied[] occupied;
    private Ubication[] ubication;
    private Category[] categories;
    private SizeFree[] freeSpace;
    
    public void ClasificationFiles(){
        
    }
    
    public void FilterFiles(){
        
    }
    
    public Results ShowResults(){
        Results results = new Results();
         
        return results;
    }

    @Override
    public String toString() {
        return "Contents{" + "name=" + name + ", nickname=" + nickname + ", occupied=" + occupied + ", ubication=" + ubication + ", categories=" + categories + ", freeSpace=" + freeSpace + '}';
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
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the occupied
     */
    public SizeOccupied[] getOccupied() {
        return occupied;
    }

    /**
     * @param occupied the occupied to set
     */
    public void setOccupied(SizeOccupied[] occupied) {
        this.occupied = occupied;
    }

    /**
     * @return the ubication
     */
    public Ubication[] getUbication() {
        return ubication;
    }

    /**
     * @param ubication the ubication to set
     */
    public void setUbication(Ubication[] ubication) {
        this.ubication = ubication;
    }

    /**
     * @return the categories
     */
    public Category[] getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    /**
     * @return the freeSpace
     */
    public SizeFree[] getFreeSpace() {
        return freeSpace;
    }

    /**
     * @param freeSpace the freeSpace to set
     */
    public void setFreeSpace(SizeFree[] freeSpace) {
        this.freeSpace = freeSpace;
    }
   
}
