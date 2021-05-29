package SdaEeJavaCoding;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {

}
class SDAHashSet <T> {
    private final List<T>  objects;

    public SDAHashSet() {
        objects = new ArrayList<>();
    }

    public void add(T t) {
        if(objects.contains(t)) {
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
