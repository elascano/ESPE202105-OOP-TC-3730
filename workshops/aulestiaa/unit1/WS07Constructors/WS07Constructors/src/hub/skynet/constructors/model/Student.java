/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hub.skynet.constructors.model;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class Student {
    public String name;
    public String lastname;
    public int age;

    public Student(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", lastname=" + lastname + ", age=" + age + '}';
    }
    
    
    
}
