package by.mozgo.gift.comparator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetChain {
    private final List<SweetComparator> comparators = new ArrayList();

    public SweetChain(List<SweetComparator> comparators) {
        this.comparators.addAll(comparators);
    }

    public List getComparators() {
        return comparators;
    }
}