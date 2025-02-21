
public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = { 
        "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", 
        "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"
    };
    
    public static final String[] DAYS = { 
        "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"
    };
    
    public static final int[] DAY_IN_MONTHS = { 
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Năm, tháng hoặc ngày không hợp lệ!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Năm không hợp lệ!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Tháng không hợp lệ!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (day < 1 || day > getDaysInMonth(year, month)) {
            throw new IllegalArgumentException("Ngày không hợp lệ!");
        }
        this.day = day;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        return day >= 1 && day <= getDaysInMonth(year, month);
    }

    private static int getDaysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAY_IN_MONTHS[month - 1];
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Ngày không hợp lệ!");
        }
        int[] centuryOffset = {6, 4, 2, 0}; // 1600, 1700, 1800, 1900
        int century = (year / 100) % 4;
        int lastTwoDigits = year % 100;
        int leapYears = lastTwoDigits / 4;
        int monthOffset = new int[]{0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5}[month - 1];
        
        if (isLeapYear(year) && (month == 1 || month == 2)) {
            leapYears--;
        }

        int dayOfWeek = (centuryOffset[century] + lastTwoDigits + leapYears + monthOffset + day) % 7;
        return dayOfWeek;
    }

    public MyDate nextDay() {
        if (day < getDaysInMonth(year, month)) {
            day++;
        } else {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month < 12) {
            month++;
        } else {
            month = 1;
            nextYear();
        }
        day = Math.min(day, getDaysInMonth(year, month));
        return this;
    }

    public MyDate nextYear() {
        if (year >= 9999) {
            throw new IllegalStateException("Năm nằm ngoài phạm vi!");
        }
        year++;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else {
            previousMonth();
            day = getDaysInMonth(year, month);
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month > 1) {
            month--;
        } else {
            month = 12;
            previousYear();
        }
        day = Math.min(day, getDaysInMonth(year, month));
        return this;
    }

    public MyDate previousYear() {
        if (year <= 1) {
            throw new IllegalStateException("Năm nằm ngoài phạm vi!");
        }
        year--;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }

    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return String.format("%s, ngày %d %s năm %d", DAYS[dayOfWeek], day, MONTHS[month - 1], year);
    }

    
}
