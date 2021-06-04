package ee.sda.ajc;

public class Task19 {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop("Intel i5", "6Gb", "Nvidia",
                "Lenovo", "Some model", "LongLife battery");

        System.out.println(lenovo);
    }
}

class Laptop extends Computer {
    String battery;

    public Laptop(String processor, String ram, String graphicsCard,
                  String company, String model, String battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }


}
