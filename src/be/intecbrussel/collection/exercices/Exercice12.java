package be.intecbrussel.collection.exercices;

import be.intecbrussel.collection.set.Person;
import com.sun.source.tree.Tree;

import java.util.*;

public class Exercice12 {
    public static void main(String[] args) {
        SortedMap<String, Person> people = new TreeMap<>();
        people.put("Tony",new Person("Tony", "Cabascibetta",Person.Gender.MALE,26, 1.8, 71.5));
        people.put("Audric",new Person( "Audric", "Onockx",Person.Gender.MALE,25, 1.75, 70.5));
        people.put("Dieter",new Person("Dieter", "Rookie",Person.Gender.MALE,23, 1.73, 72.5));
        people.keySet().stream().map(person->people.get(person)).forEach(System.out::println);
        System.out.println(people.get("Dieter"));
        System.out.println(people.get(people.firstKey()));
        System.out.println(people.get(people.lastKey()));
    }
}
