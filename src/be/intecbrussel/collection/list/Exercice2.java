package be.intecbrussel.collection.list;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        List<String> stringCollection = new ArrayList<>();

        while (true) {
            String word = kbd.next();
            stringCollection.add(word);
            if (word.endsWith(".")){
                break;
            }
        }

        stringCollection.forEach(e -> System.out.print(e + " "));
        System.out.println();

        for (int i = stringCollection.size()-1; i >= 0; i--) {
            System.out.println(stringCollection.get(i));
        }

        Collections.reverse(stringCollection);
        for (String s : stringCollection) {
            System.out.println(s);
        }

        List<String> newCol = new ArrayList<>(stringCollection);
        stringCollection = IntStream.rangeClosed(1, stringCollection.size())
                .mapToObj(index -> newCol.get(newCol.size() - index))
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Amount of words: " + stringCollection.size());

        // DDT
//        long amount = stringCollection.stream().count();
//        System.out.println("Amount of words: " + amount);

        // DDT
//        stringCollection.stream().forEach(System.out::println);

        String[] strArr = stringCollection.toArray(String[]::new);
        for (String s : strArr) {
            System.out.println(s);
        }
        stringCollection.forEach(System.out::println);
        stringCollection.stream().forEach(System.out::println);

        stringCollection.sort(Comparator.naturalOrder());
        //stringCollection = stringCollection.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }
}
