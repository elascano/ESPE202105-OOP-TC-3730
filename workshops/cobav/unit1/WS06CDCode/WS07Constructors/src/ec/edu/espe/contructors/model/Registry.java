/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contructors.model;

/**
 *
 * @author Victor Coba Beta Software ESPE-DCCD
 */
public class Registry {
    private String date ;
    private String hour ;
    private String license  ;
            

    public Registry (String date , String hour, String license ) {
        this.date = date ;
        this.hour = hour;
        this.license  = license ;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the hour
     */
    public String getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Registry{" + "date=" + date + ", hour=" + hour + ", license=" + license + '}';
    }

}





