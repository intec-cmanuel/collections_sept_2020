package be.intecbrussel.collection.exercices;

import be.intecbrussel.collection.set.Person;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Exercice6 {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Audric", "Onockx", Person.Gender.MALE, 25, 178, 70));
        personSet.add(new Person("Matteo", "Onockx", Person.Gender.MALE, 2, 55, 60));
        personSet.add(new Person("Anthony", "Onockx", Person.Gender.FEMALE, 28, 160, 60));
        personSet.add(new Person("Dieter", "Onockx", Person.Gender.MALE, 2, 45, 60));
        personSet.add(new Person("Elline", "Onockx", Person.Gender.FEMALE, 2, 45, 60));
        personSet.add(new Person("Shelbatra", "Onockx", Person.Gender.FEMALE, 2, 45, 60));

        Deque<Person> personDeque = new ArrayDeque<>();
        personSet.forEach(e -> addToDeque(e, personDeque));

        while (personDeque.size() >= 2) {
            System.out.printf("Couple: %s - %s%n", personDeque.pollFirst().getFirstName(), personDeque.pollLast().getFirstName());
        }
    }

    private static void addToDeque(Person person, Deque<Person> deque) {
        switch (person.getGender()) {
            case MALE:
                deque.offerFirst(person);
                break;
            case FEMALE:
                deque.offerLast(person);
                break;
        }
    }
}
