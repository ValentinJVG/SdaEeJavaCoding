package ee.sda.ajc;

public class Task24 {
    public static void main(String[] args) {
        Basket basket = new Basket(0);
        basket.addToBasket(15);
        basket.removeFromBasket(5);
        basket.addToBasket(5);
        basket.removeFromBasket(3);
    }
}

class Basket {
    private int amountOfItemsInTheBasket;

    public Basket(int amountOfItemsInTheBasket) {
        this.amountOfItemsInTheBasket = amountOfItemsInTheBasket;
    }

    public int getAmountOfItemsInTheBasket() {
        return amountOfItemsInTheBasket;
    }

    public void setAmountOfItemsInTheBasket(int amountOfItemsInTheBasket) {
        this.amountOfItemsInTheBasket = amountOfItemsInTheBasket;
    }

    public void addToBasket(int addToBasket) {
        if (amountOfItemsInTheBasket + addToBasket > 10) {
            System.out.println("Too many items in a basket, You can put only " +
                    (10 - amountOfItemsInTheBasket) + " items");
        } else {
            this.amountOfItemsInTheBasket += addToBasket;
            System.out.println("Added " + addToBasket + " to basket");
        }
    }

    public void removeFromBasket(int removeFromBasket) {
        if (amountOfItemsInTheBasket - removeFromBasket < 0) {
            System.out.println("Only " + amountOfItemsInTheBasket + " is available.");
        } else {
            this.amountOfItemsInTheBasket -= removeFromBasket;
            System.out.println(removeFromBasket + " items removed from the basket. " +
                    "In the basket is " + amountOfItemsInTheBasket + " items left.");
        }
    }
}

