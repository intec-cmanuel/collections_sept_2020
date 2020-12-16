package be.intecbrussel.collection.set;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Demo4App {
    public static void main(String[] args) {
        Collection<Cat> ingredients = new HashSet<>();
        ingredients.add(new Cat("Jean-Marie Robert Roger"));
        ingredients.add(new Cat("*censored*"));
        ingredients.add(new Cat("Raybow"));
        ingredients.add(new Cat("Audric"));
        ingredients.add(new Cat("Lola"));
        ingredients.add(new Cat("Anthony"));
        ingredients.add(new Cat("Jean-Jean"));

        for (int i = 0; i<10; i++){
            ingredients.forEach(e -> {
                if (e.getName().equals("Lola") || e.getName().equals("Raybow") || e.getName().equals("Anthony")){
                    e.die();
                }
            });
        }

        ingredients.forEach(e -> {
            if (e.getName().equals("Audric")){
                e.die();
            }
        });

        ingredients.stream()
                .filter(e -> e.getLives() > 0)
                .forEach(System.out::println);

        ingredients.add(new Cat("Audric"));

        System.out.println();
        ingredients.stream()
                .filter(e -> e.getLives() > 0)
                .forEach(System.out::println);

    }
}