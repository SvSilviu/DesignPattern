package FactoryPattern.PizzaFactory;

public class ClamPizza extends Pizza{

    public ClamPizza() {
        nume = "Clam Pizza";
        coca = "Crusta subtire";
        sos = "Sos de usturoi";
        topping.add("Clams");
        topping.add("Branza rasa");
    }
}
