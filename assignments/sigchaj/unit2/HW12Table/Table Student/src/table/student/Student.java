/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.student;

/**
 *
 * @author Asus
 */
public class Student {
    
    String Name, LastName, UserName, CI, Code, PhoneNumber;

    public Student(String Name, String LastName, String UserName, String CI, String Code) {
        this.Name = Name;
        this.LastName = LastName;
        this.UserName = UserName;
        this.CI = CI;
        this.Code = Code;
        
    }

    Student(String text, String text0, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }


    
    
    
    
    
}
