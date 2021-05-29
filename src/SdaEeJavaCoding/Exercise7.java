package SdaEeJavaCoding;

import java.util.Stack;

public class Exercise7 {
}

class WeaponMagazine {
    private int size;
    Stack<String> bullets = new Stack<>();
    public WeaponMagazine(int size) {
        this.size = size;

    }

    public void loadBullet(String bullet) {
if ((bullets.size() + 1) > size) {
    System.out.println("Magazine is full. You cannot load more bullets ");
} else {
    bullets.add(bullet);
}
    }

    public boolean isLoaded() {
return bullets.size() > 0;
    }

    public String shot() {
        if (bullets.size() > 0) {
            String bullet = bullets.pop();
            System.out.println("Boom! ->> shooting" + bullet);
            return bullet;
        } else {
            System.out.println("Empty magazine");
        }
return "";
    }

}
