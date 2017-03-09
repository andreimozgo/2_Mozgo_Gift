package test.by.mozgo.gift.comparator;

import by.mozgo.gift.comparator.SweetChain;
import by.mozgo.gift.comparator.SweetComparator;
import by.mozgo.gift.comparator.SweetSugarComparator;
import by.mozgo.gift.comparator.SweetWeightComparator;
import by.mozgo.gift.entity.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetChainTest {
    @Test
    public void testChain() {
        Marshmallow firstSweet = new Marshmallow("RedPischevik", 2.20f, 180, 80, MarshmallowColor.ROSE);
        Candy secondSweet = new Candy("RedHat", 0.05f, 20, 5, CandyType.CHOCOLATE);
        Cookie thirdSweet = new Cookie("ForTea", 1f, 200,50, CookieForm.SQUARE);
        List<AbstractSweet> sortedByChainSweets = new ArrayList<>();
        sortedByChainSweets.add(firstSweet);
        sortedByChainSweets.add(secondSweet);
        sortedByChainSweets.add(thirdSweet);
        List<AbstractSweet> sortedManuallySweets = new ArrayList<>();
        sortedManuallySweets.add(secondSweet);
        sortedManuallySweets.add(firstSweet);
        sortedManuallySweets.add(thirdSweet);
        SweetSugarComparator firstComparator = new SweetSugarComparator();
        SweetWeightComparator secondComparator = new SweetWeightComparator();
        firstComparator.setNext(secondComparator);
        List<SweetComparator> comparators = new ArrayList<>();
        comparators.add(firstComparator);
        comparators.add(secondComparator);
        SweetChain chain = new SweetChain(comparators);
        firstComparator.build(sortedByChainSweets,chain);
        Assert.assertEquals(sortedManuallySweets, sortedByChainSweets);
    }
}
