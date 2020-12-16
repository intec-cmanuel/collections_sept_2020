package be.intecbrussel.collection.list;

import java.util.*;

public class Demo1App {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
//        List<String> students = new ArrayList<>();
        students.add("Matteo");
        students.add("NotAnthony");
        students.add("DefinitallyNotAnthony");
        System.out.println("ADD METHODS SIZE: " + students.size());
        students.forEach(System.out::println);

        students.remove("NotAnthony");
        students.remove("DefinitallyNotAnthony");
        System.out.println("\nREMOVE METHODS SIZE: " + students.size());
        students.forEach(System.out::println);

        students.clear();
        System.out.println("\nCLEAR METHOD SIZE: " + students.size());
        students.forEach(System.out::println);

        students.add("Matteo");
        students.add("NotAnthony");
        students.add("DefinitallyNotAnthony");
        boolean containsMatteo;
//        students.remove("Matteo");
        containsMatteo = students.contains("Matteo");
        System.out.println("Is matteo present? " + containsMatteo + "\n");

        students.stream()
                .filter(e -> e.length() > 6)
                .forEach(e -> System.out.println("Valid name: " + e));

        for (String student : students) {
            if (student.length() > 6) {
                System.out.println("Valid name: " + student);
            }
        }

        students.add("Manon");

        // Not available for Collection, only List
//        for (int i = 0; i < students.size(); i++) {
//            String student = students.get(i);
//            if (student.length() > 6) {
//                System.out.println(student);
//            }
//        }

        Optional<String> student = students.stream()
                .skip(2)
                .findFirst();

        if (student.isPresent()) {
            System.out.println(student.get());
        }
    }
}
