package practice1.part4.task1;

public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25),
    AUTUMN(8);

    private int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Тёплое время года";
        }
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return name() + " (" + averageTemperature + "°C, " + getDescription() + ")";
    }
}