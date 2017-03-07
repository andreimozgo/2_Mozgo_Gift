package by.mozgo.gift.logic;

import by.mozgo.gift.entity.AbstractSweet;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetLogic {
    private static final Logger LOGGER = LogManager.getLogger();

    public int calculateWeight(List<AbstractSweet> sweets) {
        int totalWeight = 0;
        for (AbstractSweet sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        LOGGER.log(Level.INFO, "Total gift weight = " + totalWeight);
        return totalWeight;
    }

    public List<AbstractSweet> getSweetBySugar(List<AbstractSweet> sweets, int minSugar, int maxSugar) {
        List<AbstractSweet> requestedSweets = new ArrayList<>();
        for (AbstractSweet sweet : sweets) {
            if (sweet.getSugar() >= minSugar && sweet.getSugar() <= maxSugar) {
                requestedSweets.add(sweet);
            }
        }
        return requestedSweets;
    }
}
