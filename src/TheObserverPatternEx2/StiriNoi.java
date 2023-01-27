package TheObserverPattern.TheObserverPatternEx2;

import java.util.ArrayList;

public class StiriNoi implements StiriObserver {

    ArrayList<Stiri> listaStiri;

    public StiriNoi(ArrayList<Stiri> listaStiri) {
        this.listaStiri = listaStiri;
    }

    @Override
    public void update(Stiri stiri) {
        System.out.println("Noua stire este " + stiri.getTitlu());
        System.out.println("Subiect " + stiri.getContinut());
    }

    @Override
    public void afisare() {
        for (Stiri stiri : listaStiri) {
            System.out.println(stiri);
        }
    }

    @Override
    public String toString() {
        return "StiriNoi{" +
                "listaStiri=" + listaStiri +
                '}';
    }
}
