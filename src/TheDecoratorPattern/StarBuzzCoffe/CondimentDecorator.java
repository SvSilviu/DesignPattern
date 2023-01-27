package TheDecoratorPattern.StarBuzzCoffe;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}
