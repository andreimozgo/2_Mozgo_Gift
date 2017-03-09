package test.by.mozgo.gift.comparator;

import by.mozgo.gift.comparator.SweetWeightComparator;
import by.mozgo.gift.entity.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Andrei Mozgo
 */
public class SweetWeightComparatorTest {
    @Test
    public void testSortByWeight(){
        Marshmallow firstSweet = new Marshmallow("RedPischevik", 2.20f, 180, 80, MarshmallowColor.ROSE);
        Candy secondSweet = new Candy("RedHat", 0.05f, 20, 5, CandyType.CHOCOLATE);
        List<AbstractSweet> sweets = new ArrayList<>();
        sweets.add(firstSweet);
        sweets.add(secondSweet);
        Collections.sort(sweets, new SweetWeightComparator());
        assertEquals(180,sweets.get(1).getWeight());
    }
}
