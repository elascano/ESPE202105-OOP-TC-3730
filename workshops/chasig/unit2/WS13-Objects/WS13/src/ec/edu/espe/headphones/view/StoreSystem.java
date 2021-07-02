/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.headphones.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.headphones.model.Headphones;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class StoreSystem {
   public static void main(String[] args) throws IOException {
        System.out.println ("Save data in Json file (Headphones), \n"
            + "Geraldi Chasi");   
        
   String brand;
   String color; 
   String type;
   
   
        Scanner read = new Scanner(System.in);
        ArrayList<String> hp = new ArrayList();
        

        System.out.print("write what brand of headphones you want  \n");
        brand = read.next();
        System.out.print("write the color you would like for your headphones\n");
        color = read.next();
        System.out.print("write what type of headphones you want \n");
        type = read.next();
         
   
        Headphones headphones = new Headphones (brand,color,type);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson= gsonBuilder.create();
        String SongDataJson = gson.toJson(headphones);
        FileManager.save("./file/Headphones/Headphones.json", SongDataJson);
        hp = FileManager.findAll("./file/Headphones/Headphones.json");
        System.out.println(hp);
        
    }
}  

