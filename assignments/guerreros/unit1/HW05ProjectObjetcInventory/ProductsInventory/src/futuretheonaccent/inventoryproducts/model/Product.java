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
public class Product {
   private String name;
   private int type;
    private Float price;
   private  Boolean quality;
   private  Element[] elements;

   public void sellProduct()
   {
   }
   
   public void export()
   {
   }
   
   public void distributeProduct()
   {
      
   }
   
   public Product view()
   {
       Product product=new Product();
       return product;
       
   }
   
   public void establishProductStatus()
   {
   }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", type=" + type + ", price=" + price + ", quality=" + quality + ", elements=" + elements + '}';
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
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return the quality
     */
    public Boolean getQuality() {
        return quality;
    }

    /**
     * @param quality the quality to set
     */
    public void setQuality(Boolean quality) {
        this.quality = quality;
    }

    /**
     * @return the elements
     */
    public Element[] getElements() {
        return elements;
    }

    /**
     * @param elements the elements to set
     */
    public void setElements(Element[] elements) {
        this.elements = elements;
    }
    
    
}
