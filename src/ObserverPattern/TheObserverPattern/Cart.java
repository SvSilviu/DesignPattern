package ObserverPattern.TheObserverPattern.TheObserverPattern;

import java.util.ArrayList;

public class Cart implements CartObservable {

    private ArrayList<CartSubject> cartSubjects;
    private ArrayList<Produs> produses;

    public Cart() {

        this.cartSubjects = new ArrayList<>();
        this.produses = new ArrayList<>();
    }

    @Override
    public void adaugareProdus(Produs produs) {

        this.produses.add(produs);
        for (CartSubject cartSubject : cartSubjects) {

            cartSubject.update(produs);
        }
    }

    @Override
    public void subscribe(CartSubject cartSubject) {

        this.cartSubjects.add(cartSubject);
    }
}
