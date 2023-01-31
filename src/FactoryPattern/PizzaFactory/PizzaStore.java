package FactoryPattern.PizzaFactory;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String tip) {

        Pizza pizza;
        pizza = factory.createPizza(tip);

        pizza.prepara();
        pizza.coacere();
        pizza.taiere();
        pizza.impachetare();

        return pizza;
    }

}
