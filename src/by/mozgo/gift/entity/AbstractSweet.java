package by.mozgo.gift.entity;

/**
 * @author Andrei Mozgo
 */
public abstract class AbstractSweet {
    float price;
    int weight;
    byte sugar;

    public AbstractSweet(float price, int weight, byte sugar) {
        this.price = price;
        this.weight = weight;
        this.sugar = sugar;
    }

    public float getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public byte getSugar() {
        return sugar;
    }
}
