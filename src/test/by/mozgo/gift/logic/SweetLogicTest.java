package test.by.mozgo.gift.logic;

import by.mozgo.gift.entity.*;
import by.mozgo.gift.logic.SweetLogic;
import by.mozgo.gift.sort.SweetWeightComparator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Andrei Mozgo
 */
public class SweetLogicTest {
    @Test
    public void testCalculateWeight(){
        Candy firstSweet = new Candy("RedHat", 0.05f, 20, 5, CandyType.CHOCOLATE);
        Marshmallow secondCandy = new Marshmallow("RedPischevik", 2.20f, 180, 80, MarshmallowColor.ROSE);
        List<AbstractSweet> sweets = new ArrayList<>();
        sweets.add(firstSweet);
        sweets.add(secondCandy);
        int totalWeight = new SweetLogic().calculateWeight(sweets);
        assertEquals(200,totalWeight);
    }

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

    @Test
    public void testGetSweetBySugar(){
        Marshmallow firstSweet = new Marshmallow("RedPischevik", 2.20f, 180, 80, MarshmallowColor.ROSE);
        Candy secondSweet = new Candy("RedHat", 0.05f, 20, 5, CandyType.CHOCOLATE);
        Cookie thirdSweet = new Cookie("ForTea", 1f, 200,50, CookieForm.SQUARE);
        List<AbstractSweet> sweets = new ArrayList<>();
        sweets.add(firstSweet);
        sweets.add(secondSweet);
        sweets.add(thirdSweet);
        int minSugar = 40;
        int maxSugar = 80;
        List<AbstractSweet> requestedSweets = new SweetLogic().getSweetBySugar(sweets, minSugar, maxSugar);
        sweets.remove(secondSweet);
        assertEquals(sweets, requestedSweets);
    }
}
