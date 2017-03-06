package by.mozgo.gift.builder;

import by.mozgo.gift.entity.AbstractSweet;
import by.mozgo.gift.entity.Candy;
import by.mozgo.gift.entity.Cookie;
import by.mozgo.gift.entity.Marshmallow;
import by.mozgo.gift.exception.SweetBuilderException;
import by.mozgo.gift.factoryMethod.CandyCreator;
import by.mozgo.gift.factoryMethod.CookieCreator;
import by.mozgo.gift.factoryMethod.MarshmallowCreator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetBuilder {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final int MAX_CANDY_PARAMETERS = 6;
    private static final int MAX_COOKIE_PARAMETERS = 6;
    private static final int MAX_MARSHMALLOW_PARAMETERS = 6;
    private static final int SWEET_TYPE_INDEX = 0;
    private static final String PARAMETERS_DELIMITER = "\\s";

    public static List<AbstractSweet> generateSweets(List<String> inputData) throws SweetBuilderException {
        List<AbstractSweet> gift = new ArrayList<>();
        for (int inputStringIndex = 0; inputStringIndex < inputData.size();) {
            String sweet = inputData.get(inputStringIndex);
            inputStringIndex++;
            String[] sweetParameters = sweet.split(PARAMETERS_DELIMITER);
            switch (sweetParameters[SWEET_TYPE_INDEX]) {
                case "candy":
                    if (sweetParameters.length != MAX_CANDY_PARAMETERS) {
                        throw new SweetBuilderException("Invalid number of parameters in line " + inputStringIndex + ".");
                    } else {
                        try {
                            Candy candy = new CandyCreator().createSweet(sweetParameters);
                            gift.add(candy);
                        } catch (IllegalArgumentException e) {
                            throw new SweetBuilderException("Incorrect symbol in line " + inputStringIndex + ".");
                        }
                    }
                    break;
                case "cookie":
                    if (sweetParameters.length != MAX_COOKIE_PARAMETERS) {
                        throw new SweetBuilderException("Invalid number of parameters in line " + inputStringIndex + ".");
                    } else {
                        try {
                            Cookie cookie = new CookieCreator().createSweet(sweetParameters);
                            gift.add(cookie);
                        } catch (IllegalArgumentException e) {
                            throw new SweetBuilderException("Incorrect symbol in line " + inputStringIndex + ".");
                        }
                    }
                    break;
                case "marshmallow":
                    if (sweetParameters.length != MAX_MARSHMALLOW_PARAMETERS) {
                        throw new SweetBuilderException("Invalid number of parameters in line " + inputStringIndex + ".");
                    } else {
                        try {
                            Marshmallow marshmallow = new MarshmallowCreator().createSweet(sweetParameters);
                            gift.add(marshmallow);
                        } catch (IllegalArgumentException e) {
                            throw new SweetBuilderException("Incorrect symbol in line " + inputStringIndex + ".");
                        }
                    }
                    break;
                default:
                    throw new SweetBuilderException("Incorrect input line " + inputStringIndex + ": unknown sweet.");
            }
        }
        if(gift.size() == 0){
            LOGGER.log(Level.FATAL, "Incorrect input file!");
            throw new SweetBuilderException("Incorrect input file!");
        }
        return gift;
    }
}