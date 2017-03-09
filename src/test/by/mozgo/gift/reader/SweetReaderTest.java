package test.by.mozgo.gift.reader;

import by.mozgo.gift.reader.SweetReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetReaderTest {
    @Test
    public void testFileReader() {
        String filename = "data/input.txt";
        List<String> lines = SweetReader.readData(filename);
        boolean fileNotEmpty = lines.size() > 0;
        Assert.assertTrue(fileNotEmpty);
    }

    @Test(expected = RuntimeException.class)
    public void testFileReaderException() {
        String filename = "";
        SweetReader.readData(filename);
    }
}
