
package ec.edu.espe.gson.model;


public class BornOn {
    private int day;
    private int month;
    private int year;

    public BornOn(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "BornOn{" + "day=" + getDay() + ", month=" + getMonth() + ", year=" + getYear() + '}';
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
    
  public String[] getArray(){
        String[] data = {String.valueOf(day),String.valueOf(month),String.valueOf(year)};
        
        return data;
   }
    
}
