package CommandPattern.remote;

public class Jacuzzi {

    boolean on;
    int temperatura;

    public Jacuzzi() {

    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void spumaOn() {
        if (on) {
            System.out.println("Jacuzzi are clabuci");
        }
    }

    public void spumaOff() {
        if (on) {
            System.out.println("Jacuzzi nu are clabuci");
        }
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void caldura() {
        temperatura = 60;
        System.out.println("Jacuzzi se incalzeste pana la 60 de grade");
    }

    public void racire() {
        temperatura = 40;
        System.out.println("Jacuzii se raceste pana la 40 de gradea");
    }

}
