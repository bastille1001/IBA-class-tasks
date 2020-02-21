package geomOOP;

public class Point {

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Point rand() {
        return new Point(Fn.rand(), Fn.rand());
    }

    @Override
    public String toString() {
        return String.format("Point{x=%d, y=%d}", x, y);
    }
}
