package test.by.mozgo.gift.builder;

import by.mozgo.gift.builder.SweetBuilder;
import by.mozgo.gift.entity.AbstractSweet;
import by.mozgo.gift.entity.Candy;
import by.mozgo.gift.entity.CandyType;
import by.mozgo.gift.exception.SweetBuilderException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetBuilderTest {
    @Test
    public void TestGenerateSweets() throws SweetBuilderException {
        List<String> lines = new ArrayList<>();
        lines.add("candy RedHat 0.05 20 5 CHOCOLATE");
        Candy candy = new Candy("RedHat", 0.05f, 20, 5, CandyType.CHOCOLATE);
        List<AbstractSweet> sweets = new ArrayList<>();
        sweets.add(candy);
        List<AbstractSweet> generatedSweets = SweetBuilder.generateSweets(lines);
        Assert.assertEquals(sweets, generatedSweets);
    }

    @Test(expected = SweetBuilderException.class)
    public void TestGenerateTrianglesException() throws SweetBuilderException {
        List<String> lines = new ArrayList<>();
        lines.add("1 2 w 3 5 6");
        SweetBuilder.generateSweets(lines);
    }
}
