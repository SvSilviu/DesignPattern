package CommandPattern.remote;

public class Lumina {
    String locatie = "";

    public Lumina(String locatie) {
        this.locatie = locatie;
    }

    public void on() {
        System.out.println(locatie + " lumina e aprinsa");
    }

    public void off() {
        System.out.println(locatie + " lumina e stinsa");
    }
}
