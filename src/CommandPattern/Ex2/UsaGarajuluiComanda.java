package CommandPattern.Ex2;

public class UsaGarajuluiComanda implements Command {

    UsaGarajului usaGarajului;

    public UsaGarajuluiComanda(UsaGarajului usaGarajului) {
        this.usaGarajului = usaGarajului;
    }

    public void execute() {
        usaGarajului.sus();
    }

}
