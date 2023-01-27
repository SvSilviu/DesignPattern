package TheObserverPattern.TheObserverPatternEx2;

import java.util.Comparator;

public class CompareByContinut implements Comparator<Stiri> {

    @Override
    public int compare(Stiri o1, Stiri o2) {

        return o1.compareTo(o2);

    }
}