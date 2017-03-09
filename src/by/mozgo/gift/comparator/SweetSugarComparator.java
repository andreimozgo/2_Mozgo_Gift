package by.mozgo.gift.comparator;

import by.mozgo.gift.entity.AbstractSweet;

import java.util.Collections;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetSugarComparator extends SweetComparator {

    public SweetSugarComparator(){
        this.comparator = this;
    }

    @Override
    public int compare(AbstractSweet sweet1, AbstractSweet sweet2) {
        return sweet1.getSugar() - sweet2.getSugar();
    }

    @Override
    public void sort(List<AbstractSweet> sweets) {
        Collections.sort(sweets, this);
    }
}
