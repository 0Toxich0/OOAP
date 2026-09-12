package practice1.part4.task4;

public class Monitor {
    private double diagonal; // дюймы
    private String resolution;

    public Monitor(double diagonal, String resolution) {
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Monitor{" + diagonal + "\", " + resolution + "}";
    }
}