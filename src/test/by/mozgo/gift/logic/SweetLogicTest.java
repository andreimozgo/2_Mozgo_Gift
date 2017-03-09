package test.by.mozgo.gift.logic;

import by.mozgo.gift.entity.*;
import by.mozgo.gift.logic.SweetLogic;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Andrei Mozgo
 */
public class SweetLogicTest {
    private static Candy firstSweet;
    private static Marshmallow secondSweet;
    private static Cookie thirdSweet;
    private static List<AbstractSweet> sweets;

    @BeforeClass
    public static void initSweets(){
        firstSweet = new Candy("RedHat", 0.05f, 20, 5, CandyType.CHOCOLATE);
        secondSweet = new Marshmallow("RedPischevik", 2.20f, 180, 80, MarshmallowColor.ROSE);
        thirdSweet = new Cookie("ForTea", 1f, 200,50, CookieForm.SQUARE);
    }

    @Before
    public void initList() {
        sweets = new ArrayList<>();
        sweets.add(firstSweet);
        sweets.add(secondSweet);
        sweets.add(thirdSweet);
    }

    @After
    public void destroyList() {
        sweets = null;
    }

    @Test
    public void testCalculateWeight(){
        int totalWeight = firstSweet.getWeight() + secondSweet.getWeight() + thirdSweet.getWeight();
        int calculatedWeight = new SweetLogic().calculateWeight(sweets);
        assertEquals(totalWeight,calculatedWeight);
    }

    @Test
    public void testGetSweetBySugar(){
        int minSugar = 40;
        int maxSugar = 80;
        List<AbstractSweet> requestedSweets = new SweetLogic().getSweetBySugar(sweets, minSugar, maxSugar);
        sweets.remove(firstSweet);
        assertEquals(sweets, requestedSweets);
    }
}
