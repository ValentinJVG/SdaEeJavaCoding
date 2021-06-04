package ee.sda.ajc;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Giorgi");
        strings.add("Beqa");
        strings.add("Ana");

        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println();
        sort2(strings);

        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static List<String> sort(List<String> stringList) {
        Collections.sort(stringList);
        return stringList;
    }

    public static List<String> sort2(List<String> stringList) {
        stringList.sort((s1, s2) -> {
            if ((s1.compareTo(s2)) > 0) {
                return 1;
            } else if (s1.compareTo(s2) == 0) {
                return 0;
            } else {
                return -1;
            }
        });
        return stringList;
    }



}
