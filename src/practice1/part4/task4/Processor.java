package practice1.part4.task4;

public class Processor {
    private String model;
    private double frequency; // GHz

    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" + model + ", " + frequency + "GHz}";
    }
}