package ee.sda.ajc;

import java.util.*;

public class Task14 {

    public static void main(String[] args) {
        String[] arr = new String[]{"Giorgi", "Giorgi","Giorgi","Giorgi","Giorgi","Giorgi","Giorgi","Giorgi","Giorgi","Giorgi","Levani", "Tamuna", "Akaki", "Giorgi", "Giorgi", "Levani"};
        System.out.println(getUniqueItems(arr).size());

    }

    /*
      2. return a list of elements that have been repeated at least once in the generated array,
      3. return a list of the 25 most frequently recurring items.*/


    public static List<String> getUniqueItems(String[] strings) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(strings));
        return new ArrayList<>(stringSet);
    }

    public static List<String> getNonUniqueItems(String[] strings) {

        Map<String, Integer> frequencies = new HashMap<>();

        for (String string : strings) {
            if (frequencies.containsKey(string)) {
                frequencies.put(string, frequencies.get(string) + 1);
            } else {
                frequencies.put(string, 1);
            }
        }

        List<String> nonUniquesToReturn = new ArrayList<>();

        for (String key : frequencies.keySet()) {
            if (frequencies.get(key) > 1) {
                nonUniquesToReturn.add(key);
            }
        }

        return nonUniquesToReturn;
    }













    public static <T> Set<T> task15(T[] array) {
        Set<T> set = new HashSet<>();
        set.addAll(Arrays.asList(array));
        return set;
    }

    public static <T> List<T> task15_2(T[] array) {
        Map<T, Integer> map = new HashMap<>();

        for (T t : array) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 0);
            }
        }

        List<T> answer = new ArrayList<>();

        for (T key : map.keySet()) {
            if (map.get(key) > 1) {
                answer.add(key);
            }
        }

        return answer;
    }

/*
    public static <T> List<T> top25(T[] array) {

        Map<T, Integer> map = new HashMap<>();

        for (T t : array) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 0);
            }
        }

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue());


        for (int i = map.size(); i > map.size()-25; i--) {

        }

    }*/
}



