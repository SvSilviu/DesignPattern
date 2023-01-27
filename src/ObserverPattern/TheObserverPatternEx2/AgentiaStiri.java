package ObserverPattern.TheObserverPattern.TheObserverPatternEx2;

import java.util.ArrayList;

public class AgentiaStiri implements SursaStiri {
    private ArrayList<StiriObserver> listaAbonati = new ArrayList<>();

    public void adaugareAbonati(StiriObserver abonat) {
        listaAbonati.add(abonat);
    }

    public void eliminareAbonat(StiriObserver abonat) {
        listaAbonati.remove(abonat);
    }

    public void trimitereStiri(Stiri stiri) {
        for (StiriObserver abonat : listaAbonati) {
            abonat.update(stiri);
        }
    }

    @Override
    public void adaugareStiri(Stiri stiri) {
        this.listaAbonati.add((StiriObserver) stiri);
    }
}
