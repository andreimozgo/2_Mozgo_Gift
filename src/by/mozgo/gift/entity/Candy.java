package by.mozgo.gift.entity;

/**
 * @author Andrei Mozgo
 */
public class Candy extends AbstractSweet {
    CandyType type;

    public Candy(float price, int weight, byte sugar, CandyType type) {
        super(price, weight, sugar);
        this.type = type;
    }

    public CandyType getType() {
        return type;
    }
}
