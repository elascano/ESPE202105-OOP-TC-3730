/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmchickens.model;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class Years {
    private int day1;
    private int month1;
    private int annun1;

   private Calendar cal = new GregorianCalendar(annun1,month1,day1);
   
         private int actualMonth = cal.get(Calendar.MONTH);
         private int actualYear = cal.get(Calendar.YEAR);
         private int actualDay = cal.get(Calendar.DAY_OF_MONTH);
   
         private int resultMonth = Math.abs(actualMonth - month1);
         private int resultAnnun = Math.abs(actualYear - annun1);
         private int resultDay = Math.abs(actualDay - day1);

    public Years(int day1, int month1, int annun1) {
        this.day1 = day1;
        this.month1 = month1;
        this.annun1 = annun1;
    }

    @Override
    public String toString() {
        return "Age{" + "resultMonth=" + (actualMonth - month1) + ", resultAnnun=" + (actualYear - annun1) + ", resultDay=" + (actualDay - day1) + '}';
    }

    /**
     * @return the day1
     */
    public int getDay1() {
        return day1;
    }

    /**
     * @param day1 the day1 to set
     */
    public void setDay1(int day1) {
        this.day1 = day1;
    }

    /**
     * @return the month1
     */
    public int getMonth1() {
        return month1;
    }

    /**
     * @param month1 the month1 to set
     */
    public void setMonth1(int month1) {
        this.month1 = month1;
    }

    /**
     * @return the annun1
     */
    public int getAnnun1() {
        return annun1;
    }

    /**
     * @param annun1 the annun1 to set
     */
    public void setAnnun1(int annun1) {
        this.annun1 = annun1;
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
     * @return the actualMonth
     */
    public int getActualMonth() {
        return actualMonth;
    }

    /**
     * @param actualMonth the actualMonth to set
     */
    public void setActualMonth(int actualMonth) {
        this.actualMonth = actualMonth;
    }

    /**
     * @return the actualYear
     */
    public int getActualYear() {
        return actualYear;
    }

    /**
     * @param actualYear the actualYear to set
     */
    public void setActualYear(int actualYear) {
        this.actualYear = actualYear;
    }

    /**
     * @return the actualDay
     */
    public int getActualDay() {
        return actualDay;
    }

    /**
     * @param actualDay the actualDay to set
     */
    public void setActualDay(int actualDay) {
        this.actualDay = actualDay;
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
     * @return the resultAnnun
     */
    public int getResultAnnun() {
        return resultAnnun;
    }

    /**
     * @param resultAnnun the resultAnnun to set
     */
    public void setResultAnnun(int resultAnnun) {
        this.resultAnnun = resultAnnun;
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
    
}
