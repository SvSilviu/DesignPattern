package TheObserverPattern.TheObserverPatternEx2;

public class StiriOnline implements StiriObserver {

    private int total = 0;
    Stiri stiri = new Stiri();

    @Override
    public void update(Stiri stiri) {
        System.out.println("Stirea online este " + stiri.getTitlu());
        System.out.println("Subiect " + stiri.getContinut());

    }

    @Override
    public void afisare() {

        System.out.println("Numarul de stiri noi este ");
        total += stiri.getNumarStiri();
    }
}
