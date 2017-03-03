package by.mozgo.gift.factoryMethod;

import by.mozgo.gift.entity.AbstractSweet;

/**
 * @author Andrei Mozgo
 */
public interface SweetCreator <T extends AbstractSweet> {
    T createSweet(String name, int ... args);
}