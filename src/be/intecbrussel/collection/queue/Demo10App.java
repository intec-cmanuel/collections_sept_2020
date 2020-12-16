package be.intecbrussel.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo10App {
    public static void main(String[] args) {
        Deque<String> brands = new ArrayDeque<>();
        brands.add("Volvo");
        brands.add("Adidas");
        brands.add("Nike");
        brands.add("AAAAAA");

        brands.forEach(System.out::println);

        System.out.println(brands.peekFirst());
        System.out.println(brands.peekLast());

        System.out.println(brands.pollFirst());
        System.out.println(brands.pollLast());
    }
}
