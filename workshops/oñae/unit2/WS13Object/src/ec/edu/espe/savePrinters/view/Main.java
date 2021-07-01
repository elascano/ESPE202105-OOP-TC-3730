/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.savePrinters.view;

import com.google.gson.Gson;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.savePrinters.model.Printer;
import static java.rmi.server.ObjID.read;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class Main {
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            Gson gson = new Gson();
            System.out.print("enter brand: ");//doesn't read the full title of the book by giving space
            String brand = read.next();
            System.out.print("enter model: ");
            read.nextLine();
            String model = read.next();
            System.out.println("enter business: "); //By giving space for the author's last name he does not allow entering the name of the publisher
            String business = read.next(); 
            System.out.println("enter año de lanzamiento: ");
            int yearRelease = read.nextInt();
            
            ArrayList<String> printerArray= new ArrayList();
            Printer printer = new Printer(brand,model,business,yearRelease);
            String PrinterDataJson = gson.toJson(printer);
            FileManager.save("PrintersList.json", PrinterDataJson);
            printerArray  = FileManager.findAll("PrintersList.json"); 
            System.out.println(printerArray); //prints in Json format on the console
            System.out.println("El total de impresoras son: "+printerArray.size());
    } 
}