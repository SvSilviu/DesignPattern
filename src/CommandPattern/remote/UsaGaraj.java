package CommandPattern.remote;

public class UsaGaraj {
    String locatie;

    public UsaGaraj(String locatie) {
        this.locatie = locatie;
    }

    public void sus() {
        System.out.println(locatie + " usa garajului e sus");
    }

    public void jos() {
        System.out.println(locatie + " usa garajului e jos");
    }

    public void stop() {
        System.out.println(locatie + " usa garajului e oprita");
    }

    public void aprindeLumina() {
        System.out.println(locatie + " lumina e aprinsa");
    }

    public void stingeLumina() {
        System.out.println(locatie + " lumina garajului e stinsa");
    }
}
