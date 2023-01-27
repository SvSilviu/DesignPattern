package ObserverPattern.TheObserverPattern.TheObserverPatternEx2;

public class Stiri implements Comparable<Stiri> {

    private String titlu;
    private String continut;
    private int numarStiri;


    public Stiri(String titlu, String continut, int numarStiri) {
        this.titlu = titlu;
        this.continut = continut;
        this.numarStiri = numarStiri;
    }

    public Stiri() {

    }

    public int getNumarStiri() {
        return numarStiri;
    }

    public void setNumarStiri(int numarStiri) {
        this.numarStiri = numarStiri;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    @Override
    public String toString() {
        return "Stiri{" +
                "titlu='" + titlu + '\'' +
                ", continut='" + continut + '\'' +
                ", numarStiri=" + numarStiri +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Stiri stiri = (Stiri) object;
        return this.titlu.equals(stiri.titlu) && this.continut.equals(stiri.continut);
    }

    @Override
    public int compareTo(Stiri stiri) {
        return Integer.compare(this.numarStiri, stiri.numarStiri);
    }

}
