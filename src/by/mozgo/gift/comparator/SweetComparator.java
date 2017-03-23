package by.mozgo.gift.comparator;

import by.mozgo.gift.entity.AbstractSweet;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public abstract class SweetComparator implements Comparator<AbstractSweet> {
    protected SweetComparator nextComparator;
    protected Comparator comparator;

    public SweetComparator() {
        this.comparator = this;
    }

    public void build(List<AbstractSweet> sweets, SweetChain chain) {
        if (chain.getComparators().contains(comparator)) {
            Collections.sort(sweets, this);

        }
        if (nextComparator != null) {
            nextComparator.build(sweets, chain);
        }
    }

    public SweetComparator setNext(SweetComparator comparator) {
        nextComparator = comparator;
        return comparator;
    }
}