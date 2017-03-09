package by.mozgo.gift.entity;

/**
 * @author Andrei Mozgo
 */
public abstract class AbstractSweet {
    protected String name;
    protected float price;
    protected int weight;
    protected int sugar;

    public AbstractSweet(String name, float price, int weight, int sugar) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.sugar = sugar;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "name=" + name +
                ", price=" + price +
                ", weight=" + weight +
                ", sugar=" + sugar +
                "\n";
    }
}
