/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventoryproducts.view;

import futuretheonaccent.inventoryproducts.model.*;



/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class InventoryOfTelecommunicationsProducts {
    public static void main(String[] args) {
        ControlOfProduct controlofproduct=new ControlOfProduct();
        Inventory inventory=new Inventory();
        Product product=new Product();
        ProductSales productsales=new ProductSales();
        ProductStatus productstatus=new ProductStatus();
        Information information=new Information();
        Calculation calculation=new Calculation();
        Element element= new Element();
        Register register= new Register();
        Statistics statistics= new Statistics();
        
        System.out.println("Hello From Inventory Of Telecommunications Products ");
        
        controlofproduct.setName("Método ABC");
        controlofproduct.setCost(15.8F);
        inventory.setName("Inventory of telecomunication products");
        product.setPrice(50.6F);
        product.setName("Routers");
        product.setQuality(Boolean.TRUE);
        product.setQuality(Boolean.FALSE);
        product.setType(1);
        productsales.setGain(99.5F);
        productsales.setLoss(0.7F);
        productstatus.setLoss(14.6F);
        productstatus.setType(5);
        information.setData("Dato de producto en Telecomunicaciones");
        
        System.out.println("controlofproduct ->" + controlofproduct);
        System.out.println(" inventory ->" + inventory);
        System.out.println("product ->" + product);
        System.out.println("productsales ->" + productsales);
        System.out.println("productstatus ->" + productstatus);
        System.out.println("information ->" + information);
        
        
        
        
        
       
        
 } 
}
