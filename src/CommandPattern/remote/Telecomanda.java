package CommandPattern.remote;

public class Telecomanda {
    Command[] onCommands;
    Command[] offCommands;

    public Telecomanda() {
        offCommands = new Command[7];
        onCommands = new Command[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = () -> {
            };
            offCommands[i] = () -> {
            };
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----Telecomanda----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
