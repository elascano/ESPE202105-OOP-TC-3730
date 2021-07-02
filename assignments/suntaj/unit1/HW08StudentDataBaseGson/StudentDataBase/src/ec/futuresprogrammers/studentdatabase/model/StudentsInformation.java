/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasestudent20.model;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class StudentsInformation {
    
     String cedula;
     String name;
     String civilStatus;
     String sex;
     String nameUniversity;
     String racing;
     String semester;
     String nrc;
     String nameSubject;
     String estado;
     double n1;
     double n2;
     double n3;
     double promedio;

    public StudentsInformation(String cedula, String name, String civilStatus, String sex, String nameUniversity, String racing, String semester, String nrc, String nameSubject, String estado, double n1, double n2, double n3, double promedio) {
        this.cedula = cedula;
        this.name = name;
        this.civilStatus = civilStatus;
        this.sex = sex;
        this.nameUniversity = nameUniversity;
        this.racing = racing;
        this.semester = semester;
        this.nrc = nrc;
        this.nameSubject = nameSubject;
        this.estado = estado;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.promedio = promedio;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String getRacing() {
        return racing;
    }

    public void setRacing(String racing) {
        this.racing = racing;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    
    
   @Override
    public String toString() {
        return "StudentsInformation" 
                + "\nCedula: " + cedula 
                + "\nName: " + name 
                + "\nCivilStatus: " + civilStatus 
                + "\nSex: " + sex 
                + "\nNameUniversity: " + nameUniversity 
                + "\nRacing: " + racing 
                + "\nSemester: " + semester 
                + "\nNrc: " + nrc 
                + "\nNameSubject: " + nameSubject 
                + "\nEstado: " + estado
                + "\nNota 1:" + n1 
                + "\nNota 2: " + n2 
                + "\nNota 3: " + n3 
                + "\nPromedio: " + promedio;
        

   
    }

}