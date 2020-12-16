package be.intecbrussel.collection.exercices;

import be.intecbrussel.collection.set.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
//        int cmp = o1.getAge() - o2.getAge();
//        return Integer.compare(cmp, 0);

        return o1.getAge() - o2.getAge();
    }
}
