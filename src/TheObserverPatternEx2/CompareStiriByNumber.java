package TheObserverPattern.TheObserverPatternEx2;

import java.util.Comparator;

public class CompareStiriByNumber implements Comparator<Stiri> {

    @Override
    public int compare(Stiri o1,Stiri o2){
        return Integer.compare(o1.getNumarStiri(),o2.getNumarStiri());
    }
}
