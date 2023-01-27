package ObserverPattern.TheObserverPattern.TheObserverPattern;

import java.util.ArrayList;

public class Deposit implements CartSubject {

    ArrayList<Produs> produses;

    public Deposit(ArrayList<Produs> produses) {
        this.produses = produses;
    }

    @Override
    public void update(Produs produs) {

        int pozitie = 0;

        for (int i = 0; i < produses.size(); i++) {

            if (produses.get(i).getName().equals(produs.getName())) {

                pozitie = i;
            }
        }
        produses.get(pozitie).setCantitate(produs.getCantitate() - 1);
    }

    @Override
    public void afisare() {

        for (Produs produs : produses) {

            System.out.println(produs);
        }
    }
}
