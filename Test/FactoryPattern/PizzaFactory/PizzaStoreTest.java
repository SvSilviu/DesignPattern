package FactoryPattern.PizzaFactory;

import org.junit.jupiter.api.Test;

class PizzaStoreTest {
    @Test
    public void test() {

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("Cheese");
        System.out.println("Ati comandat " + pizza.getNume() + "\n");
        System.out.println(pizza);

//        pizza = store.orderPizza("Pepperoni");
//        System.out.println("Ati comandat "+pizza.getNume()+"\n");
//        System.out.println(pizza);

    }

}