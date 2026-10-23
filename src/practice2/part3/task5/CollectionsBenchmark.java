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

        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long timeArrayList = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) linkedList.add(i);
        long timeLinkedList = System.currentTimeMillis() - start;

        System.out.println("1. Добавление в конец (add):");
        System.out.println("   ArrayList:  " + timeArrayList + " ms");
        System.out.println("   LinkedList: " + timeLinkedList + " ms\n");
    }

    private static void testAddToBeginning() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) arrayList.add(0, i);
        long timeArrayList = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) linkedList.add(0, i);
        long timeLinkedList = System.currentTimeMillis() - start;

        System.out.println("2. Вставка в начало (add(0, element)):");
        System.out.println("   ArrayList:  " + timeArrayList + " ms");
        System.out.println("   LinkedList: " + timeLinkedList + " ms\n");
    }

    private static void testSearch() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        arrayList.contains(N - 1);
        long timeArrayList = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        linkedList.contains(N - 1);
        long timeLinkedList = System.currentTimeMillis() - start;

        System.out.println("3. Поиск (contains):");
        System.out.println("   ArrayList:  " + timeArrayList + " ms");
        System.out.println("   LinkedList: " + timeLinkedList + " ms\n");
    }

    private static void testRemoveFromBeginning() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        arrayList.remove(0);
        long timeArrayList = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        linkedList.remove(0);
        long timeLinkedList = System.currentTimeMillis() - start;

        System.out.println("4. Удаление из начала (remove(0)):");
        System.out.println("   ArrayList:  " + timeArrayList + " ms");
        System.out.println("   LinkedList: " + timeLinkedList + " ms");
    }
}