package by.mozgo.gift.comparator;

import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetChain {
    private final List<SweetComparator> comparators;

    public SweetChain(List<SweetComparator> comparators) {
        this.comparators = comparators;
    }

    public List getComparators() {
        return comparators;
    }
}