package CommandPattern.Ex2;

public class LuminaAprinsaCommand implements Command {

    Lumina lumina;

    public LuminaAprinsaCommand(Lumina lumina) {
        this.lumina = lumina;
    }

    public void execute() {
        lumina.on();
    }
}
