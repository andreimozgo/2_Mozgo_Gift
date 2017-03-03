package by.mozgo.gift.factoryMethod;

import by.mozgo.gift.entity.Candy;
import by.mozgo.gift.entity.CandyType;

/**
 * @author Andrei Mozgo
 */
public class CandyCreator implements SweetCreator<Candy>{

    @Override
    public Candy createSweet(String name, int ... args) {
        return new Candy(name, args[0],args[1],args[2], CandyType.values()[args[3]]);
    }
}