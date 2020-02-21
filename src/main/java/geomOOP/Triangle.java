package geomOOP;

public class Triangle extends Figure{

    Point p1;
    Point p2;
    Point p3;

    Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    private double distance(Point p1, Point p2){
        return Math.sqrt((p2.x - p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
    }
    public static Triangle rand() {
        return new Triangle(Point.rand(), Point.rand(), Point.rand());
    }
    @Override
    public int area(){
        double side1 = distance(p1,p2);
        double side2 = distance(p2,p3);
        double side3 = distance(p3,p1);
        double hp =(side1 + side2 + side3)/2;
        return (int)(Math.sqrt(hp*(hp-side1)*(hp-side2)*(hp-side3)));
    }
    @Override
    public String toString() {
        return String.format("area for triangle %d", area());
    }
}
