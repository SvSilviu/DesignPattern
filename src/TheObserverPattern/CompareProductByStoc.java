package TheObserverPattern.TheObserverPattern;

import java.util.Comparator;

public class CompareProductByStoc implements Comparator<Produs> {

    @Override
    public int compare(Produs o1, Produs o2) {

        return Integer.compare(o1.getCantitate(), o2.getCantitate());
    }
}
