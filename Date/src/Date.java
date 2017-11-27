/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  Month
 */
public class Date {
    private static final Month[] year = new Month[]{new Month("January", 1, 31), new Month("February", 2, 29), new Month("March", 3, 31), new Month("April", 4, 30), new Month("May", 5, 31), new Month("June", 6, 30), new Month("July", 7, 31), new Month("August", 8, 31), new Month("September", 9, 30), new Month("October", 10, 31), new Month("November", 11, 30), new Month("December", 12, 31)};
    private int month;
    private int day;

    public Date(int theMonth, int theDay) {
        this.month = theMonth;
        this.day = theDay;
    }

    public String getMonth() {
        String result = "UNKNOWN";
        if (this.isValidDay()) {
            result = year[this.month - 1].getMonthName();
        }
        return result;
    }

    public String getSeason() {
        String result = "UNKNOWN";
        if (!this.isValidDay()) {
            return result;
        }
        result = this.month == 12 && this.day >= 21 || this.month == 1 || this.month == 2 || this.month == 3 && this.day <= 20 ? "Winter" : (this.month == 3 && this.day >= 21 || this.month == 4 || this.month == 5 || this.month == 6 && this.day <= 20 ? "Spring" : (this.month == 6 && this.day >= 21 || this.month == 7 || this.month == 8 || this.month == 9 && this.day <= 22 ? "Summer" : "Fall"));
        return result;
    }

    public boolean isValidDay() {
        boolean rc = false;
        if (this.isValidMonth() && this.day > 0 && this.day <= year[this.month - 1].getMonthDays()) {
            rc = true;
        }
        return rc;
    }

    public boolean isValidMonth() {
        if (this.month > 0 && this.month <= year.length) {
            return true;
        }
        return false;
    }
}