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
public class Company {
    
    private int ruc;
    private String personal;
    private String name;
    private Direction[] direction;
    
    public void buy(){
    
    }
    public void sell(){
        
    }
    public void organizePersonal(){
        
    }
    public Supplies inventorySupplies(){
        Supplies supplies = new Supplies();
        
        return supplies;
    }
    public Supplier manageSupplier(){
        Supplier supplier = new Supplier();
        
        return supplier;
        
    }

    @Override
    public String toString() {
        return "Company{" + "ruc=" + ruc + ", personal=" + personal + ", name=" + name + ", direction=" + direction + '}';
    }

    
    /**
     * @return the ruc
     */
    public int getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the personal
     */
    public String getPersonal() {
        return personal;
    }

    /**
     * @param personal the personal to set
     */
    public void setPersonal(String personal) {
        this.personal = personal;
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
     * @return the direction
     */
    public Direction[] getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(Direction[] direction) {
        this.direction = direction;
    }
}
