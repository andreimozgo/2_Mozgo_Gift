package by.mozgo.gift.entity;

/**
 * @author Andrei Mozgo
 */
public class Marshmallow extends AbstractSweet {
    private MarshmallowColor color;

    public Marshmallow(String name, float price, int weight, int sugar, MarshmallowColor color) {
        super(name, price, weight, sugar);
        this.color = color;
    }

    public MarshmallowColor getColor() {
        return color;
    }
}
