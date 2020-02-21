package geomOOP;

public class Rectangle extends Figure {

    Point point1;
    Point point2;

    Rectangle(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }
    public static Rectangle rand() {
        return new Rectangle(Point.rand(), Point.rand());
    }
    @Override
    public int area(){
        return Math.abs(point1.x - point2.x)*(point1.y - point2.y);
    }
    @Override
    public String toString() {
        return String.format("area for rectangle %d", area());
    }
}
