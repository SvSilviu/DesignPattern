package FactoryPattern.PizzaFactory;

public class PepperoniPizza extends Pizza{

    public PepperoniPizza(){
        nume = "Pepperoni Pizza";
        coca = "Crusta";
        sos = "Marinara Sos";
        topping.add("Felii de pepperoni");
        topping.add("Felii de ceapa");
        topping.add("Branza rasa");
    }
}
