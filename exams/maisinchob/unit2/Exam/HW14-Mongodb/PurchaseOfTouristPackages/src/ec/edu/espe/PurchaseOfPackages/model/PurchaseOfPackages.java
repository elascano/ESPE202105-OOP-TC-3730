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
    private String customerName;
    private String userName;
    private String password;
    private String customerType;
    private String phoneNumber;
    private String description;
    private String CI;
     
    private LocalDateTime purchasedPlanDate;

    public PurchaseOfPackages(String customerName, String userName, String password, String customerType, String phoneNumber, String description, String CI, LocalDateTime purchasedPlanDate) {
        this.customerName = customerName;
        this.userName = userName;
        this.password = password;
        this.customerType = customerType;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.CI = CI;
        this.purchasedPlanDate = purchasedPlanDate;
    }

    
    

    

    

   
    
    
    
    
    
    
    
    
    
}
