/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmSimulator.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class YearsCount {
  
    private int month;
    private int day;
    private int year;
    
    private Calendar cal = new GregorianCalendar();
        
        private int presentMonth = cal.get(Calendar.MONTH);
        private int presentDay = cal.get(Calendar.DAY_OF_MONTH);
        private int presentYear = cal.get(Calendar.YEAR);
        
        private int monthResult = Math.abs(month - presentMonth);
        private int dayResult = Math.abs(day - presentDay);  
        private int yearResult = Math.abs(year - presentYear);
        

    public YearsCount(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return "YearsCount{" + "monthResult=" + (presentMonth - month+1)+ ", dayResult=" + (presentDay - day) + ", yearResult=" + (presentYear - year) + '}';
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the cal
     */
    public Calendar getCal() {
        return cal;
    }

    /**
     * @param cal the cal to set
     */
    public void setCal(Calendar cal) {
        this.cal = cal;
    }

    /**
     * @return the presentMonth
     */
    public int getPresentMonth() {
        return presentMonth;
    }

    /**
     * @param presentMonth the presentMonth to set
     */
    public void setPresentMonth(int presentMonth) {
        this.presentMonth = presentMonth;
    }

    /**
     * @return the presentDay
     */
    public int getPresentDay() {
        return presentDay;
    }

    /**
     * @param presentDay the presentDay to set
     */
    public void setPresentDay(int presentDay) {
        this.presentDay = presentDay;
    }

    /**
     * @return the presentYear
     */
    public int getPresentYear() {
        return presentYear;
    }

    /**
     * @param presentYear the presentYear to set
     */
    public void setPresentYear(int presentYear) {
        this.presentYear = presentYear;
    }

    /**
     * @return the monthResult
     */
    public int getMonthResult() {
        return monthResult;
    }

    /**
     * @param monthResult the monthResult to set
     */
    public void setMonthResult(int monthResult) {
        this.monthResult = monthResult;
    }

    /**
     * @return the dayResult
     */
    public int getDayResult() {
        return dayResult;
    }

    /**
     * @param dayResult the dayResult to set
     */
    public void setDayResult(int dayResult) {
        this.dayResult = dayResult;
    }

    /**
     * @return the yearResult
     */
    public int getYearResult() {
        return yearResult;
    }

    /**
     * @param yearResult the yearResult to set
     */
    public void setYearResult(int yearResult) {
        this.yearResult = yearResult;
    }
    
}
