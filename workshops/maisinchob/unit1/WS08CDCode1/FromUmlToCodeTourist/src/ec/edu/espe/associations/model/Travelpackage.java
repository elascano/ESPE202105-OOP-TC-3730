/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

import java.util.Contents;
import java.util.Promotions;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Travelpackage {
  private Contents[] contents = new Contents[3];
  private float cost;
  private Promotions[] promotions = new Promotions[3];
  
 public void promotionalcombos(){
 } 
 public void modeoftravel(){
 } 
 public void costclassifications(){
 }

    /**
     * @return the contents
     */
    public Contents[] getContents() {
        return contents;
    }

    /**
     * @param contents the contents to set
     */
    public void setContents(Contents[] contents) {
        this.contents = contents;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the promotions
     */
    public Promotions[] getPromotions() {
        return promotions;
    }

    /**
     * @param promotions the promotions to set
     */
    public void setPromotions(Promotions[] promotions) {
        this.promotions = promotions;
    }
}
