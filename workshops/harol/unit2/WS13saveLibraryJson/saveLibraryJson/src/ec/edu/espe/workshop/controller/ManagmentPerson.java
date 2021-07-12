/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.workshop.controller;

import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.edu.espe.workshop.model.Person;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class ManagmentPerson {

    public JSONArray inputCustomer() throws IOException, ParseException, org.json.simple.parser.ParseException {
        String data = FileManager.read("client.json");
        Person person = new Person();
        JSONArray array = new JSONArray();
        JSONParser parser = new JSONParser();

        array = (JSONArray) parser.parse(data);

        System.out.println("Enter Id");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        person.setCedula(id);
        System.out.println("Enter Name");

        String name = sc.nextLine();
        person.setNames(name);
        System.out.println("Enter Adress");

        String adress = sc.nextLine();
        person.setAddress(adress);

        System.out.println("Enter Last Name");

        String lName = sc.nextLine();
        person.setLastName(lName);

        System.out.println("Enter Phone");

        String phone = sc.nextLine();
        person.setPhone(phone);

        JSONObject client = new JSONObject();
        client.put("Id", person.getCedula());
        client.put("Name", person.getNames());
        client.put("Last Name", person.getLastName());
        client.put("Adress", person.getAddress());

        client.put("Phone", person.getPhone());
        array.add(client);

        return array;

    }

    public void saveClient() throws IOException, ParseException, org.json.simple.parser.ParseException {

        FileManager.writeRecord("client.json", inputCustomer().toJSONString());
    }
}
