package DecoratorPattern;

import org.junit.jupiter.api.Test;

class CafeaTest {

    @Test
    public void test() {

        Espresso espresso = new Espresso();
        Bautura bautura = new EspressoCuZaharSiFrisca(espresso);
        System.out.println(bautura.cost());
        System.out.println(bautura.descriere());

    }

}

