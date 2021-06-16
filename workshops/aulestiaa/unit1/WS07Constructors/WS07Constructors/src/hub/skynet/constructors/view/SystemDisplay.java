/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hub.skynet.constructors.view;

import hub.skynet.constructors.model.Student;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class SystemDisplay {
    public static void main(String [] args){
        Student student = new Student("Ariel", "Aulestia", 24);
        System.out.println(student);
    }
}
