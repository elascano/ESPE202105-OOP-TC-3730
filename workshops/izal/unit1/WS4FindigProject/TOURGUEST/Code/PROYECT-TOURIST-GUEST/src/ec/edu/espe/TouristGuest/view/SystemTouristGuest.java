/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.TouristGuest.model.Citys;
import ec.edu.espe.TouristGuest.model.Country;

/**
 *
 * @author JARAMILLO JEAN TOUR GUEST OPP-ESPE
 */
public class SystemTouristGuest {

    public static void main(String[] args) {
        System.out.println("Welcome dear guest");
        Citys c1 = new Citys("Quito", 85, 225);
        Citys c2 = new Citys("Ambato", 62, 105);
        Citys c3 = new Citys("Cuenca", 69, 82);

        Citys c4 = new Citys("Trastevere", 62, 22);
        Citys c5 = new Citys(" Domus Aurea ", 22, 19);
        Citys c6 = new Citys("Roma", 34, 21);

        Citys c7 = new Citys("Cartagena", 68, 20);
        Citys c8 = new Citys("Medellín", 23, 26);
        Citys c9 = new Citys("Cali", 105, 32);

        Citys c10 = new Citys("Jalisco ", 39, 32);
        Citys c11 = new Citys("Cancún", 48, 41);
        Citys c12 = new Citys("Campeche", 58, 43);

        Citys c13 = new Citys("París", 183, 13);
        Citys c14 = new Citys("Toulouse", 37, 18);
        Citys c15 = new Citys("Marsella", 54, 22);

        Citys c16 = new Citys("Las Terrenas", 24, 23);
        Citys c17 = new Citys("Isla Saona", 23, 43);
        Citys c18 = new Citys("Boca Chica", 24, 30);

        Citys c19 = new Citys("São Paulo", 22, 10);
        Citys c20 = new Citys("Rio de Janeiro ", 17, 12);
        Citys c21 = new Citys("Gramado", 19, 12);

        Citys c22 = new Citys("Iguazú Falls", 10, 12);
        Citys c23 = new Citys("Ushuaia", 10, 13);
        Citys c24 = new Citys("City Mendoza", 10, 11);

        Citys c25 = new Citys("City Potosí", 6, 11);
        Citys c26 = new Citys("The Uyuni Salt Flats", 7, 9);
        Citys c27 = new Citys("Torotoro National Park", 7, 9);

        Citys c28 = new Citys("Holguín", 26, 15);
        Citys c29 = new Citys("The tunas", 12, 15);
        Citys c30 = new Citys("Bayamo", 15, 12);

        Country p1 = new Country("Ecuador", 17268.000, "Spanish", "American");
        Country p2 = new Country("Italy", 59641.488, "Italian", "American");
        Country p3 = new Country("Colombia", 50374.000, "Spanish", "American");
        Country p4 = new Country("Mexico", 1278.000, "Spanish", "American");
        Country p5 = new Country("France", 68011.000, "French", "American");
        Country p6 = new Country("Dominican Republic", 10358.000, "Spanish", "American");
        Country p7 = new Country("Brazil", 210147.000, "Portuguse", "American");
        Country p8 = new Country("Argetina", 44939.000, "Spanish", "American");
        Country p9 = new Country("Bolivia", 25550.000, "Spanish", "American");
        Country p10 = new Country("Cuba", 18095.000, "Spanish", "American");

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        String jsonCountry = "";

        p1.addCitys(c1);
        p1.addCitys(c2);
        p1.addCitys(c3);

        p2.addCitys(c4);
        p2.addCitys(c5);
        p2.addCitys(c6);

        p3.addCitys(c7);
        p3.addCitys(c8);
        p3.addCitys(c9);

        p4.addCitys(c10);
        p4.addCitys(c11);
        p4.addCitys(c12);

        p5.addCitys(c13);
        p5.addCitys(c14);
        p5.addCitys(c15);

        p6.addCitys(c16);
        p6.addCitys(c17);
        p6.addCitys(c18);

        p7.addCitys(c19);
        p7.addCitys(c20);
        p7.addCitys(c21);

        p8.addCitys(c22);
        p8.addCitys(c23);
        p8.addCitys(c24);

        p9.addCitys(c25);
        p9.addCitys(c26);
        p9.addCitys(c27);

        p10.addCitys(c28);
        p10.addCitys(c29);
        p10.addCitys(c30);

        System.out.println(p1.getinfo());
        System.out.println(c1.getinfocity());
        System.out.println(c2.getinfocity());
        System.out.println(c3.getinfocity());
        System.out.println(p2.getinfo());
        System.out.println(c4.getinfocity());
        System.out.println(c5.getinfocity());
        System.out.println(c6.getinfocity());
        System.out.println(p3.getinfo());
        System.out.println(c7.getinfocity());
        System.out.println(c8.getinfocity());
        System.out.println(c9.getinfocity());
        System.out.println(p4.getinfo());
        System.out.println(c10.getinfocity());
        System.out.println(c11.getinfocity());
        System.out.println(c12.getinfocity());
        System.out.println(p5.getinfo());
        System.out.println(c13.getinfocity());
        System.out.println(c14.getinfocity());
        System.out.println(c15.getinfocity());
        System.out.println(p6.getinfo());
        System.out.println(c16.getinfocity());
        System.out.println(c17.getinfocity());
        System.out.println(c18.getinfocity());
        System.out.println(p7.getinfo());
        System.out.println(c19.getinfocity());
        System.out.println(c20.getinfocity());
        System.out.println(c21.getinfocity());
        System.out.println(p8.getinfo());
        System.out.println(c22.getinfocity());
        System.out.println(c23.getinfocity());
        System.out.println(c24.getinfocity());
        System.out.println(p9.getinfo());
        System.out.println(c25.getinfocity());
        System.out.println(c26.getinfocity());
        System.out.println(c27.getinfocity());
        System.out.println(p10.getinfo());
        System.out.println(c28.getinfocity());
        System.out.println(c29.getinfocity());
        System.out.println(c30.getinfocity());

        jsonCountry = gson.toJson(p1);
        System.out.println("jsonCountry -> " + jsonCountry);

        jsonCountry = gson.toJson(p2);
        System.out.println("jsonCountry -> " + jsonCountry);

        jsonCountry = gson.toJson(p3);
        System.out.println("jsonCountry -> " + jsonCountry);

        jsonCountry = gson.toJson(p4);
        System.out.println("jsonCountry -> " + jsonCountry);

        jsonCountry = gson.toJson(p5);
        System.out.println("jsonCountry -> " + jsonCountry);

        jsonCountry = gson.toJson(p6);
        System.out.println("jsonCountry -> " + jsonCountry);

        jsonCountry = gson.toJson(p7);
        System.out.println("jsonCountry -> " + jsonCountry);

        jsonCountry = gson.toJson(p8);
        System.out.println("jsonCountry -> " + jsonCountry);

        jsonCountry = gson.toJson(p9);
        System.out.println("jsonCountry -> " + jsonCountry);

        jsonCountry = gson.toJson(p10);
        System.out.println("jsonCountry -> " + jsonCountry);

    }

}
