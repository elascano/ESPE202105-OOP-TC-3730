/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.association.model;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class specialRate {
    private float money;
    private String nameOfTheRate;
    
    public void getCustomers() {
    };

    /**
     * @return the money
     */
    public float getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(float money) {
        this.money = money;
    }

    /**
     * @return the nameOfTheRate
     */
    public String getNameOfTheRate() {
        return nameOfTheRate;
    }

    /**
     * @param nameOfTheRate the nameOfTheRate to set
     */
    public void setNameOfTheRate(String nameOfTheRate) {
        this.nameOfTheRate = nameOfTheRate;
    }
    
}
