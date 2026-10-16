package practice2.part3.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsBenchmark {
    private static final int N = 100_000;

    public static void main(String[] args) {
        System.out.println("Тестирование на " + N + " элементах...\n");

        testAddToEnd();
        testAddToBeginning();
        testSearch();
        testRemoveFromBeginning();
    }

    private static void testAddToEnd() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long timeArrayList = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(i);
        long timeLinkedList = System.nanoTime() - start;

        System.out.println("1. Добавление в конец (add):");
        System.out.printf("   ArrayList:  %d ns%n", timeArrayList);
        System.out.printf("   LinkedList: %d ns%n%n", timeLinkedList);
    }

    private static void testAddToBeginning() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(0, i);
        long timeArrayList = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(0, i);
        long timeLinkedList = System.nanoTime() - start;

        System.out.println("2. Вставка в начало (add(0, element)):");
        System.out.printf("   ArrayList:  %d ns%n", timeArrayList);
        System.out.printf("   LinkedList: %d ns%n%n", timeLinkedList);
    }

    private static void testSearch() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.nanoTime();
        arrayList.contains(N - 1);
        long timeArrayList = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.contains(N - 1);
        long timeLinkedList = System.nanoTime() - start;

        System.out.println("3. Поиск (contains):");
        System.out.printf("   ArrayList:  %d ns%n", timeArrayList);
        System.out.printf("   LinkedList: %d ns%n%n", timeLinkedList);
    }

    private static void testRemoveFromBeginning() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.nanoTime();
        arrayList.remove(0);
        long timeArrayList = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.remove(0);
        long timeLinkedList = System.nanoTime() - start;

        System.out.println("4. Удаление из начала (remove(0)):");
        System.out.printf("   ArrayList:  %d ns%n", timeArrayList);
        System.out.printf("   LinkedList: %d ns%n", timeLinkedList);
    }
}