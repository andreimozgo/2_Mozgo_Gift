package by.mozgo.gift.entity;

/**
 * @author Andrei Mozgo
 */
public class Marshmallow extends AbstractSweet {
    MarshmallowColor color;

    public Marshmallow(float price, int weight, byte sugar, MarshmallowColor color) {
        super(price, weight, sugar);
        this.color = color;
    }

    public MarshmallowColor getColor() {
        return color;
    }
}
