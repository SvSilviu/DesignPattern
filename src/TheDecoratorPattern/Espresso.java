package TheDecoratorPattern;

public class Espresso extends Beverage {

    public Espresso() {
        descriere = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
