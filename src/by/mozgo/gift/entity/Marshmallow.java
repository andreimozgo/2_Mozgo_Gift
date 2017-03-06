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

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() == this.getClass()) {
            Marshmallow marshmallow = (Marshmallow) obj;
            if (marshmallow.name.equals(this.name) && marshmallow.price == this.price && marshmallow.weight == this.weight
                    && marshmallow.sugar == this.sugar && marshmallow.color.equals(this.color)) {
                return true;
            }
        }
        return false;
    }
}
