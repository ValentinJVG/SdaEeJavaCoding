package ee.sda.ajc;

import java.util.Objects;

public class Task18 {
    public static void main(String[] args) {
        Computer samsung = new Computer("Intel i7","8Gb","NVidia 100Gb",
                "Samsung", "SuperMegaBigScreen");
        Computer dell = new Computer("intel i5", "6Gb", "built in 5Gb",
                "Dell", "Dell123");
        System.out.println(samsung.hashCode());
        System.out.println(dell.hashCode());
        System.out.println(samsung.equals(dell));
        System.out.println(samsung);
        System.out.println(dell);
    }
}
class Computer {
    String processor, ram, graphicsCard, company,model;
    public Computer(String processor, String ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public void Laptop (String processor, String ram, String graphicsCard,
                        String company, String model, String battery) {

    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return processor.equals(computer.processor) && ram.equals(computer.ram) && graphicsCard.equals(computer.graphicsCard) && company.equals(computer.company) && model.equals(computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
