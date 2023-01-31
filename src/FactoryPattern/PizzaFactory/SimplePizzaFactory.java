package FactoryPattern.PizzaFactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String tip) {
        Pizza pizza = null;

        if (tip.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if (tip.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (tip.equals("Clam")) {
            pizza = new ClamPizza();
        }
        return pizza;

    }

}
