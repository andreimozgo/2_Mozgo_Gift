package by.mozgo.gift.logic;

import by.mozgo.gift.entity.AbstractSweet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Andrei Mozgo
 */
public class SweetLogic {
    public int calculateWeight(List<AbstractSweet> sweets) {
        int totalWeight = 0;
        for (AbstractSweet sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    public void sortSweetsByWeight(List<AbstractSweet> sweets, Comparator<AbstractSweet> comparator){
        sweets.sort(comparator);
    }

    public List<AbstractSweet> getSweetBySugar(List<AbstractSweet> sweets, int minSugar, int maxSugar){
        List<AbstractSweet> requestedSweets = new ArrayList<>();
        for(AbstractSweet sweet: sweets){
            if (sweet.getSugar()>=minSugar && sweet.getSugar()<= maxSugar){
                requestedSweets.add(sweet);
            }
        }
        return requestedSweets;
    }
}
