package by.mozgo.gift.entity;

/**
 * @author Andrei Mozgo
 */
public abstract class AbstractSweet {
    private String name;
    private float price;
    private int weight;
    private int sugar;

    public AbstractSweet(String name, float price, int weight, int sugar) {
        this.name = name;
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

    public int getSugar() {
        return sugar;
    }
}
