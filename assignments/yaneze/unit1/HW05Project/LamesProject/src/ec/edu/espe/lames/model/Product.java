/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.model;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class Product {
    private String name;
    private String specification;
    private float cost;
    public void inventory(){
        
    }
    public ElectronicMaterial productSelected(){
        ElectronicMaterial e = new ElectronicMaterial();
        return e;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", specification=" + specification + ", cost=" + cost + '}';
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
     * @return the specification
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * @param specification the specification to set
     */
    public void setSpecification(String specification) {
        this.specification = specification;
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
    
    
    
}
