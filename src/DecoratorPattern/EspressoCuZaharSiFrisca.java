package DecoratorPattern;

public class EspressoCuZaharSiFrisca extends EspressoCuZahar{

    public EspressoCuZaharSiFrisca(Bautura bautura) {
        super(bautura);
    }

    @Override
    public String descriere() {
        return "Espresso cu zahar si frisca";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
