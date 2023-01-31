package DecoratorPattern;

public class Espresso implements Bautura {


    @Override
    public String descriere() {
       return  "Eu sunt espresso simplu";
    }

    @Override
    public double cost() {
        return 1.5;

    }
}
