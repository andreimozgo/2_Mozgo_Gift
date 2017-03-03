package by.mozgo.gift.entity;

/**
 * @author Andrei Mozgo
 */
public class Candy extends AbstractSweet {
    private CandyType type;

    public Candy(String name, float price, int weight, int sugar, CandyType type) {
        super(name, price, weight, sugar);
        this.type = type;
    }

    public CandyType getType() {
        return type;
    }
}
