package by.mozgo.gift.factorymethod;

/**
 * @author Andrei Mozgo
 */
public interface SweetCreator <AbstractSweet> {
    AbstractSweet createSweet(String[] sweetParameters) throws IllegalArgumentException;
}