package ee.sda.ajc;

import java.util.LinkedList;
import java.util.Stack;

public class Task7 {
    public static void main(String[] args) {
        WeaponMagazine wm = new WeaponMagazine(10);

        wm.loadBullet("a");
        wm.loadBullet("z");
        wm.loadBullet("s");
        wm.loadBullet("t");
        wm.loadBullet("b");
        wm.loadBullet("h");

        while(wm.isLoaded()) {
            wm.shot();
        }

        wm.shot(); // <--- ?
    }
}


class WeaponMagazine {

    private int size;

    Stack<String> bullets = new Stack<>();

    public WeaponMagazine(int size) {
        this.size = size;
    }

    public void loadBullet(String bullet) {
        if ((bullets.size() + 1) > size) {
            System.out.println("Magazine is full. You cannot load more bullets!");
        } else {
            bullets.add(bullet);
        }
    }

    public boolean isLoaded() {
        return bullets.size() > 0;
    }

    public void shot() {
        if (bullets.size() > 0) {
            String bullet = bullets.pop();
            System.out.println("Booom! ->> shooting " + bullet);
        } else {
            System.out.println("Empty magazine");
        }
        return;
    }
}