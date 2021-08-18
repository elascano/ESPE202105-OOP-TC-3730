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
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class FramSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Chicken chicken;
    
    int id =0;
    String name;
    String color;
    Date age;
    Date bornOn;
    boolean molting = false;
    int eggCounter;
    //TODO reading from keyboard
    id = 0;
    name= "lucy";
    color="white";
    age = new Date();
    bornOn = new Date();
    eggCounter = 0;
    chicken = new Chicken(id, name, color, age, bornOn, molting);
    System.out.println("chiken->"+ chicken);
        Chicken chickens[]= new Chicken[10];
        chicken = new Chicken(id, name, color, age,bornOn, molting);
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Maruja", "black", new Date(), new Date(), false);
        chickens[2] = new Chicken(2, "mishel", "gray", new Date(), new Date(), false);
        chickens[3] = new Chicken(3, "katerin", "orange", new Date(), new Date(), false);
        chickens[4] = new Chicken(4, "cucu", "green", new Date(), new Date(), true);
        chickens[5] = new Chicken(5, "Ellie", "pink", new Date(),new Date(), false);
        chickens[6] = new Chicken(6, "Luke", "red", new Date(), new Date(), true);
        chickens[7] = new Chicken(7, "andrea", "purple", new Date(), new Date(), true);
        chickens[8] = new Chicken(8, "guty", "yellow", new Date(), new Date(), false);
        chickens[9] = new Chicken(9, "javi", "blue", new Date(), new Date(), true);
        
         for (int i=0; 1<10; i++){
             System.out.println("chicken"+ i + "=" + chickens[i]);
             
         }
     
    }
    
}
