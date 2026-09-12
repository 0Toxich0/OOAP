package practice1.part4.task1;

public enum Season {
    WINTER(-10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    AUTUMN(8) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public abstract String getDescription(); // метод для переопределения

    @Override
    public String toString() {
        return name() + " (средняя температура: " + averageTemperature + "°C, " + getDescription() + ")";
    }
}