package Date1;

/**
 * SetDate
 */
public class SetDate {
    private int day;
    private int month;
    private int year;

    public SetDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void PrintDay() {
        System.out.println("Day " + this.day);
    }

    public void PrintMonth() {
        System.out.println("Month " + this.month);
    }

    public void PrintYear() {
        System.out.println("Year " + this.year);
    }

    public void PrintDate() {
        System.out.println("Date " + this.day + " " + this.month + " " + this.year);
    }

}