package ee.sda.ajc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Task12 {

    public static void main(String[] args) {

        Manufacturer m1 = new Manufacturer("asd ", LocalDate.now(), "Estonia");
        Manufacturer m2 = new Manufacturer("asd ", LocalDate.now(), "Estonia");
        Date s = new Date();

        boolean isEqual = m1.equals(s);

    }
}

class Car {
    @Override
    public boolean equals(Object obj) {
        Car c = (Car) obj;
        System.out.println("Checking whether the object is equal to " + this);
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        //needs to be unique for each object.
        return 0;
    }
}

class Manufacturer {

    private String name;
    private LocalDate yearOfEstablishment;
    private String country;

    public Manufacturer(String name, LocalDate yearOfEstablishment, String country) {
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

    public LocalDate getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(LocalDate yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;

        if (!(obj instanceof Manufacturer)) return false;

        Manufacturer manufacturer = (Manufacturer)obj;

        return manufacturer.getName().equals(name) && manufacturer.getCountry().equals(country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }
}