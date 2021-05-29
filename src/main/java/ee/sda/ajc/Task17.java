//TODO

package ee.sda.ajc;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(ConversionType.CENTIMETERS_TO_INCHES);
    }
}

enum ConversionType {
    METERS_TO_YARDS(0.9144),
    YARDS_TO_METERS(1.09361),
    CENTIMETERS_TO_INCHES(2.54),
    INCHES_TO_CENTIMETERS(0.393701),
    KILOMETERS_TO_MILES(1.60934),
    MILES_TO_KILOMETERS(0.621371);

    ConversionType(double value) {
    }
}

class MeasurementConverter {
    static double convert(double value, ConversionType conversionType) {

        double result = 0;
        return result;
    }
}