/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Born;
import ec.edu.espe.farm.model.Chicken1;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class FarmsSystem {
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        int option;
        System.out.print("\n 1.Save json ");
        System.out.print("\n 2.Read json  ");
        System.out.print("\n 3.Save csv ");
        System.out.print("\n 4.Read csv ");
        System.out.print("\n Enter a option: ");
        option=read.nextInt();
        Chicken1 chicken;
        Born born;
        //reading from keyboard
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        
        Chicken1 [] chickens=new Chicken1[1];
        Born [] bornOn1=new Born[1];
        
        for(int i=0;i<chickens.length;i++){
            System.out.print("Chicken[%d] "+ i);
            System.out.println("\n Enter the id: ");
            id=read.nextInt();
            System.out.println("\n Hen's name: ");
            name=read.next();
            System.out.println("\n Hen color: ");
            color=read.next();
            System.out.println("\n Enter the molting: ");
            molting=read.nextBoolean();
            System.out.println("\n How many eggs does the hen lay: ");
            eggCounter=read.nextInt();
            System.out.println("\n Enter the born on: ");
            System.out.println("\n Day: ");
            int day=read.nextInt();
            System.out.println("\n Month: ");
            int month=read.nextInt();
            System.out.println("\n Year: ");
            int year=read.nextInt();
            int año=2021-year;
            age = new Date();
            bornOn = new Date();
            chicken = new Chicken1(id,name,color,age,bornOn,molting,eggCounter);
            chickens[i]= chicken;
            born= new Born(day,month,year,año);
            bornOn1[i]= born;
        
        }
        for (int j=0; j<1; j++){
            
            System.out.println("chicken"+ j + "=" + chickens[j]);
            System.out.println("BorOn "+ j + "=" + bornOn1[j]);
            
            
        }
        
        switch(option){
            case 1:
                GsonBuilder gsonBuilder= new GsonBuilder();
                Gson gson=gsonBuilder.create();
        
                String jsonChicken="{\"id\":\"1\"}";
                System.out.println("chicken Json ->"+jsonChicken);
        
                jsonChicken=gson.toJson(chickens);
        
                //Serialization
                System.out.println("jsonChicken ->"+jsonChicken);
                //jsonChicken=gson.toJson(chickens);
                //System.out.println("jsonChicken ->"+jsonChicken);
       
        
                //Deserialization
                
                Chicken1 chicken3[]=new Chicken1[1];
                chicken3[0]=gson.fromJson(jsonChicken,Chicken1.class);
                System.out.println("chicken object name ->"+chicken3[0].getId());
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;
            
        }
        
        
    }
    
         
            
    
}
