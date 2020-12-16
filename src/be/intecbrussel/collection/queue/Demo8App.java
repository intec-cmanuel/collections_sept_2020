package be.intecbrussel.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo8App {
    static Integer x;
    public static void main(String[] args) {
        Queue<Integer> intQueue = new LinkedList<>();
//        intQueue.add(10);
//        intQueue.add(15);
//        intQueue.add(16);
//        intQueue.add(8);
//        intQueue.add(22);

//        intQueue.forEach(System.out::println);
//        System.out.println(intQueue.add(x));
//        System.out.println(intQueue.offer(x));
        System.out.println(intQueue.peek());
        System.out.println(intQueue.element());
        System.out.println(intQueue.element());
        System.out.println(intQueue.element());
        System.out.println(intQueue.element());
        System.out.println(intQueue.element());
        System.out.println(intQueue.element());



        System.out.println();
        intQueue.forEach(System.out::println);

    }
}
