package lecture3;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
//        System.out.println("Point constructor");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
