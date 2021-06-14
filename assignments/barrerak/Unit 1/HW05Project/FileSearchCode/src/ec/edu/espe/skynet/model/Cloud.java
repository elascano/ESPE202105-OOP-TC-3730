/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.skynet.model;

import java.util.ArrayList;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Cloud {
    private String password;
    private String username;
    private ArrayList<File> file= new ArrayList<>();

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the file
     */
    public ArrayList<File> getFile() {
        return file;
    }

    @Override
    public String toString() {
        return "Cloud{" + "password=" + password + ", username=" + username + ", file=" + file + '}';
    }

    /**
     * @param file the file to set
     */
    public void setFile(ArrayList<File> file) {
        this.file = file;
    }
    
}
