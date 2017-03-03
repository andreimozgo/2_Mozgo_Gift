package by.mozgo.gift.factoryMethod;

import by.mozgo.gift.entity.Marshmallow;
import by.mozgo.gift.entity.MarshmallowColor;

/**
 * @author Andrei Mozgo
 */
public class MarshmallowCreator implements SweetCreator<Marshmallow> {
    @Override
    public Marshmallow createSweet(String name,int ... args) {
        return new Marshmallow(name, args[0],args[1],args[2], MarshmallowColor.values()[args[3]]);
    }
}