package geomOOP;

public class Circle extends Figure {

    Point center;
    int radius;

    Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public static Circle rand() {
        return new Circle(Point.rand(), Fn.rand());
    }

    @Override
    public int area(){
        return (int) Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("area for circle %d", area());
    }
}
