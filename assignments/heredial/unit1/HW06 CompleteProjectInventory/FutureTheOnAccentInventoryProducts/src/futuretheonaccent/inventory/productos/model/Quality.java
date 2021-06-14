/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.productos.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Quality {
  
    private int qualification;
    private char credibility;

    @Override
    public String toString() {
        return "Quality{" + "qualification=" + qualification + ", credibility=" + credibility + '}';
    }

    
    /**
     * @return the qualification
     */
    public int getQualification() {
        return qualification;
    }

    /**
     * @param qualification the qualification to set
     */
    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    /**
     * @return the credibility
     */
    public char getCredibility() {
        return credibility;
    }

    /**
     * @param credibility the credibility to set
     */
    public void setCredibility(char credibility) {
        this.credibility = credibility;
    }
    
  }

