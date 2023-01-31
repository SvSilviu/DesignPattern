package FactoryPattern.PizzaFactory;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        nume = "Cheese Pizza";
        coca = "Crusta simpla";
        sos = "Marinara Pizza Sos";
        topping.add("Fresh Mozzarella");
        topping.add("Parmesan");

    }
}
