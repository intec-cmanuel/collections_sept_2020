package be.intecbrussel.collection.exercices;

import java.util.*;

public class Exercice11 {
    public static void main(String[] args) {
//        mainMert();
        mainAudric();
    }

    private static void mainAudric() {
        Random random = new Random();
        Map<Coin, Integer> wallet = new LinkedHashMap<>();
        for (Coin value : Coin.values()) {
            wallet.put(value, random.nextInt(10));
        }
        wallet.forEach((k, v) -> System.out.println(k + " " + v));
        double sum = wallet.entrySet()
                .stream()
                .mapToDouble(entrySet -> entrySet.getKey().getValue() * entrySet.getValue())
                .sum();
    }

    private static void mainMert() {
        Map<Coin, Integer> wallet = new LinkedHashMap<>();
        wallet.put(Coin.TWO_EUROS, 2);
        wallet.put(Coin.FIFTY_CENTS, 3);
        wallet.put(Coin.TEN_CENTS, 5);
        wallet.forEach((k,v) -> System.out.println( k + ": " + v));
        double sum = wallet.keySet().stream()
                .map(coin -> wallet.get(coin) * coin.getValue())
                .reduce(0.0, Double::sum);
        System.out.println(sum);
        wallet.keySet().stream()
                .sorted(Comparator.comparing(Coin::getValue))
                .forEach(System.out::println);

    }

    public enum Coin {
        ONE_CENT(0.01),
        TWO_CENTS(0.02),
        FIVE_CENTS(0.05),
        TEN_CENTS(0.10),
        TWENTY_CENTS(0.20),
        FIFTY_CENTS(0.50),
        ONE_EURO(1),
        TWO_EUROS(2);

        private double value;

        private Coin(double value){
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return name();
        }
    }
}
