package CommandPattern.Ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelecomandaTest {
    @Test
    void test(){

        Telecomanda telecomanda = new Telecomanda();
        Lumina lumina = new Lumina();
        UsaGarajului usaGarajului = new UsaGarajului();
        LuminaAprinsaCommand luminaAprinsa = new LuminaAprinsaCommand(lumina);
        UsaGarajuluiComanda garajDeschis = new UsaGarajuluiComanda(usaGarajului);

        telecomanda.setCommand(luminaAprinsa);
        telecomanda.butonApasat();
        telecomanda.setCommand(garajDeschis);
        telecomanda.butonApasat();

    }

}