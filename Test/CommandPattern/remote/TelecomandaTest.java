package CommandPattern.remote;

import org.junit.jupiter.api.Test;

class TelecomandaTest {
    @Test
    void telecomandaTest(){

        Telecomanda telecomanda = new Telecomanda();

        Lumina luminaLiving = new Lumina("Living - ");
        Lumina luminaBucatarie = new Lumina("Bucatarie - ");
        VentilatorTavan ventilatorTavan = new VentilatorTavan("Living - ");
        UsaGaraj usaGaraj = new UsaGaraj("Garaj - ");

        telecomanda.setCommand(1,luminaLiving::on,luminaLiving::off);
        telecomanda.setCommand(2,luminaBucatarie::on,luminaBucatarie::off);
        telecomanda.setCommand(3,ventilatorTavan::high,ventilatorTavan::off);

        telecomanda.setCommand(4,usaGaraj::sus,usaGaraj::jos);

        System.out.println(telecomanda);

        telecomanda.onButtonWasPushed(1);
        telecomanda.offButtonWasPushed(1);
        telecomanda.onButtonWasPushed(2);
        telecomanda.offButtonWasPushed(2);
        telecomanda.onButtonWasPushed(3);
        telecomanda.offButtonWasPushed(3);
        telecomanda.onButtonWasPushed(4);
        telecomanda.offButtonWasPushed(4);

    }

}