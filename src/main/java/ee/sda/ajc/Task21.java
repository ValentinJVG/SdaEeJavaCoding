package ee.sda.ajc;

public class Task21 {
    public static void main(String[] args) {
        Cone cone = new Cone();
        System.out.println("Cone area is: " + cone.calculateArea() + " cm2");
        System.out.println("Cone volume is: " + cone.calculateVolume() + " cm3");
        Cube cube = new Cube();
        System.out.println("Cube volume is: " + cube.calculateVolume() + " cm3");
    }
}

abstract class ThreeDShape extends Shape {
    abstract double calculateVolume();
}

class Cone extends ThreeDShape {


    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    double calculateArea() {
        double baseRadius = 10;
        double height = 5;
        return Math.PI * baseRadius * (baseRadius + height);
    }

    @Override
    double calculateVolume() {
        double baseRadius = 10;
        double height = 5;
        return 1.0/3 * Math.PI * Math.pow(baseRadius,2) * height;
    }
}

class Cube extends ThreeDShape {

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    double calculateArea() {
        return 0;
    }

    @Override
    double calculateVolume() {
        double sideOfTheQube = 5;
        return Math.pow(sideOfTheQube,3);
    }
}
