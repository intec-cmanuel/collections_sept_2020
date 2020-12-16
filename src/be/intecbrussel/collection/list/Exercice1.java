package be.intecbrussel.collection.list;

import java.util.*;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Collection<Integer> intList = new LinkedList<>();

        while (true) {
            int number = keyboard.nextInt();
            if (number == -1){
                break;
            } else {
                intList.add(number);
            }
        }

        intList.stream()
                .forEach(System.out::println);

        int sum;
        int avg;

        // SUM
        sum = intList.stream()
                .mapToInt(e -> e)
                .sum();

        sum = intList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        // ---

        // AVG
        OptionalDouble average = intList.stream()
                .mapToDouble(e -> e)
                .average();

        if (average.isPresent()) {
            System.out.format("avg: %.2f %n", average.getAsDouble());
        }

        average = intList.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
        if(average.isPresent()){
            System.out.println("The average is " +  average.getAsDouble());
        }

        // DDT
        System.out.printf("%s", average.isPresent()? String.format("the avg is : %.2f%n", average.getAsDouble()):"");

        // ---

        System.out.println("The sum: " + sum);


    }
}
