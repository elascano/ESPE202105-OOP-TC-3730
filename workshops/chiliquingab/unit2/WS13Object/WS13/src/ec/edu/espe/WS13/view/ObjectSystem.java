/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.WS13.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.WS13.model.Client;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class ObjectSystem {
    public static void main(String[] args)throws FileNotFoundException, IOException, ParseException{
        Scanner entry = new Scanner(System.in);
        String name;
        int age;
        int id;
        long phone;
        float heigth;
        String jsonClient;
        
        System.out.println("Bryan Chiliquinga WS13");
        System.out.print("\nPlease enter your name: ");
        name = entry.next();
        System.out.print("Enter your age: ");
        age = entry.nextInt();
        System.out.print("Enter your id: ");
        id = entry.nextInt();
        System.out.print("Enter your phone: ");
        phone = entry.nextLong();
        System.out.print("Enter your height: ");
        heigth = entry.nextFloat();
        
        Client clients = new Client(name, age, id, phone, heigth);
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create(); 

		try{
			FileWriter file = new FileWriter("C:/Users/DELL/Desktop/WS13/Files/Client.json");
			file.write(clients.toJSONString());
			file.flush();
			file.close();
			
			
		}catch(IOException e){
		
		}
		finally{
			System.out.print("\nJsonClient --> " + clients);
		}
                
                try (Writer writer = new FileWriter("C:/Users/DELL/Desktop/WS13/Files/Client.json")) {
            gson.toJson(clients, writer);
        }

}
}