package by.mozgo.gift.comparator;

import by.mozgo.gift.entity.AbstractSweet;

import java.util.Comparator;

/**
 * @author Andrei Mozgo
 */
public class SweetSugarComparator implements Comparator<AbstractSweet> {

    @Override
    public int compare(AbstractSweet sweet1, AbstractSweet sweet2) {
        return sweet1.getSugar() - sweet2.getSugar();
    }
}
