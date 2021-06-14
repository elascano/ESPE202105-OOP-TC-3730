/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.touristguest.associations.model;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Destination {

    @Override
    public String toString() {
        return "Destination{" + "country=" + country + ", DestinationContinet=" + DestinationContinet + '}';
    }
    private Country country;
    private continet DestinationContinet;

    private static class continet {

        public continet() {
        }
    }
}
