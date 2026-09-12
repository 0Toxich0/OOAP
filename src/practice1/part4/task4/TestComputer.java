package practice1.part4.task4;

public class TestComputer {
    public static void main(String[] args) {
        Computer pc = new Computer(
                Brand.ASUS,
                new Processor("Intel i7", 3.6),
                new Memory(16),
                new Monitor(27, "1920x1080")
        );
        System.out.println(pc);
        System.out.println("Бренд: " + pc.getBrand());
        System.out.println("Процессор: " + pc.getProcessor());
    }
}