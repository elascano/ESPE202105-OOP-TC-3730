/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.PurchaseOfPackages.model;

import java.time.LocalDateTime;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class PurchaseOfPackages {
    private String CI;
    private String Names;
    private String User;
    private String password;
    private String customerType;
    private LifeInsurance[] lifeInsurance; 
    private LocalDateTime PlanDate;
    private String PurchaseDescription;

    public PurchaseOfPackages(String CI, String Names, String User, String password, String customerType, LifeInsurance[] lifeInsurance, LocalDateTime PlanDate, String PurchaseDescription) {
        this.CI = CI;
        this.Names = Names;
        this.User = User;
        this.password = password;
        this.customerType = customerType;
        this.lifeInsurance = lifeInsurance;
        this.PlanDate = PlanDate;
        this.PurchaseDescription = PurchaseDescription;
    }
     
    

    
}

    
    

    

    

   
    
    
    
    
    
    
    
    
    

