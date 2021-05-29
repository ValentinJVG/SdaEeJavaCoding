package ee.sda.ajc;

public class Task8 {

    public static void main(String[] args) {

    }

}

@FunctionalInterface
interface Validator {
    boolean validate(Parcel input);
}

class Parcel {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }
}


/*
* The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is
not less than 30, whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In
case of errors, it should inform the user about them.
*
*
* */


