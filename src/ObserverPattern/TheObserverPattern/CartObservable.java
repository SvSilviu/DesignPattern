package ObserverPattern.TheObserverPattern.TheObserverPattern;

public interface CartObservable {

    void adaugareProdus(Produs produs);

    void subscribe(CartSubject cartSubject);

}
