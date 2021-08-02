/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.PurchaseOfPackages.controller;

import ec.edu.espe.PurchaseOfPackages.model.PurchaseOfPackages;
import java.time.LocalDateTime;
import java.util.ArrayList;
import ec.edu.espe.PurchaseOfPackages.view.FrmPurchasePackage;
/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class PurchaseOfPackagesController {
   private PurchaseOfPackages purchaseOfPackages;
   private FrmPurchasePackage frmpurchaseOfPackages;
   private boolean update;
   
   
   public void add(PurchaseOfPackages purchaseOfPackages){
       //TODO add purchaseOfPackages to database
       //TODO call the utils classes
   }
   public ArrayList<PurchaseOfPackages>find (String user){
       ArrayList<PurchaseOfPackages> purchase = new ArrayList<>();
       //TODO find the purchaseOfPackages by user using utils
       
   PurchaseOfPackages purchaseOfPackages = new PurchaseOfPackages("Bryan", "Bryan98", "password", "customerType", "0982334715", "description", "0394", LocalDateTime.MIN);
        purchase.add(purchaseOfPackages);
        return purchase;
                
    }
    
   public boolean delete(String user){
        boolean deleted=false;
        //TODO 
        ArrayList<PurchaseOfPackages> purchase = new ArrayList<>();
        purchase = find(user);
        if (purchase.size()>0){
            deleted = true;
        }
        return isUpdate();
    }

    public PurchaseOfPackagesController(PurchaseOfPackages purchaseOfPackages, FrmPurchasePackage frmpurchaseOfPackages) {
        this.purchaseOfPackages = purchaseOfPackages;
        this.frmpurchaseOfPackages = frmpurchaseOfPackages;
    }

    /**
     * @return the purchaseOfPackages
     */
    public PurchaseOfPackages getPurchaseOfPackages() {
        return purchaseOfPackages;
    }

    /**
     * @param purchaseOfPackages the purchaseOfPackages to set
     */
    public void setPurchaseOfPackages(PurchaseOfPackages purchaseOfPackages) {
        this.purchaseOfPackages = purchaseOfPackages;
    }

    /**
     * @return the frmpurchaseOfPackages
     */
    public FrmPurchasePackage getFrmpurchaseOfPackages() {
        return frmpurchaseOfPackages;
    }

    /**
     * @param frmpurchaseOfPackages the frmpurchaseOfPackages to set
     */
    public void setFrmpurchaseOfPackages(FrmPurchasePackage frmpurchaseOfPackages) {
        this.frmpurchaseOfPackages = frmpurchaseOfPackages;
    }

    /**
     * @return the update
     */
    public boolean isUpdate() {
        return update;
    }

    /**
     * @param update the update to set
     */
    public void setUpdate(boolean update) {
        this.update = update;
    }

    


   
   
   
}
