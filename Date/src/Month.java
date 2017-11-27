/*
 * Decompiled with CFR 0_115.
 */
public class Month {
    private int monthNumber;
    private String monthName;
    private int monthDays;

    public Month(String name, int number, int days) {
        this.setMonthName(name);
        this.setMonthDays(days);
        this.setMonthNumber(number);
    }

    public boolean isDayValid(int d) {
        if (d <= this.monthDays) {
            return true;
        }
        return false;
    }

    public String getMonthName() {
        return this.monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public int getMonthDays() {
        return this.monthDays;
    }

    public void setMonthDays(int monthDays) {
        this.monthDays = monthDays;
    }

    public int getMonthNumber() {
        return this.monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }
}