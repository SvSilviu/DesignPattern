package CommandPattern.Ex2;

public class LuminaOpritaCommand implements Command {
    Lumina lumina;

    public LuminaOpritaCommand(Lumina lumina) {
        this.lumina = lumina;
    }

    public void execute() {
        lumina.off();
    }
}
