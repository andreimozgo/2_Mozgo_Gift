package by.mozgo.gift.comparator;

import by.mozgo.gift.entity.AbstractSweet;

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

    public abstract void sort(List<AbstractSweet> sweets);

    public void build(List<AbstractSweet> sweets, SweetChain chain) {
        if (chain.getComparators().contains(comparator)) {
            sort(sweets);
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