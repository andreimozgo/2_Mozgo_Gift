package by.mozgo.gift.factoryMethod;

import by.mozgo.gift.entity.Candy;
import by.mozgo.gift.entity.CandyType;

/**
 * @author Andrei Mozgo
 */
public class CandyCreator implements SweetCreator<Candy> {

    @Override
    public Candy createSweet(String[] candyParameters) throws IllegalArgumentException {
            String name = candyParameters[1];
            float price = Float.parseFloat(candyParameters[2]);
            int weight = Integer.parseInt(candyParameters[3]);
            int sugar = Integer.parseInt(candyParameters[4]);
            CandyType type = CandyType.valueOf(candyParameters[5].toUpperCase());
            return new Candy(name, price, weight, sugar, type);
    }
}