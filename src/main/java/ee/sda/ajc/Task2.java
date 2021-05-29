package ee.sda.ajc;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

    }

    public static void task2(List<String> stringList) {
        stringList.stream()
                .map(elem -> elem.toLowerCase())
                .collect(Collectors.toList());
        Collections.sort(stringList, Collections.reverseOrder());
    }




}
