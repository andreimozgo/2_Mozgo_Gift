package by.mozgo.gift.factorymethod;

import by.mozgo.gift.entity.Marshmallow;
import by.mozgo.gift.entity.MarshmallowColor;

/**
 * @author Andrei Mozgo
 */
public class MarshmallowCreator implements SweetCreator<Marshmallow> {
    @Override
    public Marshmallow createSweet(String[] marshmallowParameters) throws IllegalArgumentException {
        String name = marshmallowParameters[1];
        float price = Float.parseFloat(marshmallowParameters[2]);
        int weight = Integer.parseInt(marshmallowParameters[3]);
        int sugar = Integer.parseInt(marshmallowParameters[4]);
        MarshmallowColor form = MarshmallowColor.valueOf(marshmallowParameters[5].toUpperCase());
        return new Marshmallow(name, price, weight, sugar, form);
    }
}