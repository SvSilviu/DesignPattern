package TheDecoratorPattern;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        descriere = "House Blend Cofee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
