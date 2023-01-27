package ObserverPattern.TheObserverPattern.TheObserverPatternEx2;

import java.util.Comparator;

public class CompareStiriByTitleLenght implements Comparator<Stiri> {

    @Override
    public int compare(Stiri o1, Stiri o2) {

        return Integer.compare(o1.getTitlu().length(), o2.getTitlu().length());
    }
}
