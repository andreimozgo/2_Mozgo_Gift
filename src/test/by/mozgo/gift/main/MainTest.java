package test.by.mozgo.gift.main;

import by.mozgo.gift.builder.SweetBuilder;
import by.mozgo.gift.comparator.SweetWeightComparator;
import by.mozgo.gift.entity.AbstractSweet;
import by.mozgo.gift.exception.SweetBuilderException;
import by.mozgo.gift.exception.SweetReaderException;
import by.mozgo.gift.logic.SweetLogic;
import by.mozgo.gift.reader.SweetReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class MainTest {
    private static final Logger LOGGER = LogManager.getLogger();

    @Test
    public void imitateRunProgram() throws SweetReaderException {
        String filename = "data/input.txt";
        List<String> lines = null;
        lines = SweetReader.readData(filename);
        List<AbstractSweet> gift = null;
        try {
            gift = SweetBuilder.generateSweets(lines);
        } catch (SweetBuilderException e) {
            LOGGER.log(Level.ERROR, e);
        }
        int totalWeight = new SweetLogic().calculateWeight(gift);
        Collections.sort(gift, new SweetWeightComparator());
        int minSugar = 40;
        int maxSugar = 80;
        List<AbstractSweet> requestedSweets = new SweetLogic().getSweetBySugar(gift, minSugar, maxSugar);
    }
}
