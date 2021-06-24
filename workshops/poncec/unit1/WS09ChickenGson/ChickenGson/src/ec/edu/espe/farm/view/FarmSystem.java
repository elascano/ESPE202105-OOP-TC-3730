/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Camilo Ponce Builder Program ESPE-DCCO
 */
public class FarmSystem {
    

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("ChFarmSimulator,"+"Camilo");
        Chicken chicken;
        //TODO reading from keyboard
        int id;
        String name;  
        String color; 
        Date age; 
        Date born0n; 
        boolean molting; 
        int eggCounter; 
        
        id = 0;
        name = "Lucy";
        color = "white";
        age = new Date();
        born0n = new Date();
        molting =true;
        eggCounter = 0;
        
        chicken = new Chicken(id, name, color, age, born0n, molting);
        System.out.println("chicken ->" + chicken);
       
        
        Chicken chickens[]= new Chicken[10];
        chicken = new Chicken(id, name, color, age, born0n, molting);
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Maruja", "black", new Date(), new Date(), false);
        System.out.println("Ryan:" + chickens [0]);
        System.out.println("Jeremiah" + chickens [1]);
        String jsonChicken = "{\"id\";\"1\"}";
        System.out.println("Maruja"+ jsonChicken);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson= gsonBuilder.create();
        jsonChicken =gson.toJson(chickens[0]);
        System.out.println("Ryan:"+jsonChicken);
        jsonChicken =gson.toJson(chickens[1]);
        
        System.out.println("Jeremiah:"+jsonChicken);
        
        Chicken chicken3;
        chicken3 = gson.fromJson(jsonChicken,Chicken.class);
        System.out.println("chcicken object name"+chicken3.getName());
    }

    private static class GsonBuilder {

        public GsonBuilder() {
        }

        private Gson create() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Gson {

        public Gson() {
        }

        private String toJson(Chicken chicken) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Chicken fromJson(String jsonChicken, Class<Chicken> aClass) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

   