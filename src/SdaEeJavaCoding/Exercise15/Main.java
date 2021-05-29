package SdaEeJavaCoding.Exercise15;

public class Main {
    public static void main(String[] args) {
        Car bmw = Car.BMW;
        Car ferrari = Car.FERRARI;
        Car porsche = Car.PORSCHE;
        Car fiat = Car.FIAT;
        Car opel = Car.OPEL;
        Car toyota = Car.TOYOTA;
        Car mercedes = Car.MERCEDES;
    }
}

enum Car {

    FERRARI(300_000, 500, 350, 5.8),
    PORSCHE(150_000, 350, 225, 3.0),
    MERCEDES(120_000, 225, 250, 3.2),
    BMW(60_000, 190, 220, 3.5),
    OPEL(15_000, 100, 170, 1.4),
    FIAT(18_000, 120, 180, 2.0),
    TOYOTA(35_000, 110, 180, 2.0);

    Car(double priceEur, double powerKw, double maxSpeedKmH, double engineSize) {

    }


    public static boolean isPremium() {
        if ()
    }

    public static boolean isRegular() {
        boolean result = false;
        return result;
    }

    public static boolean isFasterThan() {
        boolean result = true;
        return result;
    }

}
