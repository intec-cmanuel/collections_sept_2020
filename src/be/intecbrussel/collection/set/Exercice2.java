package be.intecbrussel.collection.set;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercice2 {

    public static void main(String[] args) {
//        wordApp();
//        lotteryAudric();
//        lotteryGokhan();
        lotteryManon();
    }

    private static void lotteryAudric() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Collection<Integer> guessed = new HashSet<>();
        Collection<Integer> toGuess = new HashSet<>();
        System.out.println("Guess 6 numbers between 1 & 45.");
        while (guessed.size() < 6) {
            int input = scanner.nextInt();
            if (1 <= input && input <= 45) {
                guessed.add(input);
            }
        }
        scanner.close();
        while (toGuess.size() < 6) {
            toGuess.add(1 + random.nextInt(45));
        }

        guessed.retainAll(toGuess);
        System.out.printf("You guessed %d numbers.%nDraw : ", guessed.size());
        toGuess.forEach(n -> System.out.print(n + " "));
    }

    public static void lotteryGokhan() {
        Collection<Integer> lottery = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (lottery.size() != 6) {
            System.out.println("Guess a number between 1-45: ");
            int number = scanner.nextInt();
            if (number <= 45 && number > 0) {
                lottery.add(number);
            }
        }

        Collection<Integer> lottery2 = new HashSet<>();
        Random random = new Random();
        while (lottery2.size() != 6) {
            lottery2.add(random.nextInt(45) + 1);
        }

        lottery.retainAll(lottery2);
        System.out.printf("You guessed %d numbers.%nDraw : ", lottery.size());
        lottery2.forEach(n -> System.out.print(n + " "));
    }

    private static void lotteryManon(){
        Scanner keyboard = new Scanner(System.in);
        Set<Integer> lotto = new HashSet<>();
        Set<Integer> too = new HashSet<>();
        makeSet(keyboard, lotto);
        makeSet(keyboard, too);
        lotto.retainAll(too);
        System.out.println(lotto.size());
        keyboard.close();
    }

    private static void makeSet(Scanner keyboard, Set<Integer> set){
        System.out.println("Give 6 dif numbers between 1 and 45");
        while (set.size()<6){
            int number = keyboard.nextInt();
            if(!(number<1 || number>45)){
                set.add(number);
            }
        }
    }

    private static void intApp() {
        Scanner keyboard = new Scanner(System.in);
        Collection<Integer> intList = new HashSet<>();

        while (true) {
            int number = keyboard.nextInt();
            if (number == -1) {
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
        if (average.isPresent()) {
            System.out.println("The average is " + average.getAsDouble());
        }

        // DDT
        System.out.printf("%s", average.isPresent() ? String.format("the avg is : %.2f%n", average.getAsDouble()) : "");

        // ---

        System.out.println("The sum: " + sum);
    }

    private static void wordApp() {
        Scanner kbd = new Scanner(System.in);
        Collection<String> stringCollection = new HashSet<>();

        while (true) {
            String word = kbd.next();
            stringCollection.add(word);
            if (word.endsWith(".")) {
                break;
            }
        }

        stringCollection.forEach(e -> System.out.print(e + " "));
        System.out.println();

//        for (int i = stringCollection.size()-1; i >= 0; i--) {
//            System.out.println(stringCollection.get(i));
//        }
//
//        Collections.reverse(stringCollection);
//        for (String s : stringCollection) {
//            System.out.println(s);
//        }

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

//        stringCollection.sort(Comparator.naturalOrder());
        //stringCollection = stringCollection.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }
}
