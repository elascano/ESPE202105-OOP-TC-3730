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
public class TraditionalFood {
    private String name;
    private ArrayList<TraditionalFood> listTraditionalFood;
    
     public String getinfo3(){
        String m= "";
        m += "\n Info of "+ this.getName() + ":";
        m +="\n Encebolldo"+ this.listTraditionalFood;
       
        
        
      for(TraditionalFood food : this.getListTraditionalFood()) {
            
            m +="\n\t"+food.getName();
        }
        return m;
     }

    public TraditionalFood(String name) {
        this.name = name;
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
     * @return the listTraditionalFood
     */
    public ArrayList<TraditionalFood> getListTraditionalFood() {
        return listTraditionalFood;
    }

    /**
     * @param listTraditionalFood the listTraditionalFood to set
     */
    public void setListTraditionalFood(ArrayList<TraditionalFood> listTraditionalFood) {
        this.listTraditionalFood = listTraditionalFood;
    }
    
    
    
}
