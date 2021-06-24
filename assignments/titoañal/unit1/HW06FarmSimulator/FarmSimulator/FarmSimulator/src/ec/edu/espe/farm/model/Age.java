/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class Age {
    private int resultDay;
    private int resultMonth;
    private int resultYear;


    public Age(int resultDay, int resultMonth, int resultYear) {
        this.resultDay = resultDay;
        this.resultMonth = resultMonth;
        this.resultYear = resultYear;
    }

    @Override
    public String toString() {
        return "Age{" + "resultDay=" + getResultDay() + ", resultMonth=" + getResultMonth() + ", resultYear=" + getResultYear() + '}';
    }

    /**
     * @return the resultDay
     */
    public int getResultDay() {
        return resultDay;
    }

    /**
     * @param resultDay the resultDay to set
     */
    public void setResultDay(int resultDay) {
        this.resultDay = resultDay;
    }

    /**
     * @return the resultMonth
     */
    public int getResultMonth() {
        return resultMonth;
    }

    /**
     * @param resultMonth the resultMonth to set
     */
    public void setResultMonth(int resultMonth) {
        this.resultMonth = resultMonth;
    }

    /**
     * @return the resultYear
     */
    public int getResultYear() {
        return resultYear;
    }

    /**
     * @param resultYear the resultYear to set
     */
    public void setResultYear(int resultYear) {
        this.resultYear = resultYear;
    }
    
    
    
}
