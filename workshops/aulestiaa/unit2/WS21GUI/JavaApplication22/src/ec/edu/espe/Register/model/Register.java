/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Register.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class Register {
    String firstName;
    String lastname;
    String password;
    String email;
    String gender;
    ArrayList<LiteraryGenre> LiteraryGenres;
    LocalDateTime birthDate;
    
}
