package practice1.part4.task4;

public class Memory {
    private int size; // GB

    public Memory(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Memory{" + size + "GB}";
    }
}