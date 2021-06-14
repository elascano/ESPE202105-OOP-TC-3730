/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.products.view;

import futuretheonaccent.inventory.productos.model.*;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class FutureTheOnAccentInventoryProducts {
    public static void main(String[] args) {
        
        Balance balance = new Balance();
        Capacity capacity = new Capacity();
        Code code = new Code();
        Company company = new Company();
        Control control = new Control();
        Direction direction = new Direction();
        Inventory inventory = new Inventory();
        Quality quality = new Quality();
        Supplier supplier = new Supplier();
        Supplies supplies = new Supplies();
        Warehouse warehouse = new Warehouse();
        
         
         System.out.println("Hello From Inventory Of Telecommunications Products  , \n" + "Luis Heredia ");
         
         balance.setPurcharses(156.5F);
         balance.setSales(489.56F);
         inventory.setName("ANTENA");
         code.setLetters("AAI");
         code.setNumbre(7501);
         warehouse.setCategory("COMUNICATION");
         capacity.setDimension(15);
         capacity.setMeasurementSystem("METERS");
         supplies.seeModel(5);
         supplies.setColor("BLUE");
         supplies.setName("RED");
         quality.setCredibility('A');
         quality.setQualification(10);
         company.setName("CONECTION WORD");
         company.setPersonal("Miguel Bermeo");
         company.setRuc(156798564);
         supplier.setName("Leandro Arcos");
         supplier.setRuc(1231476848);
         supplier.setTelephone(2699116);
         direction.setNumber(388);
         direction.setTex("AV MORAN VALVERDE CASA:");
         
         
         System.out.println("balance->" +  balance);
         System.out.println("inventory->" + inventory);
         System.out.println("code->" + code);
         System.out.println("warehouse->" + warehouse);
         System.out.println("capacity->" + capacity);
         System.out.println("supplies->" + supplies);
         System.out.println("quality->" + quality);
         System.out.println("company->" + company);
         System.out.println("supplier->" + supplier);
         System.out.println("direction->" + direction);
         
    }
    
}
