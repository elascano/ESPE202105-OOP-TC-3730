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
public class Inventory {
  private  String name;
  private  Product[] products;
  private  String listOfProducts;
  private  Information[] information;
  private  ControlOfProduct[] controls;
  
  public void saveProduct(Product product)
  { 
  }

  public void organizeProduct()
  { 
      
  }
  
  public Product depositProduct(String name)
  {
      Product product= new Product();
      return product;
  }
  
  public Product present(Information information)
  {
      Product product= new Product();
      return product;
   
  }

    @Override
    public String toString() {
        return "Inventory{" + "name=" + name + ", products=" + products + ", listOfProducts=" + listOfProducts + ", information=" + information + ", controls=" + controls + '}';
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
     * @return the products
     */
    public Product[] getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(Product[] products) {
        this.products = products;
    }

    /**
     * @return the listOfProducts
     */
    public String getListOfProducts() {
        return listOfProducts;
    }

    /**
     * @param listOfProducts the listOfProducts to set
     */
    public void setListOfProducts(String listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

   
    /**
     * @return the controls
     */
    public ControlOfProduct[] getControls() {
        return controls;
    }

    /**
     * @param controls the controls to set
     */
    public void setControls(ControlOfProduct[] controls) {
        this.controls = controls;
    }

    /**
     * @return the information
     */
    public Information[] getInformation() {
        return information;
    }

    /**
     * @param information the information to set
     */
    public void setInformation(Information[] information) {
        this.information = information;
    }

 
}
