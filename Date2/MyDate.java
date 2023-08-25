package Date2;

public class MyDate {
    // ================= Attributes ==============
    public int day;
    private int month;
    private int year;

    // ============ Constructor ================
    // * we can add conditions in constructor
    public MyDate(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
        if (month >= 1 && month <= 12) {

            this.month = month;
        } else
            this.month = 1;
        this.year = year;

    }

    // ==================== Getter && Setter ==================
    /*
     * GETTER : a METHOD that GETS the ATTRIBUTES in file main
     * ( we can get attribute if changing PRIVATE mode to PUBLIC mode in attribute )
     */
    // * SETTER: a METHOD that SETS or replaces the value of the ATTRIBUTES
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // ================= toString ================
    @Override
    public String toString() {
        return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

}
