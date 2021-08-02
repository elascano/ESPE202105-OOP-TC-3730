/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bonus.controller;

import ec.edu.espe.bonus.model.User;
import ec.edu.espe.bonus.view.FrmUser;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class UserController {
     private User user;
    private FrmUser frmUser;

    public UserController(User user, FrmUser frmUser) {
        this.user = user;
        this.frmUser = frmUser;
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
