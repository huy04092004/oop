  public class TestMydate
  {
  public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println("  ");
        System.out.println(d1);
        System.out.println(d1.nextDay());
        System.out.println(d1.nextDay());
        System.out.println(d1.nextMonth());
        System.out.println(d1.nextYear());

        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);
        System.out.println(d2.previousDay());
        System.out.println(d2.previousDay());
        System.out.println(d2.previousMonth());
        System.out.println(d2.previousYear());

        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());

        MyDate d4 = new MyDate(2011, 12, 28); // Bắt đầu từ 28 Dec 2011
        while (!(d4.getYear() == 2012 && d4.getMonth() == 3 && d4.getDay() == 2)) {
            System.out.println(d4);
            d4.nextDay();
        }
        // In ngày cuối cùng
        System.out.println(d4);
    }
  }