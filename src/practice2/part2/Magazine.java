package practice2.part2;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + name);
    }

    // Задание 7: Статический метод
    public static void printMagazines(Printable[] printables) {
        System.out.println("--- Список журналов ---");
        for (Printable p : printables) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }
}