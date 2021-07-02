/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pool.view;

import ec.edu.espe.pool.model.Pool;
import com.google.gson.Gson;
import ec.edu.espe.Filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jean Jaramillo
 */
public class PoolSystem {
        public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome: number of pools that you want to save..");
        
        int  counter = input.nextInt();
        
        for (int i = 0; 1< counter;i++){
            
            System.out.println("Pool specifications");
            Gson gson = new Gson();
            
            System.out.println("Enter the name of the pool:..");
            String name = input.next();
            System.out.println("Enter the colour of the pool:..");
            String colour = input.next();
            System.out.println("Enter the maker of the pool:..");
            String maker = input.next();
            
            System.out.println("enter the depth of the pool:..");
            int depth = input.nextInt();
            
            System.out.println("enter the size of the pool:.. ");
            int size = input.nextInt();
            
            ArrayList<String> Pool = new ArrayList();
            
            Pool pool = new Pool(name, colour, maker, depth, size);
            
            String PoolDataJson = gson.toJson(Pool);
            
            
            
            /*FileManager.save("./files/Pool.json",PoolDataJson);
            Pool = FileManager.findAll("./files/Pool.json");
            System.out.println(Pool);
            System.out.println("Number of Pool: " + Pool.size());*/
        }
        
                
        }
    
}