package by.mozgo.gift.comparator;

import by.mozgo.gift.entity.AbstractSweet;

/**
 * @author Andrei Mozgo
 */
public class SweetWeightComparator extends SweetComparator {

    public SweetWeightComparator(){
        this.comparator = this;
    }

    @Override
    public int compare(AbstractSweet sweet1, AbstractSweet sweet2) {
        return sweet1.getWeight()-sweet2.getWeight();
    }
}
