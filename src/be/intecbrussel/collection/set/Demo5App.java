package be.intecbrussel.collection.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo5App {
    public static void main(String[] args) {
        Collection<String> brands = new LinkedHashSet<>();
        brands.add("Adidas");
        brands.add("Nike");
        brands.add("Volvo");
        brands.add("lol");
        brands.add(":p");
        brands.add("hzhzh");

        brands.forEach(System.out::println);
    }
}
