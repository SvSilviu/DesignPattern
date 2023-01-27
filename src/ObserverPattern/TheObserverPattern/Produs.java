package ObserverPattern.TheObserverPattern.TheObserverPattern;

public class Produs implements Comparable<Produs> {

    private String name;
    private int pret;
    private int cantitate;

    public Produs(String name, int pret, int cantitate) {
        this.name = name;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "name='" + name + '\'' +
                ", pret='" + pret + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Produs produs = (Produs) object;
        return this.pret == produs.pret && this.name.equals(produs.name);
    }

    @Override
    public int compareTo(Produs o) {

        return Integer.compare(this.pret, o.pret);
    }

}
