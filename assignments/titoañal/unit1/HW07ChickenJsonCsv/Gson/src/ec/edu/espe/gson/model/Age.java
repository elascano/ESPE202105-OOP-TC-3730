
package ec.edu.espe.gson.model;

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
    
    public String[] getArray(){
        String[] data = {String.valueOf(resultDay),String.valueOf(resultMonth),String.valueOf(resultYear)};
        
        return data;
   }

   
}
