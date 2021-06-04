package ee.sda.ajc;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);

        task3(map);
        task3_1(map);

    }

    public static void task3(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println("Key: " + k + ", " + "Value: " + v));
    }

    public static void task3_1(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", " + "Value: " + map.get(key));
        }
    }

}