/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class Subject {
    private String nameSubject;
    private int type;

    public Subject(String name, int type) {
        this.name = name;
        this.type = type;
    }

    

    @Override
    public String toString() {
        return "Subject{" + "name=" + name + ", type=" + type + '}';
    }
    
    
    