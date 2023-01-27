package TheObserverPattern.TheObserverPattern;

import java.util.Comparator;

public class CompareProductByLenghtName implements Comparator<Produs> {

    @Override
    public int compare(Produs o1, Produs o2) {

        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}
