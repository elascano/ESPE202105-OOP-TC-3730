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
public class ProductSales {
  private Float gain;
  private Float loss;
  private  Calculation[] calculations;
  
  public Product assess()
  {
      Product product= new Product();
      return product;
  }
  public void examine()
  {
  }
  public void detailTheSaleOfTheProduct()
  {
  }

    @Override
    public String toString() {
        return "ProductSales{" + "gain=" + gain + ", loss=" + loss + ", calculations=" + calculations + '}';
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

    /**
     * @return the calculations
     */
    public Calculation[] getCalculations() {
        return calculations;
    }

    /**
     * @param calculations the calculations to set
     */
    public void setCalculations(Calculation[] calculations) {
        this.calculations = calculations;
    }
   
}
