public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter cho day
    public int getDay() {
        return day;
    }

    // Setter cho day
    public void setDay(int day) {
        if (day > 0 && day <= 31) {  // Giả sử mỗi tháng có 31 ngày (cơ bản)
            this.day = day;
        } else {
            System.out.println("Invalid day");
        }
    }

    // Getter cho month
    public int getMonth() {
        return month;
    }

    // Setter cho month
    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month");
        }
    }

    // Getter cho year
    public int getYear() {
        return year;
    }

    // Setter cho year
    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }

    // Phương thức setDate để thiết lập ngày, tháng, năm cùng lúc
    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    // Phương thức toString để hiển thị ngày theo định dạng dd/mm/yyyy
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}