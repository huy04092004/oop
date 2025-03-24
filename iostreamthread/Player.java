public class Player {
    private String name;
    private double x, y, z;  // Vị trí của cầu thủ

    // Constructor
    public Player(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public String getName() { return name; }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    // Di chuyển cầu thủ
    public void move(double newX, double newY, double newZ) {
        this.x = newX;
        this.y = newY;
        this.z = newZ;
    }

    public void kick(Ball1 ball, double newX, double newY, double newZ) {
        if (isNear(ball, 5)) { 
            ball.setX(newX);
            ball.setY(newY);
            ball.setZ(newZ);
             System.out.println(name + " đã sút bóng tới " + ball) ;
        } else {
            System.out.println(name + " quá xa để sút bóng!");
        }
    }

    // Cầu thủ nhảy lên một độ cao
    public void jump(double height) {
        this.z += height;
        System.out.println(name + " nhảy lên cao " + height + " đơn vị!");
    }

    // Kiểm tra xem cầu thủ có gần bóng không
    public boolean isNear(Ball1 ball, double distance) {
        double dx = this.x - ball.getX();
        double dy = this.y - ball.getY();
        double dz = this.z - ball.getZ();
        double actualDistance = Math.sqrt(dx * dx + dy * dy + dz * dz);
        return actualDistance <= distance;
    }

    @Override
    public String toString() {
        return "Cầu thủ " + name + " tại (" + x + ", " + y + ", " + z + ")";
    }
}
