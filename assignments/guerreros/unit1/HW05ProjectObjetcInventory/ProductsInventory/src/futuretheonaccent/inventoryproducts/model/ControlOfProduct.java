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
public class ControlOfProduct {
    private Float cost;
    private String name;
    private Boolean availability;
    private Register[] registers;
    
    public Register search()
    { 
        Register register= new Register();
        return register;
        
    }
    public void indicate()
    {
    }
    
    public void establish()
    {
    }
    
    public Inventory detailProductSales()
    {
        Inventory inventory= new Inventory();
        return inventory;
    }

    @Override
    public String toString() {
        return "ControlOfProduct{" + "cost=" + cost + ", name=" + name + ", availability=" + availability + ", registers=" + registers + '}';
    }
    

    /**
     * @return the cost
     */
    public Float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(Float cost) {
        this.cost = cost;
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
     * @return the availability
     */
    public Boolean getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    /**
     * @return the registers
     */
    public Register[] getRegisters() {
        return registers;
    }

    /**
     * @param registers the registers to set
     */
    public void setRegisters(Register[] registers) {
        this.registers = registers;
    }
    
    
    
}
