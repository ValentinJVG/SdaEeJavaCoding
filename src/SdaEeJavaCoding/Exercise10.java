package SdaEeJavaCoding;

public class Exercise10 {
}
class MoveDirection {
    double x;
    double y;

    public MoveDirection(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
interface Movable {
   static void move(MoveDirection moveDirection) {
    }
}




//Implement the interface in the classes from the previous task (Point2D and Circle). When the
//move(MoveDirection moveDirection) method is called, the objects are to change their position based on
//the provided direction (MoveDirection).
//Validate the offset by calling the other Circle methods