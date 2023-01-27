package TheObserverPattern.TheObserverPattern;

public class SumaTotala implements CartSubject {

    private int total = 0;

    @Override
    public void update(Produs produs) {

        total += produs.getPret();
    }

    @Override
    public void afisare() {
        System.out.println("Pretul total al comenzii este " + total);
    }
}
