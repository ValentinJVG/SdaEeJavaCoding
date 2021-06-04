package ee.sda.ajc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task4 {

    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addToStorage("ta", "asd");
    }
}


class Storage {

    //TODO: implement storage in such a way, that multiple values can be added per one unique KEY.
    private Map<String, String> storage;

    public Storage() {
        storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        storage.put(key, value);
    }


    //TODO: implement printValues
    public void printValue(String key) {
        System.out.println("Value of " + key + " is " + storage.get(key));
    }

    //TODO: implement findValues
    public String findValue(String value) throws Exception {
        if (!storage.containsKey(value)) {
            throw new Exception("Sorry, such such element found.");
        } else {
            return storage.get(value);
        }
    }
}















/*

class Storage {
    private Map<String, ArrayList<String>> map;


    public Storage() {
        map = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    public void printValues(String key) {
        if (!map.containsKey(key)) {
            System.out.println("No such element.");
        } else {
            map.get(key).forEach(System.out::println);
        }
    }
}*/
