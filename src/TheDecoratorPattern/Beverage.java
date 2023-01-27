package TheDecoratorPattern;

public abstract class Beverage {

    String descriere = "Most Excellent Dark Roast";

    public String getDescriere() {
        return descriere;
    }

    public abstract double cost();
}




