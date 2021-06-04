package ee.sda.ajc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Valentin");
        list.add("Karina");
        list.add("Leonardo");
        list.add("Donatello");
        list.add("Ragnar");

        task1(list);

//        list.forEach(System.out::println);

    }


    public static List<String> task1(List<String> list) {
        //TODO: Improve conversion from list to array
       String[] arr = new String[list.size()];

       for (int i = 0; i < list.size(); i++) {
           arr[i] = list.get(i);
       }


        Arrays.sort(arr);


        Collections.reverse(Arrays.asList(arr));

        for (String s : arr) {
            System.out.println(s);
        }


        return null;
    }

}