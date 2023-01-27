package TheDecoratorPattern;

public class Decaf extends Beverage {

    public Decaf() {

        descriere = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}
