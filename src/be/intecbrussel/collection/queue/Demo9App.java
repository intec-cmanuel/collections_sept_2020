package be.intecbrussel.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo9App {
    public static void main(String[] args) {
        Queue<String> brands = new PriorityQueue<>();
        brands.add("Volvo");
        brands.add("Adidas");
        brands.add("Nike");
        brands.add("AAAAAA");

        brands.forEach(System.out::println);
        System.out.println(brands.poll());
    }
}
