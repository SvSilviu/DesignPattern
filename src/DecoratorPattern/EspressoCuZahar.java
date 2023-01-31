package DecoratorPattern;

public abstract class EspressoCuZahar extends Espresso {

    protected Bautura bautura;

    public EspressoCuZahar(Bautura bautura) {
        this.bautura = bautura;
    }

    @Override
    public double cost(){
        return 2;
    }
    @Override
    public String descriere(){
        return "espresso simplu cu zahar";
    }

}
