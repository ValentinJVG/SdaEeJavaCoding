package ee.sda.ajc;

public class Task20 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.calculateArea());
        Hexagon hexagon = new Hexagon();
        System.out.println(hexagon.calculatePerimeter() + " cm");
        System.out.println(hexagon.calculateArea() + " cm2");

    }
}

abstract class Shape {
    abstract double calculatePerimeter();

    abstract double calculateArea();

}

class Rectangle extends Shape {


    @Override
    double calculatePerimeter() {
        double a = 5;
        double b = 10;
        return 2 * (a + b);
    }

    @Override
    double calculateArea() {
        double a = 5;
        double b = 10;
        return a * b;
    }
}

class Triangle extends Shape {

    @Override
    double calculatePerimeter() {
        double a = 2;
        double b = 4;
        double c = 6;
        return a + b + c;
    }

    @Override
    double calculateArea() {
        double base = 5;
        double height = 10;
        return 0.5 * base * height;
    }


}

class Hexagon extends Shape {

    @Override
    double calculatePerimeter() {

        double side = 9;
        return side * 6;
    }

    @Override
    double calculateArea() {
        double side = 9;
        return (3 * Math.sqrt(3) * side * side) / 2;

    }
}

