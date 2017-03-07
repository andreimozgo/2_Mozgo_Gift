package test.by.mozgo.gift.main;

import by.mozgo.gift.builder.SweetBuilder;
import by.mozgo.gift.entity.AbstractSweet;
import by.mozgo.gift.exception.SweetBuilderException;
import by.mozgo.gift.exception.SweetReaderException;
import by.mozgo.gift.logic.SweetLogic;
import by.mozgo.gift.reader.SweetReader;
import by.mozgo.gift.comparator.SweetWeightComparator;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class MainTest {
    @Test
    public void imitateRunProgram() throws SweetReaderException, SweetBuilderException {
        String filename = "data/input.txt";
        List<String> lines = SweetReader.readData(filename);
        List<AbstractSweet> gift = SweetBuilder.generateSweets(lines);
        int totalWeight = new SweetLogic().calculateWeight(gift);
        Collections.sort(gift, new SweetWeightComparator());
        int minSugar = 40;
        int maxSugar = 80;
        List<AbstractSweet> requestedSweets = new SweetLogic().getSweetBySugar(gift, minSugar, maxSugar);
    }
}
