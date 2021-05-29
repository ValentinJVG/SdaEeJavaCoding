package ee.sda.ajc;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        SDAHashSet<String> set = new SDAHashSet<>();

        set.add("Daniel");
        set.add("Daniel");
        set.add("Daniel");
        set.add("Daniel");
        set.add("Daniel");
        set.add("Daniel");
        set.add("Daniel");
        set.add("Daniel");
        set.add("Daniel");
        set.add("Daniel");
        set.add("Karina");
        set.add("Karina");
        set.add("Karina");
        set.add("Karina");
        set.add("Karina");
        set.add("Karina");
        set.add("Karina");
        set.add("Karina");
        set.add("Karina");
        set.add("Karina");
        System.out.println(set.size());
    }
}

class SDAHashSet<T> {

    private List<T> objects;


    public SDAHashSet() {
        objects = new ArrayList<>();
    }

    public void add(T t) {
        if (objects.contains(t)) {
            objects.remove(t);
            objects.add(t);
            return;
        }
        objects.add(t);
    }

    public void remove(T t) {
        objects.remove(t);
    }

    public int size() {
        return objects.size();
    }

    public boolean contains(T t) {
        return objects.contains(t);
    }

    public void clear() {
        objects.clear();
    }
}
