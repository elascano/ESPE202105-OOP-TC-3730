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
public class SpecialPension {
    private float amount;
    private int type;

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SpecialPension{" + "amount=" + amount + ", type=" + type + '}';
    }
    
    
}
