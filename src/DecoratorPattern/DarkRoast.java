package DecoratorPattern;

public class DarkRoast extends Beverage {

    public DarkRoast() {

        descriere = "Dark Roast Coffee";

    }

    @Override
    public double cost() {
        return .99;
    }
}
