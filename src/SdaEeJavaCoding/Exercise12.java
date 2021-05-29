package SdaEeJavaCoding;

import java.util.Objects;

public class Exercise12 {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer("Subaru", 1932, "Japan");
        Car Subaru = new Car();
        Car Toyota = new Car();
        Subaru.setModel("Forester");
        Subaru.setYearOfManufacture(2019);
        Subaru.setPrice(29900);
        Toyota.setModel("Rav4");
        Toyota.setYearOfManufacture(2021);
        Toyota.setPrice(33900);
    }
}

class Manufacturer {
    String name, country;
    int yearOfEstablishment;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Manufacturer)) return false;

        Manufacturer manufacturer = (Manufacturer) obj;
        return manufacturer.getName().equals(name) && manufacturer.getCountry().equals(country)
                && manufacturer.getYearOfEstablishment().equals(yearOfEstablishment);
    }

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

enum engineType {
    V12, V8, V6, S6, S4, S3
}

class Car {
    String name, model;
    int price, yearOfManufacture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object object) {
        if (object==null) return false;
        if (object==this) return true;
        if (!(object instanceof Car)) return false;

        Car car = (Car) object;
        return price == car.price && yearOfManufacture == car.yearOfManufacture && name.equals(car.name) && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture);
    }
}
