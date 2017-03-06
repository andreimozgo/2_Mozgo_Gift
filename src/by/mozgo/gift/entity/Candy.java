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

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() == this.getClass()) {
            Candy candy = (Candy) obj;
            if (candy.name.equals(this.name) && candy.price == this.price && candy.weight == this.weight
                    && candy.sugar == this.sugar && candy.type.equals(this.type)) {
                return true;
            }
        }
        return false;
    }
}
