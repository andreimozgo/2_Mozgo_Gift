package by.mozgo.gift.reader;

import by.mozgo.gift.exception.SweetReaderException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetReader {
    private static final Logger LOGGER = LogManager.getLogger();

    public static List<String> readData(String filename) throws SweetReaderException {
        if (filename == null) {
            LOGGER.log(Level.FATAL, "Input file name = null!");
            throw new SweetReaderException("Input file name = null!");
        }
        List<String> lines = new ArrayList<>();
        File inputFile = new File(filename);
        try {
            BufferedReader in = new BufferedReader(new FileReader(inputFile));
            String s;
            while ((s = in.readLine()) != null) {
                lines.add(s);
            }
            in.close();
        } catch (IOException e) {
            LOGGER.log(Level.FATAL, "Input file not found!");
            throw new SweetReaderException("Input file not found!");
        }
        if (lines.size() == 0) {
            LOGGER.log(Level.FATAL, "Input file empty! ");
            throw new SweetReaderException("Input file empty! ");
        }
        return lines;
    }
}
