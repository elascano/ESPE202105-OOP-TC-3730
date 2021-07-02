/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.WS13OBJECT.view;

import com.google.gson.Gson;
import ec.edu.espe.car.model.Car;
import ec.edu.espe.Filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camilo Ponce ESPE-DCCO
 */
public class WS13OBJECT {

    public static void main(String[] args) {
            Scanner entry = new Scanner(System.in);
            Gson gson = new Gson();
            
            System.out.print("Ingrese el color del vehiculo:\n");
            String color = entry.next();
            System.out.print("Ingrese el tipo del vehiculo:\n");
            String type = entry.next();
            System.out.println("Ingrese el tamaño del vehiculo en metros:\n");
            int size = entry.nextInt();
            System.out.println("Ingrese la potencia del vehiculo en caballos:\n");
            int power = entry.nextInt();
            System.out.println("Ingrese la velocidad maxima del vehiculo en kilometros:\n");
            int velocity = entry.nextInt();
            
            
            ArrayList<String> carArray= new ArrayList();
            Car car = new Car(color, type, size, power, velocity);
            String CarDataJson = gson.toJson(car);
            FileManager.save("CarsList.json", CarDataJson);
            carArray  = FileManager.findAll("CarsList.json"); 
            System.out.println(carArray); //prints in Json format on the console
            System.out.println("El total de libros son: "+carArray.size());
    } 
}
