package CommandPattern.remote;

public class TV {
    String locatie;
    int canal;

    public TV(String locatie) {
        this.locatie = locatie;
    }

    public void on() {
        System.out.println("TV e aprins");
    }

    public void off() {
        System.out.println("Tv e stins");
    }

    public void setCanal() {
        this.canal = 3;
        System.out.println("Sunteti pe canalul ProTV");
    }
}
