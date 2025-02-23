public class LineSub extends Point {
    private Point end;  // Điểm kết thúc của đường thẳng

    public LineSub(int x1, int y1, int x2, int y2) {
        super(x1, y1);  // Gọi constructor của Point để thiết lập điểm bắt đầu
        this.end = new Point(x2, y2);
    }

    public Point getStart() {
        return new Point(getX(), getY());
    }

    public void setStart(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength() {
        int dx = getX() - end.getX();
        int dy = getY() - end.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "LineSub[Start=" + super.toString() + ", End=" + end + "]";
    }
}
