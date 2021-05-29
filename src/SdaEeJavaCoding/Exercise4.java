package SdaEeJavaCoding;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    public static void main(String[] args) {

    }
}

class Storage {
    private final Map<String, String> storage;

    public Storage() {
        storage = new HashMap<>();
    }


    public void addToStorage(String key, String value) {
        storage.put(key, value);
    }

    public void printValue(String key) {
        System.out.println("Value of " + key + " is " + storage.get(key));

    }

    public String findValue(String value) throws Exception {
        if (!storage.containsKey(value)) {
            throw  new Exception ("Sorry, no such element  found ");
        } else {
            return storage.get(value);
        }
    }
}