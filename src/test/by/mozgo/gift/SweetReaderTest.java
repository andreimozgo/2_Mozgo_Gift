package test.by.mozgo.gift;

import by.mozgo.gift.exception.SweetReaderException;
import by.mozgo.gift.reader.SweetReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetReaderTest {
    @Test
    public void testFileReader() throws SweetReaderException {
        String filename = "data/input.txt";
        List<String> lines = SweetReader.readData(filename);
        boolean fileNotEmpty = lines.size() > 0;
        Assert.assertTrue(fileNotEmpty);
    }

    @Test(expected = SweetReaderException.class)
    public void testFileReaderException() throws SweetReaderException {
        String filename = "";
        SweetReader.readData(filename);
    }
}
