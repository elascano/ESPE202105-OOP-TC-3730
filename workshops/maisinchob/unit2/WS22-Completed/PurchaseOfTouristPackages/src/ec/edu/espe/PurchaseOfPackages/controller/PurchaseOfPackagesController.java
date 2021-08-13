/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.PurchaseOfPackages.controller;

import ec.edu.espe.PurchaseOfPackages.model.LifeInsurance;
import ec.edu.espe.PurchaseOfPackages.model.PurchaseOfPackages;
import java.time.LocalDateTime;
import java.util.ArrayList;
import ec.edu.espe.PurchaseOfPackages.view.FrmPurchasePackage;
import utils.DBManager;
import utils.PersistenceI;
/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class PurchaseOfPackagesController {
   private PurchaseOfPackages purchaseOfPackages;
   private FrmPurchasePackage frmpurchaseOfPackages;
   private boolean update;
   private PersistenceI persistence;
   
   
   public void add(PurchaseOfPackages purchaseOfPackages){
       //TODO add purchaseOfPackages to database
       //TODO call the utils classes
       persistence = new DBManager();
       //TODO convert contact to json;
       String purchaseOfPackagesJson= "{\"firstname\":\"Bryan\"}";
       persistence.create(purchaseOfPackagesJson, "purchase of tourist ticket");
   }
   public ArrayList<PurchaseOfPackages>find (String user){
       ArrayList<PurchaseOfPackages> purchase = new ArrayList<>();
       //TODO find the purchaseOfPackages by user using utils
       
   PurchaseOfPackages purchaseOfPackages = new PurchaseOfPackages("23844949430202", "Bryan Steven", "Bryan98", "MSI232425", "Student",new LifeInsurance[4] , LocalDateTime.MIN, "hellow");
        purchase.add(purchaseOfPackages);
        return purchase;
               
    }
    
      
           
   public boolean delete(String user){
        boolean deleted=false;
        //TODO 
        ArrayList<PurchaseOfPackages> purchase = new ArrayList<>();
        purchase = find(user);
        if (purchase.size()>0){
            //TODO delete from data base
            deleted = true;
        }
        return deleted ;
    }

   
   
   public boolean update(String user){
        boolean update=false;
        //TODO 
        ArrayList<PurchaseOfPackages> purchase = new ArrayList<>();
        purchase = find(user);
        if (purchase.size()>0){
            //TODO save from data base
            update = true;
        }
        return update ;
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
