/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.association.model;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class Group {
    private int ageRange;
    private String genderType;
    
    public Bonus receiveTheBonus(){
        Bonus bonus = new Bonus();
        return(bonus);
    }
    

    
            

    /**
     * @return the ageRange
     */
    public int getAgeRange() {
        return ageRange;
    }

    /**
     * @param ageRange the ageRange to set
     */
    public void setAgeRange(int ageRange) {
        this.ageRange = ageRange;
    }

    /**
     * @return the genderType
     */
    public String getGenderType() {
        return genderType;
    }

    /**
     * @param genderType the genderType to set
     */
    public void setGenderType(String genderType) {
        this.genderType = genderType;
    }

    @Override
    public String toString() {
        return "Group{" + "ageRange=" + ageRange + ", genderType=" + genderType + '}';
    }
    
    
}
