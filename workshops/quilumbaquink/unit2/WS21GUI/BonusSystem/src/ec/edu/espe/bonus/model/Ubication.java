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
public class Ubication implements Comparable<Ubication>
{
private String name;
private String lastname;
private String region;
private String province;        

    public Ubication(String name, String lastname, String region, String province) {
        this.name = name;
        this.lastname = lastname;
        this.region = region;
        this.province = province;
    }

    public Ubication(String name, String lastname, String province) {
        this.name = name;
        this.lastname = lastname;
        this.province = province;
    }

    @Override
    public String toString() {
        return "Ubication{" + "name=" + name + ", lastname=" + lastname + ", region=" + region + ", province=" + province + '}';
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
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public int compareTo(Ubication o) 
    {
        
        if (o.getRegion()=="Amazonia")
        {    
        return -10; }
    
        else if(o.getRegion()=="Costa")
        {return 1;}
        
        //if(o.getRegion()=="Sierra") 
        //{return -1;}
    return 0;
        
    }}  
  

