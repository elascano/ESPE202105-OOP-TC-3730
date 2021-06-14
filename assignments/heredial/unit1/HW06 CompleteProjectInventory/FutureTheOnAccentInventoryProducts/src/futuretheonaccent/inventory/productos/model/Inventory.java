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
public class Inventory {
    private Control[] control;
    private Balance[] balance;
    private String name;
    
    
    public Supplies manageSupplies(){
        Supplies supplies = new Supplies();
        return supplies;
        
        
    }
    
    public Balance calculateBalance(){
        Balance balances = new Balance();
        return balances;
        
       
    }
    
    public Supplies checkSupplies(){  
        Supplies supplies = new Supplies();
        return supplies;
       
    }
    
    public void seatName(){
        
    }
    
    public void registerWealth(){
        
    }
    
    public Company returnCompany(){
        Company company = new Company();
        return company;
        
        
    }

    @Override
    public String toString() {
        return "Inventory{" + "control=" + control + ", balance=" + balance + ", name=" + name + '}';
    }

    /**
     * @return the control
     */
    public Control[] getControl() {
        return control;
    }

    /**
     * @param control the control to set
     */
    public void setControl(Control[] control) {
        this.control = control;
    }

    /**
     * @return the balance
     */
    public Balance[] getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(Balance[] balance) {
        this.balance = balance;
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
            
}
