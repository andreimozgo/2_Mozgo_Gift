package test.by.mozgo.gift.suit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.by.mozgo.gift.builder.SweetBuilderTest;
import test.by.mozgo.gift.logic.SweetLogicTest;
import test.by.mozgo.gift.reader.SweetReaderTest;

/**
 * @author Andrei Mozgo
 */
@Suite.SuiteClasses({SweetReaderTest.class, SweetBuilderTest.class,
        SweetLogicTest.class})
@RunWith(Suite.class)
public class SweetTestSuite {
}
