package ee.sda.ajc;

import java.util.HashMap;
import java.util.TreeMap;

public class Task6 {

    public static void main(String[] args) {
        TreeMap<String, String> tree = new TreeMap<>();

        tree.put("giorgi", "tsiklauri");
        tree.put("tako", "ubnashivili");
        tree.put("geno", "jishkariani");
        tree.put("mako", "kokaia");

        task6(tree);

    }

    public static void task6(TreeMap<String, String> treeMap) {
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
}


