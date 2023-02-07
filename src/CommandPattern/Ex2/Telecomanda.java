package CommandPattern.Ex2;

public class Telecomanda {
    Command slot;

    public Telecomanda(){

    }

    public void setCommand(Command command){
        slot = command;
    }

    public void butonApasat(){
        slot.execute();
    }
}
