/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventoryproducts.model;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class ProductStatus {
   private int type;
   private Float gain;
   private  Float loss;

public Information label()
{
    Information information=new Information();
    return information; 

    
}
public void display()
{
}

public Inventory analyzeGain()
{
    Inventory inventory= new Inventory();
    return inventory;
    
}


    @Override
    public String toString() {
        return "ProductStatus{" + "type=" + type + ", gain=" + gain + ", loss=" + loss + '}';
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

    /**
     * @return the gain
     */
    public Float getGain() {
        return gain;
    }

    /**
     * @param gain the gain to set
     */
    public void setGain(Float gain) {
        this.gain = gain;
    }

    /**
     * @return the loss
     */
    public Float getLoss() {
        return loss;
    }

    /**
     * @param loss the loss to set
     */
    public void setLoss(Float loss) {
        this.loss = loss;
    }
    
    
}
