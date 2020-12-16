package be.intecbrussel.collection.exercices;

import java.util.*;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        SortedSet<String> stringCollection = new TreeSet<>();

        while (true) {
            String word = kbd.next();
            stringCollection.add(word);
            if (word.endsWith(".")){
                break;
            }
        }

        stringCollection.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println(stringCollection.first());
        System.out.println(stringCollection.last());
    }
}
