package SdaEeJavaCoding;

public class Exercise8 {
    public static void main(String[] args) {
        Validator validator = input -> false;

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

        if ((xLength + yLength + zLength) > 300) {
            System.out.println("The parcel is too big");
        }
        if (!isExpress && (xLength < 30 || yLength < 30 || zLength < 30)) {
            System.out.println("The parcel is too small");
        }
        if (isExpress && (xLength < 15 || yLength < 15 || zLength < 15)) {
            System.out.println("The parcel is too small");
        }
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