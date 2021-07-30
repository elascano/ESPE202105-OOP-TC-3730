/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tourist.controller;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.tourist.model.City;
import ec.edu.espe.tourist.model.User;
import ec.edu.espe.tourist.view.FrmUser;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class UserController {
    private User user;
    private FrmUser frmUser;
    DB db;
    DBCollection tabla;

    public UserController(User user, FrmUser frmUser) {
        this.user = user;
        this.frmUser = frmUser;
         try {
            Mongo mongo = new Mongo("LocalHost",27017);
            db=mongo.getDB("damededatos");
            tabla = db.getCollection("tabla");
        } catch (UnknownHostException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void add(User user){
        //TODO add contact to datebase
        //TODO call the utils classes
    }
     
    public ArrayList<User> find(String email){
        ArrayList<User> users = new ArrayList<>();
        //TODO find the
        User user= new User("Kerly","Mosquera","alejo0231","0981800491","kemosquera1@espe.edu.ec","hola mundo", new ArrayList<City>(), LocalDateTime.MIN, 0);
        users.add(user);
        return users;
    }
   
    public boolean delete(String email){
        boolean deleted=false;
        //TODO
        ArrayList<User> user = new ArrayList<>();
        user = find(email);
        if(user.size()>0){
            //TODO save from data base
            deleted = true;
        }
        return deleted;
    }
    
    public boolean update(String email){
        boolean update =false;
        //TODO
        ArrayList<User> user = new ArrayList<>();
        user = find(email);
        if(user.size()>0){
            //TODO save from data base
            update = true;
        }
        return update;
    }
    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the frmUser
     */
    public FrmUser getFrmUser() {
        return frmUser;
    }

    /**
     * @param frmUser the frmUser to set
     */
    public void setFrmUser(FrmUser frmUser) {
        this.frmUser = frmUser;
    }
    
}
