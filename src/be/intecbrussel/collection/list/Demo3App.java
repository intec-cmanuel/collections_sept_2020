package be.intecbrussel.collection.list;

import java.util.*;

public class Demo3App {
    public static void main(String[] args) {
        List<String> brands = new ArrayList<>();
        brands.add("Adidas");
        brands.add("Nike");
        brands.add("Volvo");

        Set<String> brands2 = Set.of("Adidas", "Nike", "Volvo");

        brands.add("Mercedes");
//        brands2.add("Mercedes");

//        brands.forEach(System.out::println);
//        System.out.println();
//        brands2.forEach(System.out::println);

        System.out.println(brands.getClass().getCanonicalName());
        System.out.println(brands2.getClass().getCanonicalName());
    }
}
