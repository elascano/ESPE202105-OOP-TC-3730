/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Song.model;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class DurationTime {
    private int Time;

    public DurationTime(int Time) {
        this.Time = Time;
    }

    @Override
    public String toString() {
        return "DurationTime{" + "Time=" + getTime() + '}';
    }

    /**
     * @return the Time
     */
    public int getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(int Time) {
        this.Time = Time;
    }
    
}
