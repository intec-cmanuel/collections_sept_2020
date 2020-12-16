package be.intecbrussel.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo2App {
    public static void main(String[] args) {
        List<String> brands = new ArrayList<>();
        brands.add("Adidas");
        brands.add("Nike");
        brands.add("Volvo");
        brands.add("lol");
        brands.add(":p");
        brands.add("hzhzh");

        brands.add(1, "CORSAIR");
        brands.set(5, "Puma");

        System.out.println("WE HAVE A GET!: " + brands.get(3));

        brands.remove(4);


        brands.forEach(System.out::println);
    }
}
