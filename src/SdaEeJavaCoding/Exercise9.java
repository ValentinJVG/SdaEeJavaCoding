package SdaEeJavaCoding;

public class Exercise9 {
    public static void main(String[] args) {
        Circle.getRadius(5);
        System.out.println(Circle.getArea(5));
        System.out.println(Circle.getPerimeter(5));
    }
}

class Point2D {
    double x;
    double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    public Circle(Point2D center, Point2D point) {

    }

    public static double getRadius(double radius) {
        return radius;
    }

    public static double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double getArea(double radius) {
        return radius * radius * Math.PI;
    }
}
