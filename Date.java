public class Date {
    private int year;
    private int month;
    private int day;

    Date() {
        this(2026, 1, 1);
    }

    Date(int year) {
        this(year, 1, 1);
    }

    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    void info() {
        System.out.println(year + "/" + month + "/" + day);
    }
}

