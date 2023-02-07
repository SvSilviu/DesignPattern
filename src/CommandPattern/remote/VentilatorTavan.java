package CommandPattern.remote;

public class VentilatorTavan {

    String locatie = "";
    int nivel;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public VentilatorTavan(String locatie) {
        this.locatie = locatie;

    }

    public void high() {
        nivel = HIGH;
        System.out.println(locatie + " nivelul este pe High");
    }

    public void medium() {
        nivel = MEDIUM;
        System.out.println(locatie + " nivelul este pe Mediu");
    }

    public void low() {
        nivel = LOW;
        System.out.println(locatie + " nivelul este pe Low");
    }

    public void off() {
        nivel = 0;
        System.out.println(locatie + " ventilator inchis");
    }

    public int getSpeed() {
        return nivel;
    }
}
