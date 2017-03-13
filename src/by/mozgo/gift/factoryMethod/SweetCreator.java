package by.mozgo.gift.factoryMethod;

/**
 * @author Andrei Mozgo
 */
public interface SweetCreator <AbstractSweet> {
    AbstractSweet createSweet(String[] sweetParameters) throws IllegalArgumentException;
}