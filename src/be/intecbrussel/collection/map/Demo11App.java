package be.intecbrussel.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo11App {
    public static void main(String[] args) {
        Map<String, Integer> personMap = new LinkedHashMap<>();
        personMap.put("Anthony", 300);
        personMap.put("Manu", Integer.MAX_VALUE + 1);
        personMap.put("Trump", 50);
        personMap.put("Audric Neutron", Integer.MAX_VALUE);
        personMap.put("Jean-Jaque", 100);

        personMap.remove("Anthony");
        personMap.remove("Audric", 21475700);
        personMap.remove("Trump", 50);

        personMap.replace("Jean-Jaque", 99);
        personMap.replace("Manu", 20, 9);
        personMap.replace("Manu", -2147483648, 9);

        Set<String> keySet = personMap.keySet();
        Set<Map.Entry<String, Integer>> entrySet = personMap.entrySet();

        keySet.forEach(System.out::println);
        entrySet.forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

        personMap.forEach((key, value) -> System.out.printf("Key: %s - IQ: %d%n", key, value));
    }
}
