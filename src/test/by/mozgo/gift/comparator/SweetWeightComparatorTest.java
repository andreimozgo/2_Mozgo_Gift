package test.by.mozgo.gift.comparator;

import by.mozgo.gift.comparator.SweetSugarComparator;
import by.mozgo.gift.comparator.SweetWeightComparator;
import by.mozgo.gift.entity.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Andrei Mozgo
 */
public class SweetWeightComparatorTest {
    private static Marshmallow firstSweet;
    private static Candy secondSweet;
    private List<AbstractSweet> sweets;

    @BeforeClass
    public static void initSweets() {
         firstSweet = new Marshmallow("RedPischevik", 2.20f, 180, 80, MarshmallowColor.ROSE);
         secondSweet = new Candy("RedHat", 0.05f, 20, 5, CandyType.CHOCOLATE);
    }

    @AfterClass
    public static void destroySweets(){
        firstSweet = null;
        secondSweet = null;
    }

    @Before
    public void initList(){
        sweets = new ArrayList<>();
    }

    @After
    public void destroyList(){
        sweets = null;
    }

    @Test
    public void testSortByWeight() {
        sweets.add(firstSweet);
        sweets.add(secondSweet);
        Collections.sort(sweets, new SweetWeightComparator());
        assertEquals(firstSweet.getWeight(), sweets.get(1).getWeight());
    }

    @Test
    public void testSortBySugar() {
        sweets.add(firstSweet);
        sweets.add(secondSweet);
        Collections.sort(sweets, new SweetSugarComparator());
        assertEquals(firstSweet.getSugar(), sweets.get(1).getSugar());
    }
}
